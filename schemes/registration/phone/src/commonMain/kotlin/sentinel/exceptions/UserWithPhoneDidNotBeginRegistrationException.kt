package sentinel.exceptions

import kase.Status

class UserWithPhoneDidNotBeginRegistrationException(
    val phone: String
) : RegistrationException("User with phone ($phone) has not began registration yet") {
    override val status by lazy { Status.CODE_409_Conflict }
}