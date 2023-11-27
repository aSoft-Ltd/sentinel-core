package sentinel

class RegistrationRoutes(base: String) {

    private val core by lazy { "$base/registration" }

    fun signUp() = "$core/sign-up"

    fun sendEmailVerificationLink() = "$core/verification/send/email"

    fun verifyEmail() = "$core/verify/email"

    fun createAccount() = "$core/account/create"

    fun status() = "$core/status"
}