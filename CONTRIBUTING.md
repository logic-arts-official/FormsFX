# Contributing to FormsFX

Thank you for your interest in contributing to FormsFX! This guide will help you get started with development.

## Quick Setup for Developers

### Prerequisites

- **Java 17 or later** (OpenJDK or Oracle JDK)
- **Maven 3.8.4 or later** (or use the included Maven wrapper)
- **Git** for version control

### Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/dlsc-software-consulting-gmbh/FormsFX.git
   cd FormsFX
   ```

2. **Build the project**
   ```bash
   ./mvnw clean install
   ```
   Or on Windows:
   ```cmd
   mvnw.cmd clean install
   ```

3. **Run tests**
   ```bash
   ./mvnw test
   ```

4. **Run the demo application**
   ```bash
   cd formsfx-demo
   ../mvnw javafx:run
   ```

### Project Structure

```
FormsFX/
├── formsfx-core/       # Core library with form components and logic
│   └── src/
│       ├── main/java/  # Main source code
│       └── test/java/  # Unit tests
├── formsfx-demo/       # Demo application showcasing FormsFX features
│   └── src/
│       ├── main/java/  # Demo application code
│       └── main/resources/ # Demo resources (CSS, localization files)
├── docs/               # Documentation and design files
├── pom.xml             # Parent Maven configuration
└── README.md           # Project overview
```

### Development Workflow

1. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. **Make your changes**
   - Follow the existing code style and conventions
   - Write tests for new functionality
   - Update documentation as needed

3. **Build and test locally**
   ```bash
   ./mvnw clean install
   ```

4. **Commit your changes**
   ```bash
   git add .
   git commit -m "Add feature: description of your changes"
   ```

5. **Push to your fork**
   ```bash
   git push origin feature/your-feature-name
   ```

6. **Create a Pull Request**
   - Go to the GitHub repository
   - Click "New Pull Request"
   - Provide a clear description of your changes

### Code Style Guidelines

- **Java Code Style**: Follow standard Java conventions
  - Use 4 spaces for indentation
  - Keep lines under 120 characters when possible
  - Use meaningful variable and method names
  - Add Javadoc comments for public APIs

- **Commit Messages**: Write clear, descriptive commit messages
  - Use present tense ("Add feature" not "Added feature")
  - Keep the first line under 72 characters
  - Provide detailed description in the body if needed

### Building Documentation

Generate JavaDoc documentation:
```bash
./mvnw javadoc:javadoc
```

The generated documentation will be in `formsfx-core/target/apidocs/`.

### Testing

- **Unit Tests**: Run with `./mvnw test`
- **Integration Tests**: Manually test with the demo application
- **Coverage**: Aim for high test coverage for new code

### Common Tasks

#### Update Dependencies
```bash
# Check for available updates
./mvnw versions:display-dependency-updates

# Check for plugin updates
./mvnw versions:display-plugin-updates
```

#### Format Code
The project uses the license-maven-plugin to maintain consistent file headers:
```bash
./mvnw license:update-file-header
```

#### Clean Build
```bash
./mvnw clean
```

### Troubleshooting

#### Build Fails
- Ensure you're using Java 17 or later
- Try a clean build: `./mvnw clean install`
- Check that all dependencies are downloaded correctly

#### Tests Fail
- Some tests require a JavaFX environment
- Run tests with appropriate JavaFX modules on the classpath

#### Maven Wrapper Issues
If the Maven wrapper (`mvnw`) doesn't work:
- Ensure it has execute permissions: `chmod +x mvnw`
- Alternatively, use your system Maven installation

### Getting Help

- **Issues**: Report bugs or request features on [GitHub Issues](https://github.com/dlsc-software-consulting-gmbh/FormsFX/issues)
- **Discussions**: Ask questions or discuss ideas
- **Documentation**: Refer to the [README.md](README.md) and [JavaDocs](http://dlsc.com/wp-content/html/formsfx/apidocs/)

### License

By contributing to FormsFX, you agree that your contributions will be licensed under the Apache License 2.0, the same license used by this project.

## Thank You!

Your contributions help make FormsFX better for everyone. We appreciate your time and effort!
