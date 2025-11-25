# Gradle Migration Guide

## Overview
FormsFX has been migrated from Maven to Gradle 9.2.0. This document provides information about the new build system.

## Prerequisites
- Java 17 or higher
- No Gradle installation required (uses Gradle wrapper)

## Building the Project

### Clean Build
```bash
./gradlew clean build
```

### Run Tests
```bash
./gradlew test
```

### Build without Tests
```bash
./gradlew build -x test
```

### Run the Demo Application
```bash
./gradlew :formsfx-demo:run
```

### Generate Distribution
```bash
./gradlew :formsfx-demo:installDist
```
The distribution will be created in `formsfx-demo/build/install/formsfx-demo/`

## Project Structure

The project is now a multi-module Gradle build with the following structure:

```
FormsFX/
├── build.gradle.kts           # Root build configuration
├── settings.gradle.kts        # Multi-module settings
├── gradle.properties          # Project properties
├── gradlew / gradlew.bat      # Gradle wrapper scripts
├── gradle/wrapper/            # Gradle wrapper files
├── formsfx-core/
│   └── build.gradle.kts       # Core module build
└── formsfx-demo/
    └── build.gradle.kts       # Demo module build
```

## Key Features

### Gradle Version
- **Version**: 9.2.0
- Configured via Gradle wrapper for consistent builds

### Java Configuration
- **Source/Target**: Java 17
- Java toolchain support enabled
- Automatic module path handling for JavaFX

### JavaFX Integration
- Uses `org.openjfx.javafxplugin` version 0.1.0
- JavaFX version: 22.0.2
- Modules: javafx.controls, javafx.fxml

### Build Artifacts
The build generates the following artifacts:
- `formsfx-core.jar` - Main library
- `formsfx-core-sources.jar` - Source code
- `formsfx-core-javadoc.jar` - API documentation
- `formsfx-demo.jar` - Demo application

### Performance Features
- Build caching enabled
- Parallel execution enabled
- Configuration cache enabled
- Incremental compilation

## Migration from Maven

If you were previously using Maven commands, here are the Gradle equivalents:

| Maven Command | Gradle Equivalent |
|---------------|-------------------|
| `mvn clean` | `./gradlew clean` |
| `mvn compile` | `./gradlew classes` |
| `mvn test` | `./gradlew test` |
| `mvn package` | `./gradlew build` |
| `mvn install` | `./gradlew publishToMavenLocal` |
| `mvn clean install` | `./gradlew clean build publishToMavenLocal` |

## Common Tasks

### List All Available Tasks
```bash
./gradlew tasks
```

### List Tasks for a Specific Module
```bash
./gradlew :formsfx-core:tasks
```

### View Dependencies
```bash
./gradlew dependencies
```

### View Dependency Tree for a Module
```bash
./gradlew :formsfx-core:dependencies
```

## IDE Integration

### IntelliJ IDEA
IntelliJ IDEA has excellent Gradle support out of the box:
1. Open the project directory
2. IntelliJ will automatically detect the Gradle build
3. Import the Gradle project when prompted

### Eclipse
Install the Buildship Gradle Integration plugin:
1. Help → Eclipse Marketplace
2. Search for "Buildship Gradle Integration"
3. Install and restart Eclipse
4. Import the project as a Gradle project

### VS Code
Install the Gradle extension:
1. Install "Gradle for Java" extension
2. Open the project directory
3. Use the Gradle tasks view to run builds

## Troubleshooting

### Build Cache Issues
If you encounter unexpected build behavior:
```bash
./gradlew clean --no-build-cache
```

### Daemon Issues
If Gradle daemon causes problems:
```bash
./gradlew --stop
```

### Force Refresh Dependencies
```bash
./gradlew build --refresh-dependencies
```

## Configuration Properties

The `gradle.properties` file contains build configuration:
```properties
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
org.gradle.parallel=true
org.gradle.caching=true
org.gradle.configuration-cache=true
```

Modify these properties to adjust build performance based on your system.
