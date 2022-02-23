package com.example;

public final class LeapYear {
    public static boolean isLeap(int year) {
        return divides(year, 4) && (!divides(year, 100) || divides(year, 400));
    }

    private static boolean divides(int x, int y) {
        return x % y == 0;
    }

    private LeapYear() {
    }
}
