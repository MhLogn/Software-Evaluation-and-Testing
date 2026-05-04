package com.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for PrimeNumber
 * Tests all branches: small primes, even numbers, odd non-primes, 
 * large primes, and edge cases
 */
@DisplayName("PrimeNumber Test Suite")
public class PrimeNumberTest {
    
    // ==================== Valid Prime Numbers ====================
    
    @Test
    @DisplayName("2 is prime")
    public void testTwoIsPrime() {
        assertTrue(PrimeNumber.isPrime(2), "2 should be prime");
    }
    
    @Test
    @DisplayName("3 is prime")
    public void testThreeIsPrime() {
        assertTrue(PrimeNumber.isPrime(3), "3 should be prime");
    }
    
    @Test
    @DisplayName("5 is prime")
    public void testFiveIsPrime() {
        assertTrue(PrimeNumber.isPrime(5), "5 should be prime");
    }
    
    @Test
    @DisplayName("7 is prime")
    public void testSevenIsPrime() {
        assertTrue(PrimeNumber.isPrime(7), "7 should be prime");
    }
    
    @Test
    @DisplayName("11 is prime")
    public void testElevenIsPrime() {
        assertTrue(PrimeNumber.isPrime(11), "11 should be prime");
    }
    
    @Test
    @DisplayName("13 is prime")
    public void testThirteenIsPrime() {
        assertTrue(PrimeNumber.isPrime(13), "13 should be prime");
    }
    
    @Test
    @DisplayName("17 is prime")
    public void testSeventeenIsPrime() {
        assertTrue(PrimeNumber.isPrime(17), "17 should be prime");
    }
    
    @Test
    @DisplayName("19 is prime")
    public void testNineteenIsPrime() {
        assertTrue(PrimeNumber.isPrime(19), "19 should be prime");
    }
    
    @Test
    @DisplayName("23 is prime")
    public void testTwentyThreeIsPrime() {
        assertTrue(PrimeNumber.isPrime(23), "23 should be prime");
    }
    
    @Test
    @DisplayName("29 is prime")
    public void testTwentyNineIsPrime() {
        assertTrue(PrimeNumber.isPrime(29), "29 should be prime");
    }
    
    @Test
    @DisplayName("31 is prime")
    public void testThirtyOneIsPrime() {
        assertTrue(PrimeNumber.isPrime(31), "31 should be prime");
    }
    
    @Test
    @DisplayName("37 is prime")
    public void testThirtySevenIsPrime() {
        assertTrue(PrimeNumber.isPrime(37), "37 should be prime");
    }
    
    @Test
    @DisplayName("41 is prime")
    public void testFortyOneIsPrime() {
        assertTrue(PrimeNumber.isPrime(41), "41 should be prime");
    }
    
    @Test
    @DisplayName("43 is prime")
    public void testFortyThreeIsPrime() {
        assertTrue(PrimeNumber.isPrime(43), "43 should be prime");
    }
    
    @Test
    @DisplayName("47 is prime")
    public void testFortySevenIsPrime() {
        assertTrue(PrimeNumber.isPrime(47), "47 should be prime");
    }
    
    @Test
    @DisplayName("53 is prime")
    public void testFiftyThreeIsPrime() {
        assertTrue(PrimeNumber.isPrime(53), "53 should be prime");
    }
    
    @Test
    @DisplayName("Large prime: 97")
    public void testLargePrime97() {
        assertTrue(PrimeNumber.isPrime(97), "97 should be prime");
    }
    
    @Test
    @DisplayName("Large prime: 101")
    public void testLargePrime101() {
        assertTrue(PrimeNumber.isPrime(101), "101 should be prime");
    }
    
    @Test
    @DisplayName("Large prime: 997")
    public void testLargePrime997() {
        assertTrue(PrimeNumber.isPrime(997), "997 should be prime");
    }
    
    @Test
    @DisplayName("Large prime: 10007")
    public void testLargePrime10007() {
        assertTrue(PrimeNumber.isPrime(10007), "10007 should be prime");
    }
    
    // ==================== Even Numbers (Not Prime) ====================
    
    @Test
    @DisplayName("4 is not prime (even)")
    public void testFourIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(4), "4 should not be prime");
    }
    
    @Test
    @DisplayName("6 is not prime (even)")
    public void testSixIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(6), "6 should not be prime");
    }
    
    @Test
    @DisplayName("8 is not prime (even)")
    public void testEightIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(8), "8 should not be prime");
    }
    
    @Test
    @DisplayName("10 is not prime (even)")
    public void testTenIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(10), "10 should not be prime");
    }
    
    @Test
    @DisplayName("100 is not prime (even)")
    public void testHundredIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(100), "100 should not be prime");
    }
    
    // ==================== Odd Non-Prime Numbers ====================
    
    @Test
    @DisplayName("9 is not prime (3 × 3)")
    public void testNineIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(9), "9 should not be prime");
    }
    
    @Test
    @DisplayName("15 is not prime (3 × 5)")
    public void testFifteenIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(15), "15 should not be prime");
    }
    
    @Test
    @DisplayName("21 is not prime (3 × 7)")
    public void testTwentyOneIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(21), "21 should not be prime");
    }
    
    @Test
    @DisplayName("25 is not prime (5 × 5)")
    public void testTwentyFiveIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(25), "25 should not be prime");
    }
    
    @Test
    @DisplayName("27 is not prime (3 × 9)")
    public void testTwentySevenIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(27), "27 should not be prime");
    }
    
    @Test
    @DisplayName("33 is not prime (3 × 11)")
    public void testThirtyThreeIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(33), "33 should not be prime");
    }
    
    @Test
    @DisplayName("35 is not prime (5 × 7)")
    public void testThirtyFiveIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(35), "35 should not be prime");
    }
    
    @Test
    @DisplayName("49 is not prime (7 × 7)")
    public void testFortyNineIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(49), "49 should not be prime");
    }
    
    @Test
    @DisplayName("51 is not prime (3 × 17)")
    public void testFiftyOneIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(51), "51 should not be prime");
    }
    
    @Test
    @DisplayName("91 is not prime (7 × 13)")
    public void testNinetyOneIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(91), "91 should not be prime");
    }
    
    // ==================== Edge Cases ====================
    
    @Test
    @DisplayName("1 is not prime (throws exception)")
    public void testOneThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            PrimeNumber.isPrime(1);
        }, "1 should throw exception");
    }
    
    @Test
    @DisplayName("0 is not prime (throws exception)")
    public void testZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            PrimeNumber.isPrime(0);
        }, "0 should throw exception");
    }
    
    @Test
    @DisplayName("Negative number throws exception")
    public void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            PrimeNumber.isPrime(-5);
        }, "Negative number should throw exception");
    }
    
    @Test
    @DisplayName("Very large negative number throws exception")
    public void testVeryLargeNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            PrimeNumber.isPrime(-1000);
        }, "Very large negative should throw exception");
    }
}
