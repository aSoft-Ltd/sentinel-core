package sentinel.exceptions

import kase.Status

class ScopeMismatchAuthenticationException : AuthenticationException("Scope mismatch") {
    override val status by lazy { Status.CODE_401_Unauthorized }
}