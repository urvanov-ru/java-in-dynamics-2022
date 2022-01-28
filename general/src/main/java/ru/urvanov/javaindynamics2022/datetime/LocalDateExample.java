package ru.urvanov.javaindynamics2022.datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 20);
        System.out.println(date);
    }
}
