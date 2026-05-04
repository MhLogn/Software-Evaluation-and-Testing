package com.testing;

/**
 * Class for calculating rectangle properties
 */
public class Rectangle {
    
    /**
     * Calculate the perimeter of a rectangle
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the perimeter
     * @throws IllegalArgumentException if length or width is negative or zero
     */
    public static double calculatePerimeter(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers");
        }
        return 2 * (length + width);
    }
    
    /**
     * Calculate the area of a rectangle
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area
     * @throws IllegalArgumentException if length or width is negative or zero
     */
    public static double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers");
        }
        return length * width;
    }
}
