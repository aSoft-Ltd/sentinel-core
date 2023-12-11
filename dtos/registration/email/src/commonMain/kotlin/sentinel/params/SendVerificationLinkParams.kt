@file:JsExport
package sentinel.params

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SendVerificationLinkParams(
    val email: String,
    val link: String
)