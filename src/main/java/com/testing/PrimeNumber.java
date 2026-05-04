package com.testing;

/**
 * Class for checking prime numbers
 */
public class PrimeNumber {
    
    /**
     * Check if a number is prime
     * @param n the number to check
     * @return true if n is prime, false otherwise
     * @throws IllegalArgumentException if n is less than 2
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Number must be at least 2");
        }
        
        if (n == 2) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
        
        // Check odd divisors from 3 to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
