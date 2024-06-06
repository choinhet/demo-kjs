plugins {
    kotlin("js") version "1.8.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.3.1-pre.754")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.3.1-pre.754")
}


kotlin {
    js(IR) {
        browser {
            binaries.executable()
        }
    }
}
