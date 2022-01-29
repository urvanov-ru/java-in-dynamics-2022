package ru.urvanov.javaindynamics2022.datetime;

import java.time.Month;
import java.time.YearMonth;

public class YearMonthExample {
    public static void main(String[] args) {
        YearMonth date = YearMonth.now();
        System.out.printf("%s: %d%n", date, date.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());

        YearMonth date4 = date.plusMonths(2).minusYears(3);
        System.out.println(date4);
    }
}
