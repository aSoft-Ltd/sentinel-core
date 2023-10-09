package sentinel

class RegistrationActionMessage {

    class SignUp(private val email: String) {
        val begin by lazy { "Beginning signing process for $email" }
        val failed by lazy { "$begin Failed" }
        val passed by lazy { "$begin Succeeded" }
    }
    fun signUp(email: String) = SignUp(email)
}