@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import koncurrent.Later
import sentinel.params.PasswordResetParams
import kotlinx.JsExport

interface AuthenticationScheme {
    fun resetPassword(params: PasswordResetParams): Later<PasswordResetParams>
}