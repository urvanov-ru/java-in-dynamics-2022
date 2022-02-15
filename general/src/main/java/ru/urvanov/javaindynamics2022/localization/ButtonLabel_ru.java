package ru.urvanov.javaindynamics2022.localization;

import java.util.ListResourceBundle;

class ButtonLabel_ru extends ListResourceBundle {

    public ButtonLabel_ru() {

    }

    // Russian version
    public Object[][] getContents() {
        return contents;
    }
    static final Object[][] contents = {
            {"OkKey", "Угу"},
            {"CancelKey", "Отмена"},
    };
}