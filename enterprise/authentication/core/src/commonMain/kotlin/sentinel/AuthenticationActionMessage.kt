package sentinel

class AuthenticationActionMessage {
    class Action(val begin: String) {
        val failed by lazy { "$begin Failed" }
        val passed by lazy { "$begin Succeeded" }
    }

    fun signIn(email: String) = Action("Signing in $email")
}