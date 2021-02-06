plugins {
    id("org.siouan.frontend") version "2.0.0"
    id("java")
}

frontend {
    nodeVersion.set("14.15.4")
    cleanScript.set("run clean")
    installScript.set("install")
    assembleScript.set("run build")
}

tasks.named("jar", Jar::class) {
    dependsOn("assembleFrontend")
    from("$buildDir/dist")
    into("static")
}
