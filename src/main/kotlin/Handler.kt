import com.amazonaws.services.lambda.runtime.Context
import mu.KotlinLogging

private val logger = KotlinLogging.logger { }

fun handleRequest(input: MyEvent, context: Context): String {
    logger.info { "Received $input after executing ${context.functionName}" }

    return "Success"
}
