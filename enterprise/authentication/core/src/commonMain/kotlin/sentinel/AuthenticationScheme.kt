@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import sentinel.params.PasswordResetParams
import sentinel.params.SendPasswordResetParams
import sentinel.params.SignInParams
import kotlin.js.JsExport

interface AuthenticationScheme {
    fun signIn(params: SignInParams): Later<UserSession>

    fun resetPassword(params: PasswordResetParams): Later<PasswordResetParams>
}