plugins {
    kotlin("multiplatform")
}

group = "org.anime_game_servers.core"
version = "0.2"

kotlin {
    jvmToolchain(17)
    jvm {
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(IR) {
        nodejs()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    mingwX64()
    linuxX64()
    linuxArm64()
    macosArm64()
    macosX64()
    iosArm64()
    iosX64()


    sourceSets {
        val commonMain by getting {
            dependencies{
                api(project(":base"))
            }
        }
        val commonTest by getting {
        }
        val jvmMain by getting {
            dependencies {
            }
        }
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}