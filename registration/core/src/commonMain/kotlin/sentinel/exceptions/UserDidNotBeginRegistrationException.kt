package sentinel.exceptions

import kase.Status

class UserDidNotBeginRegistrationException(
    val email: String
) : RegistrationException("User with email ($email) has not began registration yet") {
    override val status by lazy { Status.CODE_409_Conflict }
}