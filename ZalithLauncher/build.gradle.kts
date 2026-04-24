// build.gradle.kts

plugins {
    kotlin("jvm") version "1.5.31"
    id("application")
}

application {
    mainClass.set("com.example.MainKt")
}

dependencies {
    implementation(kotlin("stdlib"))
    // Add any other dependencies here
}

tasks.withType<Jar> {
    manifest {
        attributes["Implementation-Title"] = "ZalithLauncher"
        attributes["Implementation-Version"] = version
    }
    from(
        configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) }
    )
}
