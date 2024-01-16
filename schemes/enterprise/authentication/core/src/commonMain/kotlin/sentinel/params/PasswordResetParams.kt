@file:JsExport

package sentinel.params

import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class PasswordResetParams(
    val password: String,
    val passwordResetToken: String? = null
)