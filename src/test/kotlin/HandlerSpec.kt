import com.amazonaws.services.lambda.runtime.Context
import io.mockk.every
import io.mockk.mockk
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import kotlin.test.assertEquals

object HandlerSpec : Spek({
    Feature("A custom lambda event handler") {

        Scenario("The handler with a string argument") {
            lateinit var handlerOutput: String
            val input = MyEvent(
                id = "my-event-id",
                message = "This is the body of my event."
            )
            val context = mockk<Context>()
            every { context.functionName } returns "my-function-name"

            When("The handleRequest function is called") {
                handlerOutput = handleRequest(input, context)
            }

            Then("It should return 'Success'") {
                assertEquals("Success", handlerOutput)
            }
        }
    }
})
