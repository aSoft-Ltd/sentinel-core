package sentinel.exceptions

import kase.Status

class UserAlreadyCompletedRegistrationException(
    val email: String
) : RegistrationException("User with email ($email) has already completed registration") {
    override val status by lazy { Status.CODE_409_Conflict }
}