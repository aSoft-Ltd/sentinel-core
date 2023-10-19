package sentinel.params

import kotlinx.serialization.Serializable

@Serializable
data class SessionParams(val token: String)