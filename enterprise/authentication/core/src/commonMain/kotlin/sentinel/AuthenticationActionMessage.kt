package sentinel

class AuthenticationActionMessage {
    class Action(val begin: String) {
        val failed by lazy { "$begin Failed" }
        val passed by lazy { "$begin Succeeded" }
    }

    fun signIn(email: String) = Action("Signing in $email")

    fun session() = Action("Requesting for current session")

    fun sendPasswordResetLink(email: String) = Action("Sending password reset link to $email")

    fun resetPassword(token: String? = null) = Action("Resetting password with $token")
}