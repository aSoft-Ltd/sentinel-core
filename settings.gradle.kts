import java.io.File

pluginManagement {
    includeBuild("../build-logic")
}

plugins {
    id("multimodule")
}

fun includeSubs(base: String, path: String = base, vararg subs: String) {
    subs.forEach {
        include(":$base-$it")
        project(":$base-$it").projectDir = File("$path/$it")
    }
}

listOf(
    "lexi", "neat", "kash-api", "geo-api", "kase", "keep",
    "kronecker", "epsilon-api", "krono-core", "hormone", "identifier-api",
    "kommerce", "kollections", "koncurrent", "kommander", "cabinet-api",
).forEach { includeBuild("../$it") }

rootProject.name = "sentinel-core"

includeSubs(base = "sentinel-reception", path = "reception", "core")
includeSubs(base = "sentinel-registration", path = "registration", "core", "flix")
includeSubs(base = "sentinel-enterprise-authentication-api", path = "enterprise/authentication", "core")
includeSubs(base = "sentinel-enterprise-profile-api", path = "enterprise/profile", "core")
