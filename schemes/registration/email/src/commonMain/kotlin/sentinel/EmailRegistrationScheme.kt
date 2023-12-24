@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import koncurrent.later.then
import koncurrent.later.andThen
import koncurrent.later.andZip
import koncurrent.later.zip
import koncurrent.later.catch
import kotlinx.JsExport
import sentinel.params.EmailSignUpParams
import sentinel.params.EmailVerificationParams

interface EmailRegistrationScheme : RegistrationScheme {

    fun signUp(params: EmailSignUpParams): Later<EmailSignUpParams>

    fun verify(params: EmailVerificationParams): Later<EmailVerificationParams>
}