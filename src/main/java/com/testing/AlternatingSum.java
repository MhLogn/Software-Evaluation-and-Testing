package com.testing;

/**
 * Lop tinh toan tong xen ke
 * S = 1 - 2 + 3 - 4 + ... + (-1)^(n+1) * n
 */
public class AlternatingSum {
    
    /**
     * Tinh toan tong xen ke tu 1 den n
     * @param n can tren
     * @return tong xen ke
     * @throws IllegalArgumentException neu n nho hon 1
     */
    public static long calculateSum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n phai lon hon hoac bang 1");
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
