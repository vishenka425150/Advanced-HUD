group = "ru.cactus_studio" // TODO: Change this to your group
version = "1.0-SNAPSHOT" // TODO: Change this to your addon version

plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.paperweight)
    alias(libs.plugins.nova)
}

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://repo.xenondevs.xyz/releases")
}

dependencies {
    paperweight.paperDevBundle(libs.versions.paper)
    implementation(libs.nova)
}

addon {
    name = "Advanced HUD"
    description = "Advanced HUD is a plugin for minecraft made based on Nova."
    prefix = "Advanced HUD"
    version = project.version.toString()
    main = "ru.cactus_studio.advanced_hud.AdvancedHUD" // TODO: Change this to your main class
    authors = listOf("vishenka425150")
    
    // output directory for the generated addon jar is read from the "outDir" project property (-PoutDir="...")
    val outDir = project.findProperty("outDir")
    if (outDir is String)
        destination.set(File(outDir))
}