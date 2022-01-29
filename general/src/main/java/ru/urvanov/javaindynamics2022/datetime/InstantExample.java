package ru.urvanov.javaindynamics2022.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class InstantExample {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();

        Instant oneHourLater = Instant.now();

        long secondsFromEpoch = Instant.ofEpochSecond(0L).until(Instant.now(),
                ChronoUnit.SECONDS);

        LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
        System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
                ldt.getYear(), ldt.getHour(), ldt.getMinute());
    }
}
