package com.testing;

/**
 * Lop tinh toan cac tinh chat cua hinh chu nhat
 */
public class Rectangle {
    
    /**
     * Tinh chu vi cua hinh chu nhat
     * @param length chieu dai cua hinh chu nhat
     * @param width chieu rong cua hinh chu nhat
     * @return chu vi
     * @throws IllegalArgumentException neu chieu dai hoac chieu rong am hoac bang 0
     */
    public static double calculatePerimeter(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai la cac so duong");
        }
        return 2 * (length + width);
    }
    
    /**
     * Tinh dien tich cua hinh chu nhat
     * @param length chieu dai cua hinh chu nhat
     * @param width chieu rong cua hinh chu nhat
     * @return dien tich
     * @throws IllegalArgumentException neu chieu dai hoac chieu rong am hoac bang 0
     */
    public static double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai la cac so duong");
        }
        return length * width;
    }
}
