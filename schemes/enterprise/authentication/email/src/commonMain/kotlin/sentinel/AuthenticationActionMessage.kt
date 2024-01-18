package sentinel

class AuthenticationActionMessage {

    fun signIn(email: String) = "Signing in $email"

    fun session() = "Requesting for current session"

    fun signOut(token: String) = "Signing out token = $token"

    fun sendPasswordResetLink(email: String) = "Sending password reset link to $email"

    fun delete(email: String) = "Deleting account with email $email"

    fun resetPassword(token: String? = null) = "Resetting password with token $token"
}