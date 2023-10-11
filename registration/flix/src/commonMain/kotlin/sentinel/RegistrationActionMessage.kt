package sentinel

class RegistrationActionMessage {

    class Action(val begin: String) {
        val failed by lazy { "$begin Failed" }
        val passed by lazy { "$begin Succeeded" }
    }

    fun signUp(email: String) = Action("Beginning signing process for $email")

    fun sendVerificationLink(email: String) = Action("Sending verification link to $email")

    fun verify(email: String) = Action("Verifying user with $email")

    fun createAccount(email: String) = Action("Create account form $email")
}