package ru.urvanov.javaindynamics2022.formatparse;

import java.util.Calendar;

public class FormatterExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2000, Calendar.FEBRUARY, 12, 10,0, 0);
        String s = String.format("Джонни родился: %1$te.%1$tm.%1$tY", c);
        System.out.println(s);
    }
}
