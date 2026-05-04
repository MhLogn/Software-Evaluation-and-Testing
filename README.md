# Software Evaluation and Testing - White-Box Testing Practice

## Project Description

This project implements white-box testing practices using Java and JUnit 5. It includes 8 practical programs with comprehensive test cases designed to achieve high code coverage (100% statement coverage and 100% branch coverage).

## Programs Implemented

### 1. Rectangle (Hình Chữ Nhật)
- `Rectangle.calculatePerimeter(length, width)` - Calculate perimeter of rectangle
- `Rectangle.calculateArea(length, width)` - Calculate area of rectangle
- **Branches**: 2 (input validation)
- **Test Cases**: 17 tests

### 2. Quadratic Equation (Phương Trình Bậc 2)
- `QuadraticEquation.solve(a, b, c)` - Solve ax² + bx + c = 0
- **Branches**: 8 (a=0, discriminant >0, =0, <0)
- **Test Cases**: 24 tests
- **Coverage**: Two solutions, one solution, no real solution, linear equation, infinite solutions

### 3. Month Days (Tính Số Ngày Của Một Tháng)
- `MonthDays.getDaysInMonth(month, year)` - Get days in month
- **Branches**: 12 months + leap year logic
- **Test Cases**: 25 tests
- **Coverage**: All months, leap year rules (divisible by 400, 100, 4)

### 4. Prime Number (Kiểm Tra Số Nguyên Tố)
- `PrimeNumber.isPrime(n)` - Check if n is prime
- **Branches**: 4 (n=2, even, divisor found, loop end)
- **Test Cases**: 38 tests
- **Coverage**: Primes, even numbers, odd composites, edge cases

### 5. Alternating Sum (Tính Tổng S = 1-2+3-4+...+n)
- `AlternatingSum.calculateSum(n)` - Calculate alternating sum
- **Branches**: 2 (odd/even pattern)
- **Test Cases**: 21 tests
- **Coverage**: Boundary values, pattern verification

### 6. GCD (Ước Chung Lớn Nhất)
- `GCD.findGCD(a, b)` - Find GCD using Euclidean algorithm
- **Branches**: 1 loop (while b != 0)
- **Test Cases**: 24 tests
- **Coverage**: Multiples, coprimes, reversed order, edge cases

### 7. Factorial Sum (Tính Tổng S = 1! + 2! + 3! + ... + n!)
- `FactorialSum.factorial(n)` - Calculate factorial
- `FactorialSum.calculateSumOfFactorials(n)` - Calculate sum of factorials
- **Branches**: 2 (n=0/1 special case, loop)
- **Test Cases**: 29 tests
- **Coverage**: Base cases, loop iterations, accumulation

## Project Structure

```
Buoi 4.1/
├── pom.xml                          # Maven configuration
├── README.md                        # This file
├── TEST_CASES.md                   # Detailed test case documentation
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/testing/
│   │           ├── Rectangle.java
│   │           ├── QuadraticEquation.java
│   │           ├── MonthDays.java
│   │           ├── PrimeNumber.java
│   │           ├── AlternatingSum.java
│   │           ├── GCD.java
│   │           └── FactorialSum.java
│   └── test/
│       └── java/
│           └── com/testing/
│               ├── RectangleTest.java
│               ├── QuadraticEquationTest.java
│               ├── MonthDaysTest.java
│               ├── PrimeNumberTest.java
│               ├── AlternatingSumTest.java
│               ├── GCDTest.java
│               └── FactorialSumTest.java
└── target/                         # Build output
    └── coverage/                   # JaCoCo coverage report
```

## Requirements Met

✓ **Java Implementation**: All programs written in Java  
✓ **Organized Structure**: Code organized into separate classes/methods  
✓ **JUnit Testing**: Comprehensive JUnit 5 test suite  
✓ **Code Analysis**: Statement and branch identification  
✓ **High Coverage**: Aim for 100% statement and 100% branch coverage  
✓ **GitHub Integration**: Code pushed to repository  

## Test Coverage Goals

Each test suite is designed to:

1. **Statement Coverage (100%)**: Every executable statement is executed by at least one test
2. **Branch Coverage (100%)**: Every conditional branch is tested for both true and false
3. **Edge Cases**: Boundary values, invalid inputs, special cases
4. **Exception Handling**: Input validation and error conditions

## Test Statistics

| Program | Test Cases | Statements | Branches |
|---------|-----------|-----------|----------|
| Rectangle | 17 | 10 | 2 |
| QuadraticEquation | 24 | 30+ | 8 |
| MonthDays | 25 | 20+ | 13 |
| PrimeNumber | 38 | 10+ | 4 |
| AlternatingSum | 21 | 5+ | 2 |
| GCD | 24 | 8+ | 2 |
| FactorialSum | 29 | 15+ | 4 |
| **TOTAL** | **178** | **98+** | **35+** |

## How to Run Tests

### Prerequisites
- Java 11 or higher
- Maven 3.6.0 or higher

### Run All Tests
```bash
mvn clean test
```

### Run Specific Test Class
```bash
mvn test -Dtest=RectangleTest
mvn test -Dtest=QuadraticEquationTest
```

### Generate Coverage Report
```bash
mvn clean test jacoco:report
```

Coverage report will be generated at: `target/site/jacoco/index.html`

### Run Tests with Detailed Output
```bash
mvn test -X
```

## Test Case Design Methodology

### 1. Valid Processing Flows (Issue 1)
- Normal use cases with valid inputs
- Expected output verification
- Pattern verification for algorithms

### 2. Error Branches & Edge Cases (Issue 2)
- Boundary value testing
- Invalid input handling
- Loop edge conditions
- Exception scenarios
- Conditional branch testing

## GitHub Issues

### Issue 1: White-Box Tests for Valid Processing Flows
Covers test cases for:
- Normal rectangle dimensions
- Quadratic equations with real solutions
- All month lengths
- Prime numbers
- Alternating sum calculations
- GCD calculations
- Factorial sum calculations

### Issue 2: White-Box Tests for Error Branches & Edge Cases
Covers test cases for:
- Invalid inputs (zero, negative values)
- Boundary conditions
- Exception handling
- Special cases (leap year, perfect squares, etc.)
- Loop boundaries
- Conditional branches

## Code Quality

- **Language**: Java 11
- **Testing Framework**: JUnit 5
- **Coverage Tool**: JaCoCo
- **Build Tool**: Maven
- **Code Style**: Following Java conventions

## White-Box Testing Approach

Each test class identifies and tests:

1. **Statements**: Every line of executable code
2. **Branches**: All conditional paths (if/else, switch)
3. **Loops**: Entry, iterations, exit conditions
4. **Exceptions**: Error conditions and exception throwing

## Author Notes

This project demonstrates comprehensive white-box testing practices with focus on:
- Complete branch coverage
- Boundary value analysis
- Exception testing
- Loop boundary conditions
- Conditional logic verification

## License

Educational project for Software Testing course

## References

- JUnit 5 Documentation: https://junit.org/junit5/docs/current/user-guide/
- Java Code Coverage: https://www.eclemma.org/jacoco/
- White-Box Testing: https://en.wikipedia.org/wiki/White-box_testing
