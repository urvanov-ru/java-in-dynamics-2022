package ru.urvanov.javaindynamics2022.generics;

import java.util.List;

public class LowerBoundWildcard {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
