# Selenium Java Hybrid Framework

![Build Status](https://github.com/nzr-22/Selenium-Java-Framework/actions/workflows/selenium.yml/badge.svg)

## 🚀 Overview
This is an enterprise-grade automation framework designed to test the SauceDemo e-commerce platform. It demonstrates advanced test automation patterns including Page Object Model (POM), Data-Driven Testing, and CI/CD integration.

## 🛠 Tech Stack
* **Language:** Java 17
* **Automation Tool:** Selenium WebDriver 4.x
* **Test Runner:** TestNG
* **Reporting:** Allure Reports & Extent Reports
* **Build Tool:** Maven
* **CI/CD:** GitHub Actions
* **Design Pattern:** Page Object Model (POM)

## 💡 Key Features
* **Cross-Browser Support:** Supports Chrome, Firefox, and Edge (Headless & Headed).
* **Data-Driven:** Test data is separated from logic using `config.properties` and JSON.
* **Robust Reporting:** Automatically captures screenshots on test failure.
* **CI/CD Pipeline:** Tests run automatically on every `git push` via GitHub Actions.

## 📂 Project Structure
```text
├── .github/workflows   # CI/CD Configuration
├── src/test/java       # Test Scripts & Page Objects
├── src/main/resources  # Test Data & Configuration
└── pom.xml             # Dependencies
```

## ⚡ How to Run

### Prerequisites
* Java JDK 17+ installed.
* Maven installed.

### Execution Commands
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/nzr-22/Selenium-Java-Framework.git](https://github.com/nzr-22/Selenium-Java-Framework.git)
   
2. **Run all tests:**
   ```bash
   mvn clean test
3. **Run in Headless Mode (for CI/CD):**
   ```bash
   mvn clean test -Dheadless=true

## 📊 Viewing Reports
To view the Allure report locally after running tests:
   ```bash
mvn allure:serve