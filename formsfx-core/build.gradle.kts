plugins {
    id("java-library")
    id("maven-publish")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

description = "A framework for quickly creating form-based UIs."

javafx {
    version = property("javafxVersion").toString()
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    testImplementation("junit:junit:${property("junitVersion")}")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            
            pom {
                name.set("FormsFX Core")
                description.set(project.description)
                url.set("https://github.com/dlemmermann/formsfx")
                
                licenses {
                    license {
                        name.set("Apache 2.0")
                    }
                }
                
                scm {
                    url.set("https://github.com/dlemmermann/formsfx")
                }
                
                developers {
                    developer {
                        name.set("Dirk Lemmermann")
                        url.set("http://www.dlsc.com")
                        organization.set("DLSC Software & Consulting")
                    }
                }
            }
        }
    }
}
