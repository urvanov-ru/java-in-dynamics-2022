package ru.urvanov.javaindynamics2022.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DurationExample {
    public static void main(String[] args) {
        ZonedDateTime t1 = ZonedDateTime.of(2022, 1, 1, 10, 30, 0, 0, ZoneId.of("Europe/Moscow"));
        ZonedDateTime t2 = ZonedDateTime.of(2022, 12, 1, 10, 30, 0, 0, ZoneId.of("Europe/Moscow"));

        long days = Duration.between(t1, t2).toDays();
        System.out.println("days = " + days);

        Instant start = Instant.now();

        Duration gap = Duration.ofSeconds(33);
        Instant later = start.plus(gap);
    }
}
