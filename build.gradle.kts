// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Defines the version of the Android Application plugin.
    // 'apply false' means this plugin is not applied to the root project itself,
    // but its version is made available for modules (like your 'app' module) to apply.
    id("com.android.application") version "8.7.3" apply false

    // Defines the version of the Android Library plugin.
    // 'apply false' makes this version available for any library modules.
    id("com.android.library") version "8.7.3" apply false

    // Defines the version of the Kotlin Android plugin.
    // 'apply false' makes this version available for modules using Kotlin.
    // Note: There was a space in "org.jetbrains.kotlin. android" in your input,
    // which I've corrected to "org.jetbrains.kotlin.android".
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}

// Registers a custom task named 'clean'.
// This task, when executed (e.g., via './gradlew clean'), will delete
// the root project's build directory. This is a standard clean task.
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}