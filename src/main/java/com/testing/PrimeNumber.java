package com.testing;

/**
 * Lop kiem tra so nguyen to
 */
public class PrimeNumber {
    
    /**
     * Kiem tra so co phai so nguyen to hay khong
     * @param n so can kiem tra
     * @return true neu n la so nguyen to, false neu khong
     * @throws IllegalArgumentException neu n nho hon 2
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("So phai lon hon hoac bang 2");
        }
        
        if (n == 2) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
        
        // Kiem tra cac uoc le tu 3 den can bac hai cua n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
