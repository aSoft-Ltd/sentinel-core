package sentinel

class RegistrationEndpoint(base: String) {
    private val core = "$base/registration"

    fun signUp() = "$core/sign-up"
    fun status() = "$core/status"
}