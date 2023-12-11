@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import kotlinx.JsExport
import sentinel.params.UserAccountParams

interface RegistrationScheme {
    fun createUserAccount(params: UserAccountParams): Later<UserAccountParams>
}