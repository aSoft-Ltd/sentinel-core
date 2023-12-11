package sentinel.exceptions

import kase.Status

abstract class UserAlreadyCompletedRegistrationException(message: String) : RegistrationException(message) {
    override val status by lazy { Status.CODE_409_Conflict }
}