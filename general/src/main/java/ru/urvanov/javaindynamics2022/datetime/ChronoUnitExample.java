package ru.urvanov.javaindynamics2022.datetime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {
    public static void main(String[] args) {

        Instant previous = Instant.now(), current = Instant.now();
        long gap;
        current = Instant.now();
        if (previous != null) {
            gap = ChronoUnit.MILLIS.between(previous,current);
        }
    }
}
