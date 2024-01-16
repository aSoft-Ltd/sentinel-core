package sentinel.exceptions

import kase.Status

class MissingAuthenticationException : AuthenticationException("Authentication token was not found in the request") {
    override val status by lazy { Status.CODE_401_Unauthorized }
}