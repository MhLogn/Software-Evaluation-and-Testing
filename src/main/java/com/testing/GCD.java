package com.testing;

/**
 * Class for calculating Greatest Common Divisor (GCD)
 */
public class GCD {
    
    /**
     * Calculate the GCD of two numbers using Euclidean algorithm
     * @param a the first number
     * @param b the second number
     * @return the GCD of a and b
     * @throws IllegalArgumentException if either a or b is less than 1
     */
    public static int findGCD(int a, int b) {
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("Both numbers must be positive");
        }
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}
