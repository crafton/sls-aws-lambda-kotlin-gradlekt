plugins {
    kotlin("jvm") version "1.3.71"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "org.crafton"
version = "template"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.amazonaws:aws-lambda-java-core:1.2.0")
    implementation("com.amazonaws:aws-lambda-java-events:2.2.7")
    implementation("com.amazonaws:aws-lambda-java-log4j2:1.1.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.10.+")
    implementation("io.github.microutils:kotlin-logging:1.7.9")
    implementation("org.slf4j:slf4j-simple:1.7.26")

    testImplementation(kotlin("test"))
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.9")
    testImplementation("io.mockk:mockk:1.9.3")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.9")
    testRuntimeOnly(kotlin("reflect"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    test {
        useJUnitPlatform {
            includeEngines.add("spek2")
        }
    }
    shadowJar {
        dependsOn(test)
    }
    build {
        finalizedBy(shadowJar)
    }
}
