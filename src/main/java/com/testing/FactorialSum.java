package com.testing;

/**
 * Lop tinh toan tong cac thua so
 * S = 1! + 2! + 3! + ... + n!
 */
public class FactorialSum {
    
    /**
     * Tinh giai thua cua mot so
     * @param n so do
     * @return giai thua cua n
     * @throws IllegalArgumentException neu n am
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Giai thua khong xac dinh cho cac so am");
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
     * Tinh tong cac giai thua tu 1 den n
     * @param n can tren
     * @return tong cac giai thua
     * @throws IllegalArgumentException neu n nho hon 1
     */
    public static long calculateSumOfFactorials(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n phai lon hon hoac bang 1");
        }
        
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        
        return sum;
    }
}
