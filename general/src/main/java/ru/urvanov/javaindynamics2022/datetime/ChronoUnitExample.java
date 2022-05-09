package ru.urvanov.javaindynamics2022.datetime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {
    public static void main(String[] args) {
        Instant previous = Instant.now();
        Instant current = Instant.now().plusMillis(10_000L);
        long gap = ChronoUnit.SECONDS.between(previous,current);
        System.out.println("difference in seconds: " + gap);
    }
}
