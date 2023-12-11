package sentinel.exceptions

class UserWithEmailDidNotBeginRegistrationException(
    val email: String
) : UserDidNotBeginRegistrationException("User with email ($email) has not began registration yet")