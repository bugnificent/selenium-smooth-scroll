# Selenium with JavaScript & TestNG

This repository contains useful Selenium functions written in JavaScript and integrated with TestNG, designed to enhance web automation testing. The code includes various utilities and test scripts, including infinite scroll handling and other advanced functions for robust and efficient automation.

## Features

- **Infinite Scroll Loop:** Automatically scrolls through a webpage with infinite scrolling.
- **Custom Selenium Commands:** Useful Selenium functions for smoother interaction with dynamic content.
- **TestNG Integration:** Organized test cases and execution using TestNG.
- **Cross-browser Testing:** Scripts are adaptable for multiple browsers.

## Prerequisites

To use this repository, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Maven
- Node.js
- WebDriver (Chrome, Firefox, etc.)
- TestNG plugin (for Maven or IDE)
- Selenium WebDriver and necessary dependencies

## Installation

### Clone the Repository

```bash
git clone https://github.com/velespitt/test-automation.git
cd test-automation
```

## Set Up Dependencies

### For Selenium with JavaScript:
Run `npm install` to install required packages such as `selenium-webdriver`.

```bash
npm install selenium-webdriver
```

### For TestNG
Add TestNG dependencies to your `pom.xml` file.

```
<dependencies>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.1.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Usage

### Running TestNG Tests

```bash
mvn clean test
```

## Contributing

If you would like to contribute to this repository:

1. Fork the repository.
2. Make your changes or add new accessibility testing results.
3. Submit a pull request for review.

# License

This repository is licensed under the [Apache License](LICENSE).

## Contributing

If you would like to contribute to this repository:

1. Fork the repository.
2. Make your changes or add new accessibility testing results.
3. Submit a pull request for review.

---

For questions or suggestions, feel free to create an issue in this repository.



