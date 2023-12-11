package sentinel.exceptions

import kase.Status

class InvalidCodeForRegistrationException(
    val code: String
) : RegistrationException("Code ($code) is invalid") {
    override val status by lazy { Status.CODE_401_Unauthorized }
}