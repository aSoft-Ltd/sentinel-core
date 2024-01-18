package sentinel

class EmailAuthenticationEndpoint(base: String) {
    private val core by lazy { "$base/authentication/email" }

    fun signIn() = "$core/sign-in"
    fun session() = "$core/session"

    fun delete(email: String, password: String) = "$core/delete/$email/$password"

    fun signOut(token: String) = "$core/sign-out/$token"

    fun sendPasswordResetLink() = "$core/password/send-reset-link"

    fun resetPassword() = "$core/password/reset"
}