package com.testing;

/**
 * Lop tinh toan Uoc Chung Lon Nhat (UCLN)
 */
public class GCD {
    
    /**
     * Tinh UCLN cua hai so bang thuat toan Euclid
     * @param a so thu nhat
     * @param b so thu hai
     * @return UCLN cua a va b
     * @throws IllegalArgumentException neu a hoac b nho hon 1
     */
    public static int findGCD(int a, int b) {
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("Ca hai so phai la so duong");
        }
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}
