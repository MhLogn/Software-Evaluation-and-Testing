package com.testing;

/**
 * Class for calculating alternating sum
 * S = 1 - 2 + 3 - 4 + ... + (-1)^(n+1) * n
 */
public class AlternatingSum {
    
    /**
     * Calculate alternating sum from 1 to n
     * @param n the upper limit
     * @return the alternating sum
     * @throws IllegalArgumentException if n is less than 1
     */
    public static long calculateSum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be at least 1");
        }
        
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }
}
