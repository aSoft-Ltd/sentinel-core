@file:JsExport
package sentinel.params

import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class PhoneSignUpParams(
    val name: String,
    val phone: String
)