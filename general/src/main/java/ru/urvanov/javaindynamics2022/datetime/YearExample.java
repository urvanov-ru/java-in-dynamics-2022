package ru.urvanov.javaindynamics2022.datetime;

import java.time.Year;

public class YearExample {
    public static void main(String[] args) {
        Year year = Year.of(2022);
        System.out.println(year);

        Year year2 = year.plusYears(10);
        System.out.println(year2);
    }
}
