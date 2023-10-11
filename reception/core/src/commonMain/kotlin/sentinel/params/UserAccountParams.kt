@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel.params

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

/**
 * @param loginId can be a username/email/phone
 */
@Serializable
data class UserAccountParams(
    val loginId: String,
    val password: String,
    val registrationToken: String
)