package com.testing;

/**
 * Class for determining the number of days in a month
 */
public class MonthDays {
    
    /**
     * Get the number of days in a month
     * @param month the month (1-12)
     * @param year the year
     * @return the number of days in the month
     * @throws IllegalArgumentException if month is invalid
     */
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            
            case 2: // February
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            
            default:
                throw new IllegalArgumentException("Invalid month");
        }
    }
    
    /**
     * Check if a year is a leap year
     * @param year the year
     * @return true if leap year, false otherwise
     */
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
