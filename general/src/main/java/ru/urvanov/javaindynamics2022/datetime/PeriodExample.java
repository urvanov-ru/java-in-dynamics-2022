package ru.urvanov.javaindynamics2022.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate localDateFrom = LocalDate.of(2022, 3, 1);
        LocalDate localDateTo = LocalDate.of(2022, 6, 30);
        Period period = Period.between(localDateFrom, localDateTo);
        System.out.println("years = " + period.getYears()
                + " months = " + period.getMonths()
                + " days = " + period.getDays());
        // years = 0 months = 3 days = 29
    }
}
