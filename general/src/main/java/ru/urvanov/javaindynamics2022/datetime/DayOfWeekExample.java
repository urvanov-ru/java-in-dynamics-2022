package ru.urvanov.javaindynamics2022.datetime;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekExample {
    public static void main(String[] args) {
        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = new Locale("ru", "RU");
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
    }
}
