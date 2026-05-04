package com.testing;

/**
 * Class for calculating factorial sum
 * S = 1! + 2! + 3! + ... + n!
 */
public class FactorialSum {
    
    /**
     * Calculate factorial of a number
     * @param n the number
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
    
    /**
     * Calculate sum of factorials from 1 to n
     * @param n the upper limit
     * @return the sum of factorials
     * @throws IllegalArgumentException if n is less than 1
     */
    public static long calculateSumOfFactorials(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be at least 1");
        }
        
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        
        return sum;
    }
}
