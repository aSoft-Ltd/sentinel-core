@file:JsExport

package sentinel.params

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SendPasswordResetParams(
    val email: String,
    val link: String,
)