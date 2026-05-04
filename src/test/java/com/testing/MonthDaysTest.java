package com.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for MonthDays
 * Tests all branches: leap year, non-leap year, all months, invalid inputs
 */
@DisplayName("MonthDays Test Suite")
public class MonthDaysTest {
    
    // ==================== 31-Day Months ====================
    
    @Test
    @DisplayName("January has 31 days")
    public void testJanuaryDays() {
        int days = MonthDays.getDaysInMonth(1, 2024);
        assertEquals(31, days);
    }
    
    @Test
    @DisplayName("March has 31 days")
    public void testMarchDays() {
        int days = MonthDays.getDaysInMonth(3, 2024);
        assertEquals(31, days);
    }
    
    @Test
    @DisplayName("May has 31 days")
    public void testMayDays() {
        int days = MonthDays.getDaysInMonth(5, 2024);
        assertEquals(31, days);
    }
    
    @Test
    @DisplayName("July has 31 days")
    public void testJulyDays() {
        int days = MonthDays.getDaysInMonth(7, 2024);
        assertEquals(31, days);
    }
    
    @Test
    @DisplayName("August has 31 days")
    public void testAugustDays() {
        int days = MonthDays.getDaysInMonth(8, 2024);
        assertEquals(31, days);
    }
    
    @Test
    @DisplayName("October has 31 days")
    public void testOctoberDays() {
        int days = MonthDays.getDaysInMonth(10, 2024);
        assertEquals(31, days);
    }
    
    @Test
    @DisplayName("December has 31 days")
    public void testDecemberDays() {
        int days = MonthDays.getDaysInMonth(12, 2024);
        assertEquals(31, days);
    }
    
    // ==================== 30-Day Months ====================
    
    @Test
    @DisplayName("April has 30 days")
    public void testAprilDays() {
        int days = MonthDays.getDaysInMonth(4, 2024);
        assertEquals(30, days);
    }
    
    @Test
    @DisplayName("June has 30 days")
    public void testJuneDays() {
        int days = MonthDays.getDaysInMonth(6, 2024);
        assertEquals(30, days);
    }
    
    @Test
    @DisplayName("September has 30 days")
    public void testSeptemberDays() {
        int days = MonthDays.getDaysInMonth(9, 2024);
        assertEquals(30, days);
    }
    
    @Test
    @DisplayName("November has 30 days")
    public void testNovemberDays() {
        int days = MonthDays.getDaysInMonth(11, 2024);
        assertEquals(30, days);
    }
    
    // ==================== February - Leap Year ====================
    
    @Test
    @DisplayName("February in leap year (2024) has 29 days")
    public void testFebruaryLeapYear2024() {
        int days = MonthDays.getDaysInMonth(2, 2024);
        assertEquals(29, days);
    }
    
    @Test
    @DisplayName("February in leap year (2020) has 29 days")
    public void testFebruaryLeapYear2020() {
        int days = MonthDays.getDaysInMonth(2, 2020);
        assertEquals(29, days);
    }
    
    @Test
    @DisplayName("February in leap year (2000) has 29 days")
    public void testFebruaryLeapYear2000() {
        int days = MonthDays.getDaysInMonth(2, 2000);
        assertEquals(29, days);
    }
    
    @Test
    @DisplayName("February in leap year (divisible by 400)")
    public void testFebruaryLeapYearDivisibleBy400() {
        int days = MonthDays.getDaysInMonth(2, 2400);
        assertEquals(29, days);
    }
    
    // ==================== February - Non-Leap Year ====================
    
    @Test
    @DisplayName("February in non-leap year (2023) has 28 days")
    public void testFebruaryNonLeapYear2023() {
        int days = MonthDays.getDaysInMonth(2, 2023);
        assertEquals(28, days);
    }
    
    @Test
    @DisplayName("February in non-leap year (2021) has 28 days")
    public void testFebruaryNonLeapYear2021() {
        int days = MonthDays.getDaysInMonth(2, 2021);
        assertEquals(28, days);
    }
    
    @Test
    @DisplayName("February in century year not divisible by 400 (1900)")
    public void testFebruaryNonLeapYearCentury1900() {
        int days = MonthDays.getDaysInMonth(2, 1900);
        assertEquals(28, days);
    }
    
    @Test
    @DisplayName("February in century year not divisible by 400 (1800)")
    public void testFebruaryNonLeapYearCentury1800() {
        int days = MonthDays.getDaysInMonth(2, 1800);
        assertEquals(28, days);
    }
    
    @Test
    @DisplayName("February in odd year (2025)")
    public void testFebruaryNonLeapYearOdd() {
        int days = MonthDays.getDaysInMonth(2, 2025);
        assertEquals(28, days);
    }
    
    // ==================== Invalid Month Tests ====================
    
    @Test
    @DisplayName("Month 0 throws exception")
    public void testMonthZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MonthDays.getDaysInMonth(0, 2024);
        }, "Month 0 should throw exception");
    }
    
    @Test
    @DisplayName("Month 13 throws exception")
    public void testMonthThirteenThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MonthDays.getDaysInMonth(13, 2024);
        }, "Month 13 should throw exception");
    }
    
    @Test
    @DisplayName("Negative month throws exception")
    public void testNegativeMonthThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MonthDays.getDaysInMonth(-1, 2024);
        }, "Negative month should throw exception");
    }
    
    @Test
    @DisplayName("Very large month number throws exception")
    public void testVeryLargeMonthThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MonthDays.getDaysInMonth(100, 2024);
        }, "Month 100 should throw exception");
    }
    
    // ==================== Different Years ====================
    
    @Test
    @DisplayName("Test with year 1")
    public void testYear1() {
        int days = MonthDays.getDaysInMonth(1, 1);
        assertEquals(31, days);
    }
    
    @Test
    @DisplayName("Test with future year")
    public void testFutureYear() {
        int days = MonthDays.getDaysInMonth(2, 2100);
        assertEquals(28, days); // 2100 is not a leap year (divisible by 100 but not 400)
    }
    
    @Test
    @DisplayName("Test with very old year")
    public void testOldYear() {
        int days = MonthDays.getDaysInMonth(1, 1000);
        assertEquals(31, days);
    }
    
    @Test
    @DisplayName("All months consistency check for leap year")
    public void testAllMonthsLeapYear() {
        int daysTotal = 0;
        for (int month = 1; month <= 12; month++) {
            daysTotal += MonthDays.getDaysInMonth(month, 2024);
        }
        assertEquals(366, daysTotal, "Total days in leap year should be 366");
    }
    
    @Test
    @DisplayName("All months consistency check for non-leap year")
    public void testAllMonthsNonLeapYear() {
        int daysTotal = 0;
        for (int month = 1; month <= 12; month++) {
            daysTotal += MonthDays.getDaysInMonth(month, 2023);
        }
        assertEquals(365, daysTotal, "Total days in non-leap year should be 365");
    }
}
