package com.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for Rectangle
 * Tests both perimeter and area calculation with white-box testing approach
 */
@DisplayName("Rectangle Test Suite")
public class RectangleTest {
    
    // ==================== Perimeter Tests ====================
    
    @Test
    @DisplayName("Calculate perimeter with positive dimensions")
    public void testPerimeterWithPositiveDimensions() {
        // Arrange
        double length = 5.0;
        double width = 3.0;
        double expected = 16.0; // 2 * (5 + 3)
        
        // Act
        double result = Rectangle.calculatePerimeter(length, width);
        
        // Assert
        assertEquals(expected, result, "Perimeter calculation failed");
    }
    
    @Test
    @DisplayName("Calculate perimeter with equal dimensions (square)")
    public void testPerimeterWithEqualDimensions() {
        double length = 4.0;
        double width = 4.0;
        double expected = 16.0;
        
        double result = Rectangle.calculatePerimeter(length, width);
        
        assertEquals(expected, result, "Perimeter calculation for square failed");
    }
    
    @Test
    @DisplayName("Calculate perimeter with decimal dimensions")
    public void testPerimeterWithDecimalDimensions() {
        double length = 2.5;
        double width = 1.5;
        double expected = 8.0; // 2 * (2.5 + 1.5)
        
        double result = Rectangle.calculatePerimeter(length, width);
        
        assertEquals(expected, result, "Perimeter calculation with decimals failed");
    }
    
    @Test
    @DisplayName("Perimeter throws exception when length is zero")
    public void testPerimeterThrowsExceptionWhenLengthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculatePerimeter(0, 5);
        }, "Should throw exception for zero length");
    }
    
    @Test
    @DisplayName("Perimeter throws exception when width is zero")
    public void testPerimeterThrowsExceptionWhenWidthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculatePerimeter(5, 0);
        }, "Should throw exception for zero width");
    }
    
    @Test
    @DisplayName("Perimeter throws exception when length is negative")
    public void testPerimeterThrowsExceptionWhenLengthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculatePerimeter(-5, 3);
        }, "Should throw exception for negative length");
    }
    
    @Test
    @DisplayName("Perimeter throws exception when width is negative")
    public void testPerimeterThrowsExceptionWhenWidthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculatePerimeter(5, -3);
        }, "Should throw exception for negative width");
    }
    
    @Test
    @DisplayName("Perimeter throws exception when both dimensions are negative")
    public void testPerimeterThrowsExceptionWhenBothNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculatePerimeter(-5, -3);
        }, "Should throw exception for both negative");
    }
    
    @Test
    @DisplayName("Perimeter with very small positive dimensions")
    public void testPerimeterWithVerySmallDimensions() {
        double length = 0.001;
        double width = 0.001;
        double expected = 0.004;
        
        double result = Rectangle.calculatePerimeter(length, width);
        
        assertEquals(expected, result, 0.0001, "Perimeter calculation with small values failed");
    }
    
    // ==================== Area Tests ====================
    
    @Test
    @DisplayName("Calculate area with positive dimensions")
    public void testAreaWithPositiveDimensions() {
        double length = 5.0;
        double width = 3.0;
        double expected = 15.0; // 5 * 3
        
        double result = Rectangle.calculateArea(length, width);
        
        assertEquals(expected, result, "Area calculation failed");
    }
    
    @Test
    @DisplayName("Calculate area with equal dimensions (square)")
    public void testAreaWithEqualDimensions() {
        double length = 4.0;
        double width = 4.0;
        double expected = 16.0;
        
        double result = Rectangle.calculateArea(length, width);
        
        assertEquals(expected, result, "Area calculation for square failed");
    }
    
    @Test
    @DisplayName("Calculate area with decimal dimensions")
    public void testAreaWithDecimalDimensions() {
        double length = 2.5;
        double width = 1.5;
        double expected = 3.75;
        
        double result = Rectangle.calculateArea(length, width);
        
        assertEquals(expected, result, "Area calculation with decimals failed");
    }
    
    @Test
    @DisplayName("Area throws exception when length is zero")
    public void testAreaThrowsExceptionWhenLengthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculateArea(0, 5);
        }, "Should throw exception for zero length");
    }
    
    @Test
    @DisplayName("Area throws exception when width is zero")
    public void testAreaThrowsExceptionWhenWidthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculateArea(5, 0);
        }, "Should throw exception for zero width");
    }
    
    @Test
    @DisplayName("Area throws exception when length is negative")
    public void testAreaThrowsExceptionWhenLengthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculateArea(-5, 3);
        }, "Should throw exception for negative length");
    }
    
    @Test
    @DisplayName("Area throws exception when width is negative")
    public void testAreaThrowsExceptionWhenWidthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle.calculateArea(5, -3);
        }, "Should throw exception for negative width");
    }
    
    @Test
    @DisplayName("Area with very small positive dimensions")
    public void testAreaWithVerySmallDimensions() {
        double length = 0.001;
        double width = 0.001;
        double expected = 0.000001;
        
        double result = Rectangle.calculateArea(length, width);
        
        assertEquals(expected, result, 0.000000001, "Area calculation with small values failed");
    }
}
