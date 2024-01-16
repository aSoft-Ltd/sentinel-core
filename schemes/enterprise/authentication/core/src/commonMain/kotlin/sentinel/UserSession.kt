@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package sentinel

import identifier.CorporateDto
import identifier.IndividualDto
import kash.Currency
import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class UserSession(
    val user: IndividualDto,
    val secret: String,
    val company: CorporateDto,
    val currency: Currency,
    val timezone: String,
    val salesTax: Int
)