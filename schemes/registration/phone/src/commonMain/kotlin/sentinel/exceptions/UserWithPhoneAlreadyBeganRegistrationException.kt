package sentinel.exceptions

class UserWithPhoneAlreadyBeganRegistrationException(
    val phone: String
) : UserAlreadyBeganRegistrationException("User with phone ($phone) has already began registration")