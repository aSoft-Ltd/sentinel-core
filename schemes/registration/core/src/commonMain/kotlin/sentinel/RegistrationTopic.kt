package sentinel

class RegistrationTopic(base: String,private val method: String) {

    private val root = "$base/registration"
    fun completed(uid: String) = "$root/completed/$method/$uid"
}