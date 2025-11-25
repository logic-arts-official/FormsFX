plugins {
    id("java")
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

description = "FormsFX Demo"

application {
    mainClass.set("com.dlsc.formsfx.demo.Demo")
}

javafx {
    version = property("javafxVersion").toString()
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    implementation(project(":formsfx-core"))
}
