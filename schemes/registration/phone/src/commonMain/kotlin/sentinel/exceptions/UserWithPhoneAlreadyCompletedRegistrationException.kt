package sentinel.exceptions

class UserWithPhoneAlreadyCompletedRegistrationException(
    val phone: String
) : UserAlreadyCompletedRegistrationException("User with phone ($phone) has already completed registration")