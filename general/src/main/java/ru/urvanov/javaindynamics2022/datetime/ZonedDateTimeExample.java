package ru.urvanov.javaindynamics2022.datetime;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.of(
                2022, Month.JANUARY, 30, 19, 30, 0);
        ZoneId zoneId = ZoneId.of("Europe/Moscow");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, zoneId);
        System.out.println(zonedDateTime);

        System.out.println(zonedDateTime.plusMonths(2).minusYears(3));
    }
}
