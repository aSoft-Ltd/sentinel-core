package sentinel

class AuthenticationTopic(
    val deletedUser: (uid: String) -> String,
    val deletedBusiness: (uid: String) -> String,
) {
    companion object {
        fun default(base: String, method: String) = AuthenticationTopic(
            deletedUser = { uid -> "$base/authentication/deleted/user/$method/$uid" },
            deletedBusiness = { uid -> "$base/authentication/deleted/business/$method/$uid" },
        )
    }
}