package ru.urvanov.javaindynamics2022.generics;

import java.util.Collections;
import java.util.List;

// Пример для раздела "Целевые типы"
public class TargetType {

    static void processStringList(List<String> stringList) {
        // process stringList
    }

    public static void main(String[] args) {
        List<String> listOne = Collections.emptyList();

        List<String> listTwo = Collections.<String>emptyList();

        processStringList(Collections.emptyList());

        processStringList(Collections.<String>emptyList());
    }
}
