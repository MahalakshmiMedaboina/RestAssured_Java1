# RestAssured Java API Testing Project

A Java-based REST API testing project using RestAssured and TestNG frameworks. This project demonstrates automated API testing with the RestAssured library.

## 📋 Table of Contents

- [Overview](#overview)
- [Technologies & Dependencies](#technologies--dependencies)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation & Setup](#installation--setup)
- [Running Tests](#running-tests)
- [Project Details](#project-details)
- [Contributing](#contributing)
- [License](#license)

## 📖 Overview

This project is designed to showcase REST API automation testing using RestAssured and TestNG. It includes examples of making HTTP requests, validating responses, and handling JSON request/response bodies. The project demonstrates how to set up API tests with proper assertions and logging for effective API validation and debugging.

## 🛠️ Technologies & Dependencies

- **Java**: 21
- **Build Tool**: Maven 3.x
- **RestAssured**: 6.0.0 - For REST API testing
- **TestNG**: 7.12.0 - For test framework and assertions
- **IDE**: Eclipse / Any Java IDE

The project uses RestAssured library for making HTTP requests and validating API responses, along with TestNG framework for organizing and executing automated test cases.

## 📁 Project Structure

```
RestAssured_Java1/
├── src/
│   └── Basics.java           # Sample API test class
├── target/                    # Compiled classes and build output
├── bin/                       # Binary files
├── pom.xml                    # Maven configuration
├── .gitignore                 # Git ignore file
├── README.md                  # This file
└── .project, .classpath       # Eclipse configuration files
```

## 📦 Prerequisites

- Java 21 or later
- Maven 3.6+ installed and configured
- Git installed
- Internet connection (for downloading dependencies)

## 🚀 Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/MahalakshmiMedaboina/RestAssured_Java1.git
   cd RestAssured_Java1
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Verify installation**
   ```bash
   mvn --version
   ```

## ▶️ Running Tests

### Run all tests
```bash
mvn test
```

### Run specific test class
```bash
mvn test -Dtest=Basics
```

### Compile the project
```bash
mvn clean compile
```

### Build the project
```bash
mvn clean build
```

## 📝 Project Details

### Sample Test: Basics.java

This class demonstrates a basic REST API test that validates the Google Maps Place API. The test sets up a POST request to add a new place with authentication, includes necessary headers, sends a JSON request body containing location and address details, and then verifies that the API responds with a successful status code of 201 (Created). The test uses RestAssured's fluent syntax to log request and response details for debugging purposes.

## 🔧 Common Git Commands

### Initial Setup (if not already initialized)
```bash
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/MahalakshmiMedaboina/RestAssured_Java1.git
git push -u origin main
```

### Regular Push Commands
```bash
# Stage all changes
git add .

# Commit changes
git commit -m "Your commit message"

# Push to remote repository
git push origin main
```

### Useful Git Commands
```bash
# Check status
git status

# View commit history
git log

# Pull latest changes
git pull origin main

# Create a new branch
git checkout -b branch-name

# Switch branches
git checkout branch-name

# Delete a branch
git branch -d branch-name
```

## 📚 Learning Resources

- [RestAssured Documentation](https://rest-assured.io/)
- [TestNG Documentation](https://testng.org/doc/)
- [Maven Documentation](https://maven.apache.org/guides/)
- [Rahul Shetty Academy - RestAssured Course](https://rahulshettyacademy.com/)

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is open source and available under the MIT License.

---

**Author**: Mahalakshmi Medaboina  
**Repository**: [RestAssured_Java1](https://github.com/MahalakshmiMedaboina/RestAssured_Java1)
