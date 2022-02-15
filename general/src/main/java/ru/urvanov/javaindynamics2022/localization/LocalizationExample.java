package ru.urvanov.javaindynamics2022.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationExample {
    public static void main(String[] args) {
        ResourceBundle buttonLabels = ResourceBundle.getBundle(
                "ru.urvanov.javaindynamics2022.localization.ButtonLabel", new Locale("ru", "RU"));
        String okLabel = buttonLabels.getString("OkKey");
        System.out.println(okLabel);
    }
}
