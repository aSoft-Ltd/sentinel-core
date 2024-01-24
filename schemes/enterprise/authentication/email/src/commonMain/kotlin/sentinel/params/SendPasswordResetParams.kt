@file:JsExport

package sentinel.params

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SendPasswordResetParams(
    val email: String,
    val link: String,
    val meta: String
)