package sentinel

import kotlinx.serialization.Serializable

@Serializable
data class EmailRegistrationCandidateDto(
    val name: String,
    val email: String,
    val verified: Boolean,
    val uid: String
)