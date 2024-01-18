@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import kotlinx.JsExport
import sentinel.params.EmailSignUpParams
import sentinel.params.EmailVerificationParams

interface EmailRegistrationScheme : RegistrationScheme {

    fun signUp(params: EmailSignUpParams): Later<EmailSignUpParams>

    fun verify(params: EmailVerificationParams): Later<EmailVerificationParams>

    /**
     * To abort a registration that has already began but not completed
     */
    fun abort(email: String): Later<String>
}