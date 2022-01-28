package ru.urvanov.javaindynamics2022.datetime;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthExample {
    public static void main(String[] args) {
        Month month = Month.AUGUST;
        // Можно использовать Locale.getDefault()
        // Либо вариант getDisplayName без указания локали
        Locale locale = new Locale("ru", "RU");
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(
                TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(
                TextStyle.SHORT, locale));
    }
}
