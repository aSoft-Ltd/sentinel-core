@file:JsExport

package sentinel.params

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class EmailSignUpParams(
    val name: String,
    val email: String
)