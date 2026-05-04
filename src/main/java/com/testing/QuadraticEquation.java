package com.testing;

import java.util.HashMap;
import java.util.Map;

/**
 * Lop giai phuong trinh bac hai
 * Phuong trinh: ax² + bx + c = 0
 */
public class QuadraticEquation {
    
    /**
     * Giai mot phuong trinh bac hai
     * @param a he so cua x²
     * @param b he so cua x
     * @param c hang so
     * @return mot map chua cac nghiem hoac thong bao
     */
    public static Map<String, Object> solve(double a, double b, double c) {
        Map<String, Object> result = new HashMap<>();
        
        // Kiem tra neu a bang 0
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result.put("status", "infinite_solutions");
                    result.put("message", "Co vo so nghiem");
                } else {
                    result.put("status", "no_solution");
                    result.put("message", "Khong co nghiem");
                }
            } else {
                // Phuong trinh bac nhat: bx + c = 0
                result.put("status", "linear");
                result.put("solution", -c / b);
            }
            return result;
        }
        
        // Tinh delta (biet so)
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
