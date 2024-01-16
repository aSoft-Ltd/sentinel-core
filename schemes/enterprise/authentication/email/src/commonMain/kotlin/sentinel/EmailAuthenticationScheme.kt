@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import kotlinx.JsExport
import sentinel.params.EmailSignInParams

interface EmailAuthenticationScheme : AuthenticationScheme {
    fun signIn(params: EmailSignInParams): Later<UserSession>
}