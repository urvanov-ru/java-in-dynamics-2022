package ru.urvanov.javaindynamics2022.datetime;

import java.time.Month;
import java.time.MonthDay;

public class MonthDayExample {
    public static void main(String[] args) {
        MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
        boolean validLeapYear = date.isValidYear(2010);
    }
}
