package com.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for QuadraticEquation
 * Tests all branches and paths: two solutions, one solution, no real solution, 
 * linear equation, and infinite solutions
 */
@DisplayName("Quadratic Equation Test Suite")
public class QuadraticEquationTest {
    
    // ==================== Two Solutions (discriminant > 0) ====================
    
    @Test
    @DisplayName("Equation with two distinct real solutions")
    public void testTwoSolutions() {
        // a=1, b=-5, c=6 => x² - 5x + 6 = 0 => (x-2)(x-3)=0 => x1=3, x2=2
        Map<String, Object> result = QuadraticEquation.solve(1, -5, 6);
        
        assertEquals("two_solutions", result.get("status"));
        assertEquals(3.0, (double) result.get("x1"), 0.0001);
        assertEquals(2.0, (double) result.get("x2"), 0.0001);
    }
    
    @Test
    @DisplayName("Equation with two solutions (positive coefficients)")
    public void testTwoSolutionsPositive() {
        // a=1, b=-7, c=12 => x² - 7x + 12 = 0 => (x-3)(x-4)=0
        Map<String, Object> result = QuadraticEquation.solve(1, -7, 12);
        
        assertEquals("two_solutions", result.get("status"));
        double x1 = (double) result.get("x1");
        double x2 = (double) result.get("x2");
        assertTrue((x1 == 4 && x2 == 3) || (x1 == 3 && x2 == 4));
    }
    
    @Test
    @DisplayName("Equation with two negative solutions")
    public void testTwoNegativeSolutions() {
        // a=1, b=5, c=6 => x² + 5x + 6 = 0 => (x+2)(x+3)=0 => x=-2, x=-3
        Map<String, Object> result = QuadraticEquation.solve(1, 5, 6);
        
        assertEquals("two_solutions", result.get("status"));
        double x1 = (double) result.get("x1");
        double x2 = (double) result.get("x2");
        assertTrue((x1 == -2 && x2 == -3) || (x1 == -3 && x2 == -2));
    }
    
    @Test
    @DisplayName("Equation with two solutions (negative 'a')")
    public void testTwoSolutionsNegativeA() {
        // a=-1, b=5, c=-6 => -x² + 5x - 6 = 0
        Map<String, Object> result = QuadraticEquation.solve(-1, 5, -6);
        
        assertEquals("two_solutions", result.get("status"));
    }
    
    // ==================== One Solution (discriminant = 0) ====================
    
    @Test
    @DisplayName("Equation with one solution (perfect square)")
    public void testOneSolution() {
        // a=1, b=-2, c=1 => x² - 2x + 1 = 0 => (x-1)² = 0 => x=1
        Map<String, Object> result = QuadraticEquation.solve(1, -2, 1);
        
        assertEquals("one_solution", result.get("status"));
        assertEquals(1.0, (double) result.get("x"), 0.0001);
    }
    
    @Test
    @DisplayName("Equation with one solution (discriminant exactly 0)")
    public void testOneSolutionDiscriminantZero() {
        // a=1, b=-4, c=4 => x² - 4x + 4 = 0 => (x-2)² = 0 => x=2
        Map<String, Object> result = QuadraticEquation.solve(1, -4, 4);
        
        assertEquals("one_solution", result.get("status"));
        assertEquals(2.0, (double) result.get("x"), 0.0001);
    }
    
    @Test
    @DisplayName("Equation with one solution (negative a)")
    public void testOneSolutionNegativeA() {
        // a=-1, b=2, c=-1 => -x² + 2x - 1 = 0
        Map<String, Object> result = QuadraticEquation.solve(-1, 2, -1);
        
        assertEquals("one_solution", result.get("status"));
        assertEquals(1.0, (double) result.get("x"), 0.0001);
    }
    
    // ==================== No Real Solution (discriminant < 0) ====================
    
    @Test
    @DisplayName("Equation with no real solution")
    public void testNoRealSolution() {
        // a=1, b=0, c=1 => x² + 1 = 0 => no real solution
        Map<String, Object> result = QuadraticEquation.solve(1, 0, 1);
        
        assertEquals("no_real_solution", result.get("status"));
        assertTrue((double) result.get("discriminant") < 0);
    }
    
