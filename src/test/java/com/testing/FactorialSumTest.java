package com.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for FactorialSum
 * S = 1! + 2! + 3! + ... + n!
 * Tests factorial calculation, loop iterations, and edge cases
 */
@DisplayName("FactorialSum Test Suite")
public class FactorialSumTest {
    
    // ==================== Factorial Tests ====================
    
    @Test
    @DisplayName("Factorial of 0 is 1")
    public void testFactorialOf0() {
        long result = FactorialSum.factorial(0);
        assertEquals(1, result, "0! should be 1");
    }
    
    @Test
    @DisplayName("Factorial of 1 is 1")
    public void testFactorialOf1() {
        long result = FactorialSum.factorial(1);
        assertEquals(1, result, "1! should be 1");
    }
    
    @Test
    @DisplayName("Factorial of 2 is 2")
    public void testFactorialOf2() {
        long result = FactorialSum.factorial(2);
        assertEquals(2, result, "2! should be 2");
    }
    
    @Test
    @DisplayName("Factorial of 3 is 6")
    public void testFactorialOf3() {
        long result = FactorialSum.factorial(3);
        assertEquals(6, result, "3! should be 6");
    }
    
    @Test
    @DisplayName("Factorial of 4 is 24")
    public void testFactorialOf4() {
        long result = FactorialSum.factorial(4);
        assertEquals(24, result, "4! should be 24");
    }
    
    @Test
    @DisplayName("Factorial of 5 is 120")
    public void testFactorialOf5() {
        long result = FactorialSum.factorial(5);
        assertEquals(120, result, "5! should be 120");
    }
    
    @Test
    @DisplayName("Factorial of 6 is 720")
    public void testFactorialOf6() {
        long result = FactorialSum.factorial(6);
        assertEquals(720, result, "6! should be 720");
    }
    
    @Test
    @DisplayName("Factorial of 7 is 5040")
    public void testFactorialOf7() {
        long result = FactorialSum.factorial(7);
        assertEquals(5040, result, "7! should be 5040");
    }
    
    @Test
    @DisplayName("Factorial of 10 is 3628800")
    public void testFactorialOf10() {
        long result = FactorialSum.factorial(10);
        assertEquals(3628800, result, "10! should be 3628800");
    }
    
    @Test
    @DisplayName("Factorial of 15 is 1307674368000")
    public void testFactorialOf15() {
        long result = FactorialSum.factorial(15);
        assertEquals(1307674368000L, result, "15! should be 1307674368000");
    }
    
    @Test
    @DisplayName("Factorial throws exception for negative number")
    public void testFactorialNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialSum.factorial(-1);
        }, "Factorial of negative number should throw exception");
    }
    
    @Test
    @DisplayName("Factorial throws exception for -100")
    public void testFactorialLargeNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialSum.factorial(-100);
        }, "Factorial of -100 should throw exception");
    }
    
    // ==================== Sum of Factorials Tests ====================
    
    @Test
    @DisplayName("Sum of factorials for n=1: S = 1! = 1")
    public void testSumFactorialsN1() {
        long result = FactorialSum.calculateSumOfFactorials(1);
        assertEquals(1, result, "Sum for n=1 should be 1");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=2: S = 1! + 2! = 1 + 2 = 3")
    public void testSumFactorialsN2() {
        long result = FactorialSum.calculateSumOfFactorials(2);
        assertEquals(3, result, "Sum for n=2 should be 3");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=3: S = 1! + 2! + 3! = 1 + 2 + 6 = 9")
    public void testSumFactorialsN3() {
        long result = FactorialSum.calculateSumOfFactorials(3);
        assertEquals(9, result, "Sum for n=3 should be 9");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=4: S = 1! + 2! + 3! + 4! = 1 + 2 + 6 + 24 = 33")
    public void testSumFactorialsN4() {
        long result = FactorialSum.calculateSumOfFactorials(4);
        assertEquals(33, result, "Sum for n=4 should be 33");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=5: S = 1 + 2 + 6 + 24 + 120 = 153")
    public void testSumFactorialsN5() {
        long result = FactorialSum.calculateSumOfFactorials(5);
        assertEquals(153, result, "Sum for n=5 should be 153");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=6: S = 1 + 2 + 6 + 24 + 120 + 720 = 873")
    public void testSumFactorialsN6() {
        long result = FactorialSum.calculateSumOfFactorials(6);
        assertEquals(873, result, "Sum for n=6 should be 873");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=7: S = 873 + 5040 = 5913")
    public void testSumFactorialsN7() {
        long result = FactorialSum.calculateSumOfFactorials(7);
        assertEquals(5913, result, "Sum for n=7 should be 5913");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=8: S = 5913 + 40320 = 46233")
    public void testSumFactorialsN8() {
        long result = FactorialSum.calculateSumOfFactorials(8);
        assertEquals(46233, result, "Sum for n=8 should be 46233");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=10: S = 3628799 + 3628800 = 4037913")
    public void testSumFactorialsN10() {
        long result = FactorialSum.calculateSumOfFactorials(10);
        // 1! + 2! + ... + 10! = 1 + 2 + 6 + 24 + 120 + 720 + 5040 + 40320 + 362880 + 3628800
        assertEquals(4037913, result, "Sum for n=10 should be 4037913");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=12")
    public void testSumFactorialsN12() {
        long result = FactorialSum.calculateSumOfFactorials(12);
        // 1! + 2! + ... + 12! = 479001599
        assertEquals(479001599L, result, "Sum for n=12 should be 479001599");
    }
    
    // ==================== Edge Cases ====================
    
    @Test
    @DisplayName("Sum of factorials for n=0 throws exception")
    public void testSumFactorialsN0ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialSum.calculateSumOfFactorials(0);
        }, "n=0 should throw exception");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=-1 throws exception")
    public void testSumFactorialsNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialSum.calculateSumOfFactorials(-1);
        }, "Negative n should throw exception");
    }
    
    @Test
    @DisplayName("Sum of factorials for n=-100 throws exception")
    public void testSumFactorialsLargeNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialSum.calculateSumOfFactorials(-100);
        }, "Large negative n should throw exception");
    }
    
    // ==================== Loop Boundary Tests ====================
    
    @Test
    @DisplayName("Sum starts with 1! in the loop")
    public void testLoopStartsWithOne() {
        long result1 = FactorialSum.calculateSumOfFactorials(1);
        long factorial1 = FactorialSum.factorial(1);
        assertEquals(factorial1, result1, "n=1 should be just 1!");
    }
    
    @Test
    @DisplayName("Sum accumulates correctly through iterations")
    public void testLoopAccumulation() {
        long sum3 = FactorialSum.calculateSumOfFactorials(3);
        long sum4 = FactorialSum.calculateSumOfFactorials(4);
        long fact4 = FactorialSum.factorial(4);
        assertEquals(sum3 + fact4, sum4, "Sum should accumulate correctly");
    }
    
    @Test
    @DisplayName("Verify incremental sum calculation")
    public void testIncrementalCalculation() {
        long expectedSum = 0;
        for (int i = 1; i <= 8; i++) {
            expectedSum += FactorialSum.factorial(i);
            long actualSum = FactorialSum.calculateSumOfFactorials(i);
            assertEquals(expectedSum, actualSum, "Sum calculation failed at n=" + i);
        }
    }
}
