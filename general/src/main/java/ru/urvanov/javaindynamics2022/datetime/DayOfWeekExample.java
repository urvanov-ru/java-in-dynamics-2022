package ru.urvanov.javaindynamics2022.datetime;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekExample {
    public static void main(String[] args) {
        DayOfWeek dow = DayOfWeek.MONDAY;
        // Можно использовать Locale.getDefault()
        // Либо вариант getDisplayName без указания локали
        Locale locale = new Locale("ru", "RU");
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));

        // Прибавляем два дня
        DayOfWeek dowPlusTwo = dow.plus(2);
        System.out.println(dowPlusTwo.getDisplayName(TextStyle.FULL, locale));
    }
}
