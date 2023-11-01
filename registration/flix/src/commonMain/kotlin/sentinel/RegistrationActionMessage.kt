package sentinel

class RegistrationActionMessage {

    class Action(val begin: String) {
        val failed by lazy { "$begin Failed" }
        val passed by lazy { "$begin Succeeded" }
    }

    fun signUp(email: String) = "Beginning signing process for $email"

    fun sendVerificationLink(email: String) = "Sending verification link to $email"

    fun verify(email: String) = "Verifying user with $email"

    fun createAccount(email: String) = "Create account form $email"
}