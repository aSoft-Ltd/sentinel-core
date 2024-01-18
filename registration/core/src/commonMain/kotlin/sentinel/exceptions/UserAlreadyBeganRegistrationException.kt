package sentinel.exceptions

import kase.Status

open class UserAlreadyBeganRegistrationException(
    open val email: String
) : RegistrationException("User with email ($email) has already began registration") {
    override val status by lazy { Status.CODE_409_Conflict }
}