package ru.urvanov.javaindynamics2022.datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 20);
        System.out.println(date);

        LocalDate date2 = date.plusYears(1);
        System.out.println(date2);

        LocalDate date3 = date.minusDays(3);
        System.out.println(date3);
    }
}
