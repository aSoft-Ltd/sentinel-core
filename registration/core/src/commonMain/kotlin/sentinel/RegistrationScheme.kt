@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import sentinel.params.SignUpParams
import sentinel.params.UserAccountParams
import sentinel.params.VerificationParams
import kotlinx.JsExport

interface RegistrationScheme {

    fun signUp(params: SignUpParams): Later<SignUpParams>

    fun verify(params: VerificationParams): Later<VerificationParams>

    fun createUserAccount(params: UserAccountParams): Later<UserAccountParams>
}