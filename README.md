# Serverless Template - AWS Lambda Kotlin

A Serverless Framework template for AWS Lambda using Kotlin and the Gradle Kotlin DSL.

## Table of Contents

- [Overview](#markdown-header-overview)
- [Getting Started](#markdown-header-getting-started)
    - [Prerequisites](#markdown-header-prerequisites)
    - [Installation](#markdown-header-installation)
- [Built With](#markdown-header-built-with)
- [Issue Tracking](#markdown-header-issue-tracking)
    - [Recommended Reading](#markdown-header-recommended-reading)
- [Acknowledgments](#markdown-header-acknowledgments)

## Overview

This serverless template provides everything you need to get started with your Kotlin-based AWS Lambda. Features include:

* Test Specification and Mocking Framework
* Lightweight Kotlin logging library
* Updated shadowJar task to run tests on build
* Serverless config files for each environment
* Idiomatic kotlin custom lambda request handler

## Getting Started

### Prerequisites

Follow the instructions to install the [Serverless Framework](https://serverless.com/framework/docs/getting-started/)

### Installation

To install the template `serverless create --template-url https://github.com/crafton/sls-aws-lambda-kotlin-gradlekt`.

## Built With

* [Serverless Framework](https://serverless.com/) - The serverless framework
* [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) - Build system
* [Spek](https://www.spekframework.org/) - Test specification framework
* [Mockk](https://github.com/mockk/mockk) - Mocking library
* [Kotlin Logging](https://github.com/MicroUtils/kotlin-logging) - Lightweight Kotlin logging framework

### Recommended Reading

* [The Serverless Framework](https://serverless.com/framework/docs/)
* [AWS Java Lambda Events](https://github.com/aws/aws-lambda-java-libs/tree/master/aws-lambda-java-events)
* [The Spek Framework - Styles](https://www.spekframework.org/gherkin/)

## Acknowledgments

* Inspired by the Serverless Framework [AWS Kotlin JVM Template](https://github.com/serverless/serverless/tree/master/lib/plugins/create/templates/aws-kotlin-jvm-gradle) template
