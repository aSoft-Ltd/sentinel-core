package sentinel

class EmailRegistrationEndpoint(base: String) {

    private val core by lazy { "$base/registration" }

    fun signUp() = "$core/sign-up"

    fun sendEmailVerificationLink() = "$core/verification/send/email"

    fun verifyEmail() = "$core/verify/email"

    fun abort(email: String) = "$core/abort/$email"

    fun createAccount() = "$core/account/create"

    fun status() = "$core/status"
}