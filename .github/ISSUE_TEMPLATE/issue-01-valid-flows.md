---
name: "Issue 1: Valid Processing Flows Tests"
about: "White-box tests for valid processing flows"
title: "Write JUnit white-box tests for valid processing flows"
---

# Issue 1: White-Box Tests for Valid Processing Flows

## Description
Write comprehensive JUnit white-box tests for valid processing flows of all programs. These tests focus on normal use cases with valid inputs and expected outputs.

## Programs to Test

### 1. Rectangle (Hình Chữ Nhật)
- [x] Test perimeter calculation with positive dimensions
- [x] Test area calculation with positive dimensions
- [x] Test with equal dimensions (square)
- [x] Test with decimal values
- [x] Test with small values

**Test Cases**: RectangleTest (tests 1-3, 10-12)

### 2. Quadratic Equation (Phương Trình Bậc 2)
- [x] Test equation with two distinct real solutions
- [x] Test equation with one solution (perfect square)
- [x] Test linear equation (a=0)
- [x] Test infinite solutions (0=0)

**Test Cases**: QuadraticEquationTest (tests 1-7, 11-13, 16)

### 3. Month Days (Tính Số Ngày Của Một Tháng)
- [x] Test all 12 months
- [x] Test leap year February
- [x] Test non-leap year February
- [x] Test all year types (leap/non-leap)

**Test Cases**: MonthDaysTest (tests 1-20, 25-26)

### 4. Prime Number (Kiểm Tra Số Nguyên Tố)
- [x] Test small prime numbers (2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53)
- [x] Test large prime numbers (97, 101, 997, 10007)
- [x] Test pattern for odd primes
- [x] Test pattern for even non-primes

**Test Cases**: PrimeNumberTest (tests 1-20)

### 5. Alternating Sum (Tính Tổng S = 1-2+3-4+...+n)
- [x] Test small values (n=1 to n=8)
- [x] Test pattern for odd n: S = (n+1)/2
- [x] Test pattern for even n: S = -n/2
- [x] Test larger values (n=100, n=1000)

**Test Cases**: AlternatingSumTest (tests 1-10, 11-13, 20-21)

### 6. GCD (Ước Chung Lớn Nhất)
- [x] Test basic GCD calculations
- [x] Test when one number is multiple of other
- [x] Test same numbers
- [x] Test coprime numbers
- [x] Test Euclidean algorithm iterations

**Test Cases**: GCDTest (tests 1-5, 10-17)

### 7. Factorial Sum (Tính Tổng S = 1! + 2! + 3! + ... + n!)
- [x] Test factorial base cases (0!, 1!)
- [x] Test factorial calculations (2! to 15!)
- [x] Test sum of factorials for n=1 to n=12
- [x] Test accumulation through loop

**Test Cases**: FactorialSumTest (tests 1-10, 13-22)

## Coverage Goals

- **Statement Coverage**: 100% of valid paths
- **Branch Coverage**: All valid branches
- **Boundary Values**: Lower and upper bounds

## Test Statistics

| Program | Valid Tests | Statements Covered |
|---------|------------|-------------------|
| Rectangle | 5 | 100% |
| QuadraticEquation | 7 | 100% |
| MonthDays | 20 | 100% |
| PrimeNumber | 20 | 100% |
| AlternatingSum | 13 | 100% |
| GCD | 8 | 100% |
| FactorialSum | 17 | 100% |
| **TOTAL** | **90** | **100%** |

## Acceptance Criteria

- [x] All valid processing tests implemented
- [x] All tests pass (green checkmarks)
- [x] No failures or errors
- [x] Coverage report shows valid paths covered

## References

- Rectangle test file: `src/test/java/com/testing/RectangleTest.java`
- Quadratic equation test file: `src/test/java/com/testing/QuadraticEquationTest.java`
- Month days test file: `src/test/java/com/testing/MonthDaysTest.java`
- Prime number test file: `src/test/java/com/testing/PrimeNumberTest.java`
- Alternating sum test file: `src/test/java/com/testing/AlternatingSumTest.java`
- GCD test file: `src/test/java/com/testing/GCDTest.java`
- Factorial sum test file: `src/test/java/com/testing/FactorialSumTest.java`

## Related Issues

- Issue 2: White-Box Tests for Error Branches & Edge Cases

## Notes

See TEST_CASES.md for detailed test case documentation and TEST_EXECUTION_GUIDE.md for running tests.
