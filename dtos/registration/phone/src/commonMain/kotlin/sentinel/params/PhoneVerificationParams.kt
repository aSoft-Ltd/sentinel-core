@file:JsExport

package sentinel.params

import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class PhoneVerificationParams(
    val phone: String,
    val code: String
)