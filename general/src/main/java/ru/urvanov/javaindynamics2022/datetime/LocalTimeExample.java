package ru.urvanov.javaindynamics2022.datetime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // 10 часов 30 минут
        LocalTime localTime0 = LocalTime.of(10, 30);

        // 10 часов 30 минут 45 секунд
        LocalTime localTime1 = LocalTime.of(10, 30, 45);

        // 10 часов 30 минут 45 секунд 100 наносекунд
        LocalTime localTime2 = LocalTime.of(10, 30, 45, 100);


        // Методы plus* и minus*
        LocalTime localTime3 = localTime0.plusHours(2).minusMinutes(10).plusSeconds(15);

    }
}
