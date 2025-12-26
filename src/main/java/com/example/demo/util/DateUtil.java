package com.example.demo.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateUtil {

    private DateUtil() {
        // utility class – prevent object creation
    }

    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    public static LocalDate today() {
        return LocalDate.now();
    }

    public static boolean isFutureDate(LocalDate date) {
        return date.isAfter(LocalDate.now());
    }
}
