package sentinel.exceptions

import kase.Status

class InvalidTokenForRegistrationException(
    val token: String
) : RegistrationException("Token ($token) is invalid") {
    override val status by lazy { Status.CODE_401_Unauthorized }
}