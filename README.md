# Selenium Cucumber Framework

A BDD-style test automation framework using Selenium WebDriver and Cucumber.

## Project Structure
├── src/test/
│ ├── java/
│ │ ├── base/
│ │ │ └── BaseTest.java
│ │ ├── pages/
│ │ │ ├── LoginPage.java
│ │ │ └── HomePage.java
│ │ ├── stepdefinitions/
│ │ │ ├── LoginSteps.java
│ │ │ └── Hooks.java
│ │ ├── runners/
│ │ │ └── TestRunner.java
│ │ └── utils/
│ │ ├── ConfigReader.java
│ │ ├── DriverFactory.java
│ │ └── ScreenshotUtil.java
│ └── resources/
│ ├── features/
│ │ └── login.feature
│ └── config.properties
├── target/
│ └── allure-results/
└── pom.xml


## Prerequisites

- Java 11+
- Maven 3.6+
- Chrome/Firefox browser

## Setup

1. Clone the repository
2. Install dependencies: `mvn clean install`
3. Run tests: `mvn test`

## Features

- Page Object Model pattern
- BDD with Cucumber
- Multiple browser support (Chrome/Firefox)
- Configurable through properties file
- Automatic screenshot on failure
- HTML test reports

## Configuration

Edit `src/test/resources/config.properties` to change:
- browser (chrome/firefox)
- baseUrl
- timeout settings

## Writing Tests

1. Add feature files in `src/test/resources/features`
2. Implement step definitions in `src/test/java/stepdefinitions`
3. Add page objects in `src/test/java/pages`

## Running Tests

Execute: `mvn test` or run `TestRunner.java` as JUnit test