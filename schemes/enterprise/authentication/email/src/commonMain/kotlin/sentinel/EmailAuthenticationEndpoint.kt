package sentinel

class EmailAuthenticationEndpoint(base: String) {
    private val core by lazy { "$base/authentication/email" }

    fun signIn() = "$core/sign-in"
    fun session() = "$core/session"

    fun delete() = "$core/delete"

    fun signOut() = "$core/sign-out"

    fun sendPasswordResetLink() = "$core/password/send-reset-link"

    fun resetPassword() = "$core/password/reset"
}