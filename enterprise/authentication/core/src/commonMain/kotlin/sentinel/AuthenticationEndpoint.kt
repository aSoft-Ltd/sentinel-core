package sentinel

class AuthenticationEndpoint(base: String) {
    private val core by lazy { "$base/authentication" }

    fun signIn() = "$core/sign-in"
    fun session() = "$core/session"

    fun signOut() = "$core/sign-out"

    fun sendPasswordResetLink() = "$core/password/send-reset-link"

    fun resetPassword() = "$core/password/reset"
}