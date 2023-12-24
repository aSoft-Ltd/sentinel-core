@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import koncurrent.later.then
import koncurrent.later.andThen
import koncurrent.later.andZip
import koncurrent.later.zip
import koncurrent.later.catch
import sentinel.params.PasswordResetParams
import sentinel.params.SignInParams
import kotlinx.JsExport

interface AuthenticationScheme {
    fun signIn(params: SignInParams): Later<UserSession>

    fun resetPassword(params: PasswordResetParams): Later<PasswordResetParams>
}