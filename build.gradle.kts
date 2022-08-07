// We want to use new APIs
@file:Suppress("UnstableApiUsage")

// Add plugin to classpath with id
plugins {
    // indramahkota custom plugin
    id("com.indramahkota.android-config")
    // plugin id: kotlin-android
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
    // plugin id: kotlin-kapt
    id("org.jetbrains.kotlin.kapt") version "1.6.21" apply false
    // plugin id: kotlin-parcelize
    id("org.jetbrains.kotlin.plugin.parcelize") version "1.6.21" apply false
    // plugin id: dagger.hilt.android.plugin
    id("com.google.dagger.hilt.android") version "2.42" apply false
    // plugin id: androidx.navigation.safeargs.kotlin
    id("androidx.navigation.safeargs.kotlin") version "2.4.2" apply false
    // plugin id: com.google.android.libraries.mapsplatform.secrets-gradle-plugin
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin") version "2.0.1" apply false
}

indramahkota {
    android {
        minSdk.set(23)
        targetSdk.set(32)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}