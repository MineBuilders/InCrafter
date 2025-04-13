import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    jvm()

    js {
        nodejs()
    }

    mingwX64()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.korge.luak)
        }
    }

    compilerOptions.freeCompilerArgs.addAll(
        "-Xexpect-actual-classes",
    )
}

android {
    namespace = "vip.cdms.incrafter"
    compileSdk = libs.versions.android.sdk.compile.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.sdk.min.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
