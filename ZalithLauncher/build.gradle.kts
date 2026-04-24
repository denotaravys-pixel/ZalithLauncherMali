// Code adjustments for build.gradle.kts

val getCFApiKey = { System.getenv("CURSEFORGE_API_KEY") ?: error("CURSEFORGE_API_KEY environment variable is not set") }

...
// Other content above

val storePwd = System.getenv("SIGNING_STORE_PASSWORD") ?: error("SIGNING_STORE_PASSWORD environment variable is not set")
val keyPwd = System.getenv("SIGNING_KEY_PASSWORD") ?: error("SIGNING_KEY_PASSWORD environment variable is not set")
val keyAlias = System.getenv("SIGNING_KEY_ALIAS") ?: error("SIGNING_KEY_ALIAS environment variable is not set")

...
// Other content below

applicationId = "com.movtery.zalithlauncher"