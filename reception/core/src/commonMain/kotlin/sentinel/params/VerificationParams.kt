@file:JsExport

package sentinel.params

import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class VerificationParams(
    val email: String,
    val token: String
)