# Selenium Test for guest favorite button

## Overview

This project demonstrates how to handle and interact with a transient element that appears briefly when clicking a favorite button on a webpage. The test is implemented using Selenium WebDriver with Java and TestNG for test management.

## Prerequisites

Ensure you have the following installed:

- **Java Development Kit (JDK) 11**: Make sure `JAVA_HOME` is set to the JDK 11 directory.
- **Maven 3.9.8**: You can download it from the [Maven official website](https://maven.apache.org/download.cgi).
- **Google Chrome**: The tests use ChromeDriver, so ensure Google Chrome is installed on your machine.

## Project Structure

The project follows a Maven structure:

```
makyee
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── MakyeePropertyListPageTest.java
│   │   └── resources/
│   │       └── testng.xml
└── README.md
```

##  Install Dependencies

```
mvn clean install
```

##  Run the Tests

```
mvn clean test
```


