package sentinel.exceptions

class UserWithEmailAlreadyBeganRegistrationException(
    val email: String
) : UserAlreadyBeganRegistrationException("User with email ($email) has already began registration")