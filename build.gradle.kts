import org.jetbrains.intellij.tasks.PatchPluginXmlTask

plugins {
    kotlin("jvm") version "1.4.30"
    id("org.jetbrains.intellij") version "0.6.5"
}

repositories {
    jcenter()
    mavenCentral()
}

group = "com.javiersc"
version = "0.1.0"

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "LATEST-EAP-SNAPSHOT"
    setPlugins("com.chrisrm.idea.MaterialThemeUI:5.7.0")
}

tasks.getByName<PatchPluginXmlTask>("patchPluginXml") { }
