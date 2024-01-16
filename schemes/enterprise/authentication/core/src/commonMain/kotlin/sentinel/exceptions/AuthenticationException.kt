package sentinel.exceptions

import kase.ResponseException

abstract class AuthenticationException(override val message: String) : ResponseException()