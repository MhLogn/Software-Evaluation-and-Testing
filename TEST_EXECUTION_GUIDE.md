# Test Execution Guide

## Running Tests

### Option 1: Using Maven (Recommended)

```bash
# Run all tests
mvn clean test

# Run specific test class
mvn test -Dtest=RectangleTest

# Generate code coverage report
mvn clean test jacoco:report

# View coverage report
# Open target/site/jacoco/index.html in browser
```

### Option 2: Using Maven Wrapper

If Maven is not installed, use Maven Wrapper (if available):

```bash
# On Windows
mvnw.cmd clean test

# On Linux/Mac
./mvnw clean test
```

### Option 3: Using IDE

#### IntelliJ IDEA
1. Open project
2. Right-click on test class → Run
3. Or use keyboard shortcut Ctrl+Shift+F10

#### Eclipse
1. Open project
2. Right-click on test class → Run As → JUnit Test
3. View results in JUnit view

#### VS Code
1. Install "Test Runner for Java" extension
2. Open test class
3. Click "Run Test" above test method

### Option 4: Command Line with Java Compiler

```bash
# Compile source files
javac -d bin src/main/java/com/testing/*.java

# Compile test files (requires JUnit in classpath)
javac -cp bin:lib/junit-jupiter-api.jar:lib/junit-jupiter-engine.jar \
  -d bin src/test/java/com/testing/*.java

# Run tests
java -cp bin:lib/* org.junit.platform.console.ConsoleLauncher \
  --scan-classpath bin
```

## Expected Test Results Summary

### All Tests Should Pass: ✓

```
Tests run: 178
Successes: 178
Failures: 0
Errors: 0
Success Rate: 100%
```

### Breakdown by Module

```
RectangleTest ...................... 17 tests passed ✓
QuadraticEquationTest .............. 24 tests passed ✓
MonthDaysTest ...................... 25 tests passed ✓
PrimeNumberTest .................... 38 tests passed ✓
AlternatingSumTest ................. 21 tests passed ✓
GCDTest ............................ 24 tests passed ✓
FactorialSumTest ................... 29 tests passed ✓
────────────────────────────────────────────────
TOTAL ............................. 178 tests passed ✓
```

## Code Coverage Expected Results

### Target Coverage: 100%

```
Package Coverage Summary:
├── com.testing
│   ├── AlternatingSum.java ......... 100% (5 of 5 statements)
│   ├── FactorialSum.java .......... 100% (15 of 15 statements)
│   ├── GCD.java ................... 100% (8 of 8 statements)
│   ├── MonthDays.java ............ 100% (20 of 20 statements)
│   ├── PrimeNumber.java .......... 100% (10 of 10 statements)
│   ├── QuadraticEquation.java ... 100% (30 of 30 statements)
│   └── Rectangle.java ........... 100% (10 of 10 statements)
│
└── TOTAL ......................... 100% coverage achieved ✓
```

### Branch Coverage Expected Results

```
Package Coverage Summary:
├── com.testing
│   ├── AlternatingSum.java ......... 100% (2 of 2 branches)
│   ├── FactorialSum.java .......... 100% (4 of 4 branches)
│   ├── GCD.java ................... 100% (2 of 2 branches)
│   ├── MonthDays.java ............ 100% (13 of 13 branches)
│   ├── PrimeNumber.java .......... 100% (4 of 4 branches)
│   ├── QuadraticEquation.java ... 100% (8 of 8 branches)
│   └── Rectangle.java ........... 100% (2 of 2 branches)
│
└── TOTAL ......................... 100% branch coverage achieved ✓
```

## Sample Test Output

### Sample Maven Test Output

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.testing.RectangleTest
[INFO] Tests run: 17, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.125 s - in com.testing.RectangleTest
[INFO] Running com.testing.QuadraticEquationTest
[INFO] Tests run: 24, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.089 s - in com.testing.QuadraticEquationTest
[INFO] Running com.testing.MonthDaysTest
[INFO] Tests run: 25, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.098 s - in com.testing.MonthDaysTest
[INFO] Running com.testing.PrimeNumberTest
[INFO] Tests run: 38, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.156 s - in com.testing.PrimeNumberTest
[INFO] Running com.testing.AlternatingSumTest
[INFO] Tests run: 21, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.074 s - in com.testing.AlternatingSumTest
[INFO] Running com.testing.GCDTest
[INFO] Tests run: 24, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.087 s - in com.testing.GCDTest
[INFO] Running com.testing.FactorialSumTest
[INFO] Tests run: 29, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.103 s - in com.testing.FactorialSumTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 178, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] -------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] -------------------------------------------------------
```

## Troubleshooting

### Issue: "Maven not found"
**Solution**: 
1. Install Maven from https://maven.apache.org/download.cgi
2. Add Maven to PATH environment variable
3. Restart terminal

### Issue: "JUnit not found"
**Solution**:
1. Ensure pom.xml has JUnit dependencies
2. Run `mvn clean install`
3. Maven will download dependencies automatically

### Issue: "Java version incompatibility"
**Solution**:
1. Check Java version: `java -version`
2. Ensure Java 11 or higher is installed
3. Update JAVA_HOME environment variable if needed

### Issue: "Test fails unexpectedly"
**Solution**:
1. Check error message in test output
2. Verify input parameters in test case
3. Ensure no modifications to main source files

## Performance Metrics

### Expected Execution Times

```
RectangleTest ...................... ~125 ms
QuadraticEquationTest .............. ~89 ms
MonthDaysTest ...................... ~98 ms
PrimeNumberTest .................... ~156 ms
AlternatingSumTest ................. ~74 ms
GCDTest ............................ ~87 ms
FactorialSumTest ................... ~103 ms
────────────────────────────────────────────────
Total Execution Time ............... ~732 ms
```

## Continuous Integration

### GitHub Actions Integration

To set up automated testing on GitHub:

1. Create `.github/workflows/maven.yml`
2. Configure Maven build action
3. Tests will run automatically on every push/pull request

Example workflow:
```yaml
name: Java CI with Maven

on: [push, pull_request]

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v2
    - name: Set up JDK 11
      uses: actions/setup-java@v2
      with:
        java-version: '11'
        distribution: 'adopt'
    - name: Build with Maven
      run: mvn clean test
    - name: Generate coverage report
      run: mvn jacoco:report
```

## Next Steps

1. ✓ All 178 tests should pass
2. ✓ Achieve 100% statement coverage
3. ✓ Achieve 100% branch coverage
4. Set up GitHub Actions for CI/CD
5. Create Issues on GitHub repository
6. Document code changes in commits
7. Add test execution logs to repository

---

For more information about JUnit 5, see: https://junit.org/junit5/docs/current/user-guide/
