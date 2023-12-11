package sentinel.exceptions

class UserWithEmailAlreadyCompletedRegistrationException(
    val email: String
) : UserAlreadyCompletedRegistrationException("User with email ($email) has already completed registration")