package ru.urvanov.javaindynamics2022.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 31);
        DayOfWeek dotw = date.getDayOfWeek();
        System.out.printf("%s выпадает на %s%n", date, dotw);

        System.out.printf("первый день месяца: %s%n",
                date.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.printf("первая пятница месяца: %s%n",
                date.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY)));
        System.out.printf("последний день месяца: %s%n",
                date.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.printf("первый день следующего месяца: %s%n",
                date.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.printf("первый день следующего года: %s%n",
                date.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.printf("первый день года: %s%n",
                date.with(TemporalAdjusters.firstDayOfYear()));
    }
}
