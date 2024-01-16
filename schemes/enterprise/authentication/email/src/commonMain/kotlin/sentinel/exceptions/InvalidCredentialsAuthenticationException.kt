package sentinel.exceptions

import kase.Status

class InvalidCredentialsAuthenticationException : AuthenticationException("Invalid credentials") {
    override val status by lazy { Status.CODE_401_Unauthorized }
}