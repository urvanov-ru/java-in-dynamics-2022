package ru.urvanov.javaindynamics2022.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow);

        LocalDateTime localDateTime = LocalDateTime.of(
                2022, Month.NOVEMBER, 10, 12, 30, 0);
        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = localDateTimeNow.plusDays(3).minusMonths(4).plusYears(2);
        System.out.println(localDateTime2);
    }
}
