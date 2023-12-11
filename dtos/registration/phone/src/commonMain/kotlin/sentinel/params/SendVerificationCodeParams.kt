@file:JsExport
package sentinel.params

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SendVerificationCodeParams(
    val phone: String
)