package sentinel

class RegistrationActionMessage {

    fun signUp(email: String) = "Beginning signing process for $email"

    fun sendVerificationLink(email: String) = "Sending verification link to $email"

    fun verify(email: String) = "Verifying user with $email"

    fun createAccount(email: String) = "Create account form $email"
}