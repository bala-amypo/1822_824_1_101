package com.example.demo.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateUtil {

    private DateUtil() {
        // prevent object creation
    }

    // Current Date
    public static LocalDate today() {
        return LocalDate.now();
    }

    // Current Date & Time
    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    // Check future date (ConsumptionLog validation)
    public static boolean isFutureDate(LocalDate date) {
        return date.isAfter(LocalDate.now());
    }

    // Check past or today
    public static boolean isPastOrToday(LocalDate date) {
        return !date.isAfter(LocalDate.now());
    }
}
