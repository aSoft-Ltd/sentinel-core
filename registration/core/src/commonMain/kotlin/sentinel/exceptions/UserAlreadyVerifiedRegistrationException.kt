package sentinel.exceptions

import kase.Status

class UserAlreadyVerifiedRegistrationException(
    val email: String
) : RegistrationException("User with email ($email) has already been verified") {
    override val status by lazy { Status.CODE_409_Conflict }
}