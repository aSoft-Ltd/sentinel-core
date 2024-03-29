@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import kotlinx.JsExport
import sentinel.params.PhoneSignUpParams
import sentinel.params.PhoneVerificationParams

interface PhoneRegistrationScheme : RegistrationScheme {

    fun signUp(params: PhoneSignUpParams): Later<PhoneSignUpParams>

    fun verify(params: PhoneVerificationParams): Later<PhoneVerificationParams>

    fun abort(phone: String) : Later<String>
}