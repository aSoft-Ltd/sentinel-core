package sentinel

class EmailRegistrationActionMessage {

    fun signUp(email: String) = "Beginning signing process for email $email"

    fun abort(email: String) = "Aborting signup for email $email"

    fun sendVerificationLink(email: String) = "Sending verification link to email $email"

    fun verify(email: String) = "Verifying user with email $email"

    fun createAccount(email: String) = "Create account for user with email $email"
}