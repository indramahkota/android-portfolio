// We want to use new APIs
@file:Suppress("UnstableApiUsage")

// Applied to the current project with id
plugins {
    id("com.indramahkota.build.logic.convention.android-lib")
}

dependencies {
    // Core KTX
    implementation(libs.core)

    // Coroutines
    implementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)

    // Timber
    implementation(libs.timber)

    // Test
    testImplementation(libs.junit4)
}