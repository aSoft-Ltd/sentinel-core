package sentinel.exceptions

import kase.ResponseException

abstract class RegistrationException(override val message: String) : ResponseException()