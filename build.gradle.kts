
plugins {
    id("maven-publish")
    kotlin("multiplatform") version "2.0.21" apply false
}
group = "org.anime_game_servers.core"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
allprojects {
    apply(plugin ="maven-publish")

    repositories {
        mavenLocal()
        mavenCentral()
        maven {
            name = "ags-mvn-Releases"
            url = uri("https://mvn.animegameservers.org/releases")
        }
        maven {
            name = "ags-mvn-Snapshots"
            url = uri("https://mvn.animegameservers.org/snapshots")
        }
    }

    dependencies {
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

    publishing {
        repositories {
            maven {
                name = "agsmvnrelease"
                url = uri("https://mvn.animegameservers.org/releases")
                credentials(PasswordCredentials::class)
                authentication {
                    create<BasicAuthentication>("basic")
                }
            }
            maven {
                name = "agsmvnsnapshots"
                url = uri("https://mvn.animegameservers.org/snapshots")
                credentials(PasswordCredentials::class)
                authentication {
                    create<BasicAuthentication>("basic")
                }
            }
        }
    }
}