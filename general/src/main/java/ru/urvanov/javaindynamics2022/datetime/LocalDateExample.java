package ru.urvanov.javaindynamics2022.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));

        DayOfWeek dotw = LocalDate.of(2012, Month.JULY, 9).getDayOfWeek();

        LocalDate date2 = LocalDate.of(2000, Month.NOVEMBER, 20);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDate nextWed2 = date2.with(adj);
        System.out.printf("Для даты %s следующей средой будет %s.%n",
                date, nextWed2);
    }
}
