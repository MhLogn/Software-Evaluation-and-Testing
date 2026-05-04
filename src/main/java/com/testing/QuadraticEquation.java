package com.testing;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for solving quadratic equations
 * Equation: ax² + bx + c = 0
 */
public class QuadraticEquation {
    
    /**
     * Solve a quadratic equation
     * @param a coefficient of x²
     * @param b coefficient of x
     * @param c constant term
     * @return a map with solutions or messages
     */
    public static Map<String, Object> solve(double a, double b, double c) {
        Map<String, Object> result = new HashMap<>();
        
        // Check if a is zero
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result.put("status", "infinite_solutions");
                    result.put("message", "Infinite solutions");
                } else {
                    result.put("status", "no_solution");
                    result.put("message", "No solution");
                }
            } else {
                // Linear equation: bx + c = 0
                result.put("status", "linear");
                result.put("solution", -c / b);
            }
            return result;
        }
        
        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result.put("status", "two_solutions");
            result.put("x1", x1);
            result.put("x2", x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            result.put("status", "one_solution");
            result.put("x", x);
        } else {
            result.put("status", "no_real_solution");
            result.put("discriminant", discriminant);
        }
        
        return result;
    }
}