    @Test
    @DisplayName("Equation with no real solution (discriminant = -1)")
    public void testNoRealSolutionDiscriminantNegativeOne() {
        // a=1, b=0, c=1 => discriminant = -4
        Map<String, Object> result = QuadraticEquation.solve(1, 0, 1);
        
        assertEquals("no_real_solution", result.get("status"));
    }
    
    @Test
    @DisplayName("Equation with no real solution (large negative discriminant)")
    public void testNoRealSolutionLargeNegative() {
        // a=1, b=1, c=1 => x² + x + 1 = 0 => discriminant = 1 - 4 = -3
        Map<String, Object> result = QuadraticEquation.solve(1, 1, 1);
        
        assertEquals("no_real_solution", result.get("status"));
    }
    
    // ==================== Linear Equation (a = 0) ====================
    
    @Test
    @DisplayName("Linear equation (a=0, bx+c=0)")
    public void testLinearEquation() {
        // a=0, b=2, c=-4 => 2x - 4 = 0 => x = 2
        Map<String, Object> result = QuadraticEquation.solve(0, 2, -4);
        
        assertEquals("linear", result.get("status"));
        assertEquals(2.0, (double) result.get("solution"), 0.0001);
    }
    
    @Test
    @DisplayName("Linear equation with negative solution")
    public void testLinearEquationNegativeSolution() {
        // a=0, b=3, c=9 => 3x + 9 = 0 => x = -3
        Map<String, Object> result = QuadraticEquation.solve(0, 3, 9);
        
        assertEquals("linear", result.get("status"));
        assertEquals(-3.0, (double) result.get("solution"), 0.0001);
    }
    
    @Test
    @DisplayName("Linear equation with decimal solution")
    public void testLinearEquationDecimalSolution() {
        // a=0, b=2, c=-3 => 2x - 3 = 0 => x = 1.5
        Map<String, Object> result = QuadraticEquation.solve(0, 2, -3);
        
        assertEquals("linear", result.get("status"));
        assertEquals(1.5, (double) result.get("solution"), 0.0001);
    }
    
    // ==================== No Solution (a=0, b=0, c≠0) ====================
    
    @Test
    @DisplayName("No solution when a=0, b=0, c≠0")
    public void testNoSolution() {
        // a=0, b=0, c=5 => 0x + 5 = 0 => impossible
        Map<String, Object> result = QuadraticEquation.solve(0, 0, 5);
        
        assertEquals("no_solution", result.get("status"));
    }
    
    @Test
    @DisplayName("No solution when a=0, b=0, c is negative")
    public void testNoSolutionNegativeC() {
        // a=0, b=0, c=-5 => -5 = 0 => impossible
        Map<String, Object> result = QuadraticEquation.solve(0, 0, -5);
        
        assertEquals("no_solution", result.get("status"));
    }
    
    // ==================== Infinite Solutions (a=0, b=0, c=0) ====================
    
    @Test
    @DisplayName("Infinite solutions when a=0, b=0, c=0")
    public void testInfiniteSolutions() {
        // a=0, b=0, c=0 => 0 = 0 => infinite solutions
        Map<String, Object> result = QuadraticEquation.solve(0, 0, 0);
        
        assertEquals("infinite_solutions", result.get("status"));
    }
    
    // ==================== Edge Cases ====================
    
    @Test
    @DisplayName("Large coefficients")
    public void testLargeCoefficients() {
        // a=1000, b=-5000, c=6000
        Map<String, Object> result = QuadraticEquation.solve(1000, -5000, 6000);
        
        assertEquals("two_solutions", result.get("status"));
    }
    
    @Test
    @DisplayName("Very small coefficients")
    public void testVerySmallCoefficients() {
        // a=0.001, b=-0.005, c=0.006
        Map<String, Object> result = QuadraticEquation.solve(0.001, -0.005, 0.006);
        
        assertEquals("two_solutions", result.get("status"));
    }
    
    @Test
    @DisplayName("Negative 'a' with two solutions")
    public void testNegativeAGeneralCase() {
        // a=-2, b=8, c=-6
        Map<String, Object> result = QuadraticEquation.solve(-2, 8, -6);
        
        assertEquals("two_solutions", result.get("status"));
    }
}
