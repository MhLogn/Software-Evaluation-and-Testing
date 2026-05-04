---
name: "Issue 2: Error Branches & Edge Cases Tests"
about: "White-box tests for error branches, edge cases, and exceptions"
title: "Write JUnit white-box tests for error branches & edge cases"
---

# Issue 2: White-Box Tests for Error Branches & Edge Cases

## Description
Write comprehensive JUnit white-box tests for error branches, edge cases, boundary conditions, loops, and exception handling. These tests ensure robustness and handle invalid inputs properly.

## Programs to Test

### 1. Rectangle (Hình Chữ Nhật)
- [x] Test zero dimensions (throws exception)
- [x] Test negative dimensions (throws exception)
- [x] Test very small dimensions
- [x] Test boundary conditions

**Test Cases**: RectangleTest (tests 4-9, 13-16, 17)

**Branch Coverage**: 
- Length ≤ 0 (2 cases)
- Width ≤ 0 (2 cases)

### 2. Quadratic Equation (Phương Trình Bậc 2)
- [x] Test no real solution (Δ < 0)
- [x] Test all discriminant cases
- [x] Test edge cases (large/small coefficients)
- [x] Test different 'a' values

**Test Cases**: QuadraticEquationTest (tests 8-10, 14-15, 17-19)

**Branch Coverage**:
- a = 0 (3 cases)
- Δ > 0, = 0, < 0 (3 cases)
- b = 0 for linear (2 cases)

### 3. Month Days (Tính Số Ngày Của Một Tháng)
- [x] Test invalid months (0, 13, negative, > 12)
- [x] Test leap year edge cases (divisible by 400, 100, 4)
- [x] Test century years (1800, 1900, 2000, 2100)
- [x] Test year edge cases (1, 2100, future)

**Test Cases**: MonthDaysTest (tests 21-24, 15-20)

**Branch Coverage**:
- Month < 1 or > 12 (4 cases)
- Each month (12 cases)
- Leap year conditions (3 cases: div by 400, 100, 4)

### 4. Prime Number (Kiểm Tra Số Nguyên Tố)
- [x] Test invalid inputs (< 2)
- [x] Test even numbers
- [x] Test odd non-primes with different factors
- [x] Test boundary condition (n=2 special case)

**Test Cases**: PrimeNumberTest (tests 21-38)

**Branch Coverage**:
- n = 2 special case (1 case)
- n % 2 = 0 (5 cases)
- Divisor found in loop (10 cases)
- < 2 throws exception (4 cases)

### 5. Alternating Sum (Tính Tổng S = 1-2+3-4+...+n)
- [x] Test invalid input (n ≤ 0)
- [x] Test boundary (n=1)
- [x] Test loop iterations for small values
- [x] Test pattern verification

**Test Cases**: AlternatingSumTest (tests 17-19)

**Branch Coverage**:
- n < 1 (2 exception cases)
- i % 2 = 1 (odd numbers)
- i % 2 = 0 (even numbers)

### 6. GCD (Ước Chung Lớn Nhất)
- [x] Test zero inputs (throws exception)
- [x] Test negative inputs (throws exception)
- [x] Test same numbers
- [x] Test algorithm iterations
- [x] Test edge case (1, 1)

**Test Cases**: GCDTest (tests 22-28)

**Branch Coverage**:
- a < 1 or b < 1 (5 exception cases)
- While loop iterations (multiple paths)

### 7. Factorial Sum (Tính Tổng S = 1! + 2! + 3! + ... + n!)
- [x] Test negative n in factorial (throws exception)
- [x] Test negative n in sum (throws exception)
- [x] Test base cases (0!, 1!)
- [x] Test loop accumulation
- [x] Test loop boundaries

**Test Cases**: FactorialSumTest (tests 11-12, 23-28)

**Branch Coverage**:
- n < 0 (2 exception cases)
- n = 0 or 1 (special base case)
- Loop iterations (multiple paths)

## Coverage Goals

- **Statement Coverage**: 100% of error paths
- **Branch Coverage**: All error/edge case branches
- **Exception Testing**: All exception conditions
- **Boundary Values**: Edge cases for each program
- **Loop Conditions**: Entry, exit, iteration of loops

## Test Statistics

| Program | Error/Edge Tests | Branches Covered |
|---------|-----------------|-----------------|
| Rectangle | 9 | 2 |
| QuadraticEquation | 10 | 8 |
| MonthDays | 10 | 13 |
| PrimeNumber | 18 | 4 |
| AlternatingSum | 8 | 2 |
| GCD | 13 | 2 |
| FactorialSum | 12 | 4 |
| **TOTAL** | **88** | **35+** |

## Test Categories

### Exception Handling Tests
```java
// Pattern: Verify exception thrown
assertThrows(IllegalArgumentException.class, () -> {
    Function.method(invalidInput);
}, "Should throw exception for invalid input");
```

### Boundary Tests
```java
// Pattern: Test at boundary
assertEquals(expectedValue, Function.method(boundaryValue));
```

### Branch Coverage Tests
```java
// Pattern: Test each conditional branch
if (condition1) { /* test this */ }
else if (condition2) { /* test this */ }
```

### Loop Tests
```java
// Pattern: Test loop iterations
- Entry: first iteration
- Mid: normal iterations
- Exit: last iteration / when loop ends
```

## Acceptance Criteria

- [x] All error handling tests implemented
- [x] All exception tests pass
- [x] All boundary tests pass
- [x] All loop tests pass
- [x] 100% branch coverage achieved
- [x] All edge cases covered
- [x] No failures or errors

## References

- Rectangle test file: `src/test/java/com/testing/RectangleTest.java`
- Quadratic equation test file: `src/test/java/com/testing/QuadraticEquationTest.java`
- Month days test file: `src/test/java/com/testing/MonthDaysTest.java`
- Prime number test file: `src/test/java/com/testing/PrimeNumberTest.java`
- Alternating sum test file: `src/test/java/com/testing/AlternatingSumTest.java`
- GCD test file: `src/test/java/com/testing/GCDTest.java`
- Factorial sum test file: `src/test/java/com/testing/FactorialSumTest.java`

## Related Issues

- Issue 1: White-Box Tests for Valid Processing Flows

## Notes

See TEST_CASES.md for detailed test case documentation and TEST_EXECUTION_GUIDE.md for running tests.

## Quality Assurance Checklist

- [x] All tests follow naming convention
- [x] Tests have meaningful descriptions (@DisplayName)
- [x] Exception tests use assertThrows
- [x] Boundary tests have specific values
- [x] Loop tests cover entry/exit conditions
- [x] Coverage goals documented
- [x] No skipped tests
