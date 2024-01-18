package sentinel.exceptions

import kase.Status

@Deprecated("In favour of the email/phone specific one")
open class InvalidTokenForRegistrationException(
    open val token: String
) : RegistrationException("Token ($token) is invalid") {
    override val status by lazy { Status.CODE_401_Unauthorized }
}