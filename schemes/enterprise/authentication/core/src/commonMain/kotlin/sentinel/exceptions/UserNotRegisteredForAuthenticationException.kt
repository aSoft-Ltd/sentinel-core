package sentinel.exceptions

import kase.Status

class UserNotRegisteredForAuthenticationException(
    email: String
) : AuthenticationException("User with email ($email) has not been registered") {
    override val status by lazy { Status.CODE_401_Unauthorized }
}