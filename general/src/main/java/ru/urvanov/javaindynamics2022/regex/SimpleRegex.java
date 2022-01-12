package ru.urvanov.javaindynamics2022.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Простой пример использования регулярного выражения
public class SimpleRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d\\d [a-z|A-Z]{2}");
        Matcher matcher1 = pattern.matcher("12 df");
        if (matcher1.matches()) {
            System.out.println("first matches");
        }

        Matcher matcher2 = pattern.matcher("89 33");
        if (matcher2.matches()) {
            System.out.println("second matches");
        }
    }
}
