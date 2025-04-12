plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    mingwX64 {
        binaries {
            executable {
                entryPoint = "vip.cdms.incrafter.cli.main"
            }
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.ajalt.clikt)
            implementation(projects.incrafterLib)
        }
    }
}
