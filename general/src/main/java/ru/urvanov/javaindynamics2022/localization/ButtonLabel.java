package ru.urvanov.javaindynamics2022.localization;

import java.util.ListResourceBundle;

class ButtonLabel extends ListResourceBundle {

    public ButtonLabel() {

    }

    // English version
    public Object[][] getContents() {
        return contents;
    }
    static final Object[][] contents = {
            {"OkKey", "OK"},
            {"CancelKey", "Cancel"},
    };
}