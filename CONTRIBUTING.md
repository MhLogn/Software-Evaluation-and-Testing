# Contributing Guide

## How to Contribute to This Project

Thank you for your interest in contributing to this white-box testing project!

## Getting Started

### 1. Fork and Clone
```bash
# Fork the repository on GitHub
# Clone your fork
git clone https://github.com/YOUR-USERNAME/Software-Evaluation-and-Testing.git
cd Software-Evaluation-and-Testing
```

### 2. Create a Feature Branch
```bash
git checkout -b feature/your-feature-name
```

### 3. Set Up Development Environment
```bash
# Install Java 11 or higher
# Install Maven 3.6+
# Verify installation
java -version
mvn -version
```

## Working on Issues

### Issue 1: Valid Processing Flows Tests
These tests cover normal operations with valid inputs.

**Guidelines:**
- Test valid input ranges
- Verify expected outputs
- Document test purpose
- Use @DisplayName annotation
- Keep test names descriptive

**Example:**
```java
@Test
@DisplayName("Calculate perimeter with positive dimensions")
public void testPerimeterWithPositiveDimensions() {
    double result = Rectangle.calculatePerimeter(5.0, 3.0);
    assertEquals(16.0, result);
}
```

### Issue 2: Error Branches & Edge Cases Tests
These tests cover error conditions and boundary values.

**Guidelines:**
- Test invalid inputs
- Verify exception throwing
- Test boundary values
- Document edge cases
- Use assertThrows for exceptions

**Example:**
```java
@Test
@DisplayName("Perimeter throws exception when length is zero")
public void testPerimeterThrowsExceptionWhenLengthIsZero() {
    assertThrows(IllegalArgumentException.class, () -> {
        Rectangle.calculatePerimeter(0, 5);
    });
}
```

## Code Style Guidelines

### Java Code Style
```java
// Use meaningful variable names
int numberOfDaysInMonth = 31;

// Use proper indentation (4 spaces)
if (condition) {
    doSomething();
}

// Document with comments
// This loop checks for divisors up to sqrt(n)
for (int i = 3; i <= Math.sqrt(n); i += 2) {
    if (n % i == 0) return false;
}
```

### Test Method Naming
```java
// Format: test[MethodName][Condition]
testCalculatePerimeterWithPositiveDimensions()
testFactorialThrowsExceptionForNegativeInput()
testSolveEquationWithTwoSolutions()
```

### Javadoc Comments
```java
/**
 * Calculate the perimeter of a rectangle
 * @param length the length of the rectangle
 * @param width the width of the rectangle
 * @return the perimeter
 * @throws IllegalArgumentException if length or width is not positive
 */
public static double calculatePerimeter(double length, double width) {
    // implementation
}
```

## Making Changes

### 1. Write Tests First (TDD)
```bash
# Create test case in appropriate test file
# Implement the test
# Run tests to verify they fail
mvn test
# Implement the feature
# Run tests to verify they pass
```

### 2. Code Changes
- Keep changes focused and atomic
- One feature per commit
- Maintain existing code structure
- Don't modify unrelated code

### 3. Run Tests Locally
```bash
# Run all tests
mvn clean test

# Run specific test class
mvn test -Dtest=RectangleTest

# Generate coverage report
mvn jacoco:report
```

### 4. Verify Coverage
```bash
# Check that coverage remains 100%
mvn jacoco:report
# Open target/site/jacoco/index.html
# Verify all lines and branches are covered
```

## Commit Guidelines

### Commit Message Format
```
<type>: <subject>

<body>

<footer>
```

### Types
- **feat**: New feature or test case
- **fix**: Bug fix
- **docs**: Documentation change
- **test**: Test case addition/modification
- **refactor**: Code refactoring

### Examples
```
feat: Add test case for Rectangle with decimal dimensions

Add test_rectangle_decimal_dimensions to verify calculation
with decimal input values (2.5 x 1.5).

Related to Issue #1: Valid Processing Flows Tests
```

```
fix: Correct leap year calculation for 1900

Previous implementation incorrectly marked 1900 as leap year.
Fixed divisibility check (divisible by 400 takes precedence).

Fixes edge case in MonthDays.isLeapYear()
```

## Pull Request Process

### 1. Before Creating PR
```bash
# Update your branch with latest main
git fetch origin
git rebase origin/main

# Run all tests
mvn clean test

# Run coverage check
mvn jacoco:report
```

### 2. Create Pull Request
- Clear title describing the change
- Reference related issues (#1, #2)
- Describe what was changed and why
- Include test results

### PR Template
```markdown
## Description
Brief description of changes

## Related Issue
Closes #1 (Valid Processing Flows)
Closes #2 (Error Branches)

## Changes
- [ ] Added 5 new test cases for Rectangle
- [ ] Updated documentation
- [ ] Verified 100% coverage

## Test Results
```
[INFO] Tests run: 17, Failures: 0, Errors: 0
```

## Checklist for PR
- [x] Tests pass locally
- [x] 100% coverage maintained
- [x] Code follows style guide
- [x] Documentation updated
- [x] Commit messages are clear
```

### 3. Review Process
- Address reviewer feedback
- Make requested changes
- Push updates to branch
- Mark conversations as resolved

## Testing Standards

### Test Case Requirements
1. **Clear naming**: Test name describes what is tested
2. **Single concern**: One test per behavior
3. **Comprehensive**: Cover all branches
4. **Isolated**: No dependencies between tests
5. **Repeatable**: Same result every run
6. **Fast**: Execute quickly (< 1 second typical)

### Coverage Requirements
- Minimum 100% statement coverage
- Minimum 100% branch coverage
- All exceptions tested
- All edge cases covered

### Documentation Requirements
- JavaDoc for all public methods
- Test method @DisplayName annotation
- Meaningful assertion messages
- Comments explaining complex logic

## Adding New Tests

### Step 1: Identify Test Scenario
```java
// Example: Test prime number detection
@Test
@DisplayName("97 is prime")
public void testNinetySevenIsPrime() {
    // test
}
```

### Step 2: Write Test Case
```java
@Test
@DisplayName("97 is prime")
public void testNinetySevenIsPrime() {
    // Arrange
    int number = 97;
    
    // Act
    boolean result = PrimeNumber.isPrime(number);
    
    // Assert
    assertTrue(result, "97 should be prime");
}
```

### Step 3: Run Test
```bash
mvn test -Dtest=PrimeNumberTest
```

### Step 4: Verify Coverage
```bash
mvn jacoco:report
# Check that new code is covered
```

## Reporting Issues

### Bug Reports
Include:
1. **Title**: Clear description
2. **Description**: What went wrong
3. **Steps to Reproduce**: How to replicate
4. **Expected vs Actual**: What should vs did happen
5. **Environment**: Java version, Maven version, OS

### Example
```
Title: Rectangle.calculateArea fails with negative width

Description:
Method should throw IllegalArgumentException for negative width,
but returns incorrect calculation instead.

Steps to Reproduce:
1. Call Rectangle.calculateArea(5, -3)
2. Observe result

Expected: IllegalArgumentException thrown
Actual: Returns -15

Environment:
- Java 11
- Maven 3.6.3
- Windows 10
```

## Questions?

- Check existing issues for similar questions
- Search documentation (README.md, TEST_CASES.md)
- Review test examples in test files
- Create an issue for clarification

## Recognition

Contributors will be recognized in:
- Project README
- Commit history
- GitHub contributors page

## Code of Conduct

- Be respectful and inclusive
- Provide constructive feedback
- Help others learn and grow
- Focus on the code, not the person

## Additional Resources

- [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Guide](https://maven.apache.org/guides/)
- [GitHub Collaboration Guide](https://docs.github.com/en/github/collaborating-with-pull-requests)
- [Code Coverage Best Practices](https://www.eclemma.org/jacoco/)

## Summary

1. Fork and clone the repository
2. Create a feature branch
3. Write tests and code
4. Ensure 100% coverage
5. Follow code style guide
6. Commit with clear messages
7. Create pull request
8. Address feedback
9. Merge and celebrate! 🎉

---

Thank you for contributing to improve this project!
