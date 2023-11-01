package sentinel

class AuthenticationActionMessage {

    fun signIn(email: String) = "Signing in $email"

    fun session() = "Requesting for current session"

    fun sendPasswordResetLink(email: String) = "Sending password reset link to $email"

    fun resetPassword(token: String? = null) = "Resetting password with $token"
}