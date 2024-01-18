package sentinel.exceptions

import kase.Status

@Deprecated("In favour of the email/phone specific one")
open class UserAlreadyVerifiedRegistrationException(
    open val email: String
) : RegistrationException("User with email ($email) has already been verified") {
    override val status by lazy { Status.CODE_409_Conflict }
}