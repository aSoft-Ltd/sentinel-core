package sentinel

class RegistrationTopic(private val method: String) {
    fun registrationCompleted(uid: String) = "/registration/completed/$method/$uid"
}