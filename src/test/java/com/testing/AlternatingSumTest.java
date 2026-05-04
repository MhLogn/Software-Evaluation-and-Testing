package com.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for AlternatingSum
 * S = 1 - 2 + 3 - 4 + ... + (-1)^(n+1) * n
 * Tests boundary conditions, loops, and edge cases
 */
@DisplayName("AlternatingSum Test Suite")
public class AlternatingSumTest {
    
    // ==================== Small Values ====================
    
    @Test
    @DisplayName("n=1: S = 1")
    public void testN1() {
        long result = AlternatingSum.calculateSum(1);
        assertEquals(1, result, "Sum for n=1 should be 1");
    }
    
    @Test
    @DisplayName("n=2: S = 1 - 2 = -1")
    public void testN2() {
        long result = AlternatingSum.calculateSum(2);
        assertEquals(-1, result, "Sum for n=2 should be -1");
    }
    
    @Test
    @DisplayName("n=3: S = 1 - 2 + 3 = 2")
    public void testN3() {
        long result = AlternatingSum.calculateSum(3);
        assertEquals(2, result, "Sum for n=3 should be 2");
    }
    
    @Test
    @DisplayName("n=4: S = 1 - 2 + 3 - 4 = -2")
    public void testN4() {
        long result = AlternatingSum.calculateSum(4);
        assertEquals(-2, result, "Sum for n=4 should be -2");
    }
    
    @Test
    @DisplayName("n=5: S = 1 - 2 + 3 - 4 + 5 = 3")
    public void testN5() {
        long result = AlternatingSum.calculateSum(5);
        assertEquals(3, result, "Sum for n=5 should be 3");
    }
    
    // ==================== Pattern Verification ====================
    
    @Test
    @DisplayName("n=6: S = 1 - 2 + 3 - 4 + 5 - 6 = -3")
    public void testN6() {
        long result = AlternatingSum.calculateSum(6);
        assertEquals(-3, result, "Sum for n=6 should be -3");
    }
    
    @Test
    @DisplayName("n=7: S = 1 - 2 + 3 - 4 + 5 - 6 + 7 = 4")
    public void testN7() {
        long result = AlternatingSum.calculateSum(7);
        assertEquals(4, result, "Sum for n=7 should be 4");
    }
    
    @Test
    @DisplayName("n=8: S = 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 = -4")
    public void testN8() {
        long result = AlternatingSum.calculateSum(8);
        assertEquals(-4, result, "Sum for n=8 should be -4");
    }
    
    @Test
    @DisplayName("n=10: S = -5")
    public void testN10() {
        long result = AlternatingSum.calculateSum(10);
        assertEquals(-5, result, "Sum for n=10 should be -5");
    }
    
    @Test
    @DisplayName("n=11: S = 6")
    public void testN11() {
        long result = AlternatingSum.calculateSum(11);
        assertEquals(6, result, "Sum for n=11 should be 6");
    }
    
    // ==================== Odd vs Even Pattern ====================
    
    @Test
    @DisplayName("Odd n=99: S = 50")
    public void testOddN99() {
        long result = AlternatingSum.calculateSum(99);
        assertEquals(50, result, "Sum for odd n=99 should be 50");
    }
    
    @Test
    @DisplayName("Even n=100: S = -50")
    public void testEvenN100() {
        long result = AlternatingSum.calculateSum(100);
        assertEquals(-50, result, "Sum for even n=100 should be -50");
    }
    
    @Test
    @DisplayName("Odd n=101: S = 51")
    public void testOddN101() {
        long result = AlternatingSum.calculateSum(101);
        assertEquals(51, result, "Sum for odd n=101 should be 51");
    }
    
    // ==================== Larger Values ====================
    
    @Test
    @DisplayName("n=1000: S = -500")
    public void testN1000() {
        long result = AlternatingSum.calculateSum(1000);
        assertEquals(-500, result, "Sum for n=1000 should be -500");
    }
    
    @Test
    @DisplayName("n=1001: S = 501")
    public void testN1001() {
        long result = AlternatingSum.calculateSum(1001);
        assertEquals(501, result, "Sum for n=1001 should be 501");
    }
    
    @Test
    @DisplayName("n=10000: S = -5000")
    public void testN10000() {
        long result = AlternatingSum.calculateSum(10000);
        assertEquals(-5000, result, "Sum for n=10000 should be -5000");
    }
    
    // ==================== Edge Cases ====================
    
    @Test
    @DisplayName("n=0 throws exception")
    public void testN0ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            AlternatingSum.calculateSum(0);
        }, "n=0 should throw exception");
    }
    
    @Test
    @DisplayName("n=-1 throws exception")
    public void testNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            AlternatingSum.calculateSum(-1);
        }, "Negative n should throw exception");
    }
    
    @Test
    @DisplayName("n=-100 throws exception")
    public void testLargeNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            AlternatingSum.calculateSum(-100);
        }, "Large negative n should throw exception");
    }
    
    // ==================== Pattern Formula Verification ====================
    
    @Test
    @DisplayName("Verify pattern: for odd n, S = (n+1)/2")
    public void testOddPattern() {
        for (int n = 1; n <= 99; n += 2) {
            long result = AlternatingSum.calculateSum(n);
            long expected = (n + 1) / 2;
            assertEquals(expected, result, "Pattern verification failed for n=" + n);
        }
    }
    
    @Test
    @DisplayName("Verify pattern: for even n, S = -n/2")
    public void testEvenPattern() {
        for (int n = 2; n <= 100; n += 2) {
            long result = AlternatingSum.calculateSum(n);
            long expected = -n / 2;
            assertEquals(expected, result, "Pattern verification failed for n=" + n);
        }
    }
}
