package ru.urvanov.javaindynamics2022.generics;

import java.util.Arrays;
import java.util.List;

public class FantasyWorldEngine {

    public static <T> void union(List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    public static void invalid(List<Nymph>... lists) {
        Object[] objectArray = lists;     // ОК
        objectArray[0] = Arrays.asList("просто любой объект");
        Nymph s = lists[0].get(0);       // Здесь генерируется
                                          // ClassCastException
    }
}

class Nymph {

    private String name;

    public Nymph(String name) {
        this.name = name;
    }
}
