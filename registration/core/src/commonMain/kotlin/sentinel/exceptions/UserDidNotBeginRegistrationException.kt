package sentinel.exceptions

import kase.Status

@Deprecated("In favour of the email/phone specific one")
open class UserDidNotBeginRegistrationException(
    open val email: String
) : RegistrationException("User with email ($email) has not began registration yet") {
    override val status by lazy { Status.CODE_409_Conflict }
}