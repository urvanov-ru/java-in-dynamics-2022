package ru.urvanov.javaindynamics2022.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.of(2022, Month.JANUARY, 30, 19, 30, 0);
        ZoneOffset offset = ZoneOffset.of("+04:00");

        OffsetDateTime offsetDate = OffsetDateTime.of(localDate, offset);
    }
}
