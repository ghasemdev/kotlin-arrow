import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("com.google.devtools.ksp") version "1.7.10-1.0.6"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    sourceSets.main {
        kotlin.srcDir("build/generated/ksp/main/kotlin")
    }
    sourceSets.test {
        kotlin.srcDir("build/generated/ksp/test/kotlin")
    }
}

dependencies {
    implementation(kotlin("script-runtime"))
    testImplementation(kotlin("test"))

    // Kotlin Arrow
    val arrowVersion = "1.1.2"
    // Core
    implementation("io.arrow-kt:arrow-core:$arrowVersion")
    // FX
    implementation("io.arrow-kt:arrow-fx-coroutines:$arrowVersion")
    implementation("io.arrow-kt:arrow-fx-stm:$arrowVersion")
    // Optics
    implementation("io.arrow-kt:arrow-optics:$arrowVersion")
    ksp("io.arrow-kt:arrow-optics-ksp-plugin:$arrowVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}