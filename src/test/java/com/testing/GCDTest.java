package com.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for GCD (Greatest Common Divisor)
 * Tests Euclidean algorithm branches, loops, and edge cases
 */
@DisplayName("GCD Test Suite")
public class GCDTest {
    
    // ==================== Basic GCD Tests ====================
    
    @Test
    @DisplayName("GCD(10, 5) = 5")
    public void testGCD10And5() {
        int result = GCD.findGCD(10, 5);
        assertEquals(5, result, "GCD(10, 5) should be 5");
    }
    
    @Test
    @DisplayName("GCD(12, 8) = 4")
    public void testGCD12And8() {
        int result = GCD.findGCD(12, 8);
        assertEquals(4, result, "GCD(12, 8) should be 4");
    }
    
    @Test
    @DisplayName("GCD(15, 9) = 3")
    public void testGCD15And9() {
        int result = GCD.findGCD(15, 9);
        assertEquals(3, result, "GCD(15, 9) should be 3");
    }
    
    @Test
    @DisplayName("GCD(18, 12) = 6")
    public void testGCD18And12() {
        int result = GCD.findGCD(18, 12);
        assertEquals(6, result, "GCD(18, 12) should be 6");
    }
    
    @Test
    @DisplayName("GCD(20, 15) = 5")
    public void testGCD20And15() {
        int result = GCD.findGCD(20, 15);
        assertEquals(5, result, "GCD(20, 15) should be 5");
    }
    
    // ==================== Coprime Numbers (GCD = 1) ====================
    
    @Test
    @DisplayName("GCD(7, 5) = 1 (coprime)")
    public void testGCD7And5Coprime() {
        int result = GCD.findGCD(7, 5);
        assertEquals(1, result, "GCD(7, 5) should be 1");
    }
    
    @Test
    @DisplayName("GCD(13, 17) = 1 (coprime)")
    public void testGCD13And17Coprime() {
        int result = GCD.findGCD(13, 17);
        assertEquals(1, result, "GCD(13, 17) should be 1");
    }
    
    @Test
    @DisplayName("GCD(9, 16) = 1 (coprime)")
    public void testGCD9And16Coprime() {
        int result = GCD.findGCD(9, 16);
        assertEquals(1, result, "GCD(9, 16) should be 1");
    }
    
    @Test
    @DisplayName("GCD(25, 36) = 1 (coprime)")
    public void testGCD25And36Coprime() {
        int result = GCD.findGCD(25, 36);
        assertEquals(1, result, "GCD(25, 36) should be 1");
    }
    
    // ==================== One is Multiple of Other ====================
    
    @Test
    @DisplayName("GCD(20, 5) = 5 (20 is multiple of 5)")
    public void testGCD20And5Multiple() {
        int result = GCD.findGCD(20, 5);
        assertEquals(5, result, "GCD(20, 5) should be 5");
    }
    
    @Test
    @DisplayName("GCD(30, 10) = 10 (30 is multiple of 10)")
    public void testGCD30And10Multiple() {
        int result = GCD.findGCD(30, 10);
        assertEquals(10, result, "GCD(30, 10) should be 10");
    }
    
    @Test
    @DisplayName("GCD(100, 50) = 50 (100 is multiple of 50)")
    public void testGCD100And50Multiple() {
        int result = GCD.findGCD(100, 50);
        assertEquals(50, result, "GCD(100, 50) should be 50");
    }
    
    @Test
    @DisplayName("GCD(7, 35) = 7 (35 is multiple of 7)")
    public void testGCD7And35Multiple() {
        int result = GCD.findGCD(7, 35);
        assertEquals(7, result, "GCD(7, 35) should be 7");
    }
    
    // ==================== Same Numbers ====================
    
    @Test
    @DisplayName("GCD(5, 5) = 5")
    public void testGCDSameNumbers() {
        int result = GCD.findGCD(5, 5);
        assertEquals(5, result, "GCD(5, 5) should be 5");
    }
    
    @Test
    @DisplayName("GCD(100, 100) = 100")
    public void testGCDSameLargeNumbers() {
        int result = GCD.findGCD(100, 100);
        assertEquals(100, result, "GCD(100, 100) should be 100");
    }
    
    // ==================== Reversed Order ====================
    
    @Test
    @DisplayName("GCD(5, 10) = 5 (reversed order)")
    public void testGCDReversedOrder() {
        int result = GCD.findGCD(5, 10);
        assertEquals(5, result, "GCD(5, 10) should be 5");
    }
    
    @Test
    @DisplayName("GCD(8, 12) = 4 (reversed vs 12, 8)")
    public void testGCDReversedConsistency() {
        int result1 = GCD.findGCD(8, 12);
        int result2 = GCD.findGCD(12, 8);
        assertEquals(result1, result2, "GCD should be commutative");
        assertEquals(4, result1, "Both should equal 4");
    }
    
    // ==================== Large Numbers ====================
    
    @Test
    @DisplayName("GCD(48, 18) = 6")
    public void testGCD48And18() {
        int result = GCD.findGCD(48, 18);
        assertEquals(6, result, "GCD(48, 18) should be 6");
    }
    
    @Test
    @DisplayName("GCD(1071, 462) = 21")
    public void testGCD1071And462() {
        int result = GCD.findGCD(1071, 462);
        assertEquals(21, result, "GCD(1071, 462) should be 21");
    }
    
    @Test
    @DisplayName("GCD(270, 192) = 6")
    public void testGCD270And192() {
        int result = GCD.findGCD(270, 192);
        assertEquals(6, result, "GCD(270, 192) should be 6");
    }
    
    @Test
    @DisplayName("GCD(1000, 625) = 125")
    public void testGCD1000And625() {
        int result = GCD.findGCD(1000, 625);
        assertEquals(125, result, "GCD(1000, 625) should be 125");
    }
    
    // ==================== Edge Cases ====================
    
    @Test
    @DisplayName("GCD(0, 5) throws exception")
    public void testGCDWithZeroA() {
        assertThrows(IllegalArgumentException.class, () -> {
            GCD.findGCD(0, 5);
        }, "a=0 should throw exception");
    }
    
    @Test
    @DisplayName("GCD(5, 0) throws exception")
    public void testGCDWithZeroB() {
        assertThrows(IllegalArgumentException.class, () -> {
            GCD.findGCD(5, 0);
        }, "b=0 should throw exception");
    }
    
    @Test
    @DisplayName("GCD(0, 0) throws exception")
    public void testGCDWithBothZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            GCD.findGCD(0, 0);
        }, "Both zero should throw exception");
    }
    
    @Test
    @DisplayName("GCD(-5, 10) throws exception")
    public void testGCDWithNegativeA() {
        assertThrows(IllegalArgumentException.class, () -> {
            GCD.findGCD(-5, 10);
        }, "Negative a should throw exception");
    }
    
    @Test
    @DisplayName("GCD(5, -10) throws exception")
    public void testGCDWithNegativeB() {
        assertThrows(IllegalArgumentException.class, () -> {
            GCD.findGCD(5, -10);
        }, "Negative b should throw exception");
    }
    
    @Test
    @DisplayName("GCD(1, 1) = 1")
    public void testGCDOne() {
        int result = GCD.findGCD(1, 1);
        assertEquals(1, result, "GCD(1, 1) should be 1");
    }
    
    @Test
    @DisplayName("GCD(1, 1000) = 1")
    public void testGCDOneWithLarge() {
        int result = GCD.findGCD(1, 1000);
        assertEquals(1, result, "GCD(1, 1000) should be 1");
    }
}
