package ru.urvanov.javaindynamics2022.generics;

import java.util.ArrayList;
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

    public static void main(String[] args) {

        List<Nymph> stringListA = new ArrayList<>();
        List<Nymph> stringListB = new ArrayList<>();

        FantasyWorldEngine.union(stringListA,
                new Nymph("Эльза"),
                new Nymph("Мария"),
                new Nymph("Яна"),
                new Nymph("Оксана"));
        FantasyWorldEngine.union(stringListB,
                new Nymph("Джамиля"),
                new Nymph("Конни"),
                new Nymph("Екатерина"),
                new Nymph("Алиса"));
        List<List<Nymph>> listOfNymphLists =
                new ArrayList<>();
        FantasyWorldEngine.union(listOfNymphLists,
                stringListA, stringListB);

        // Выйдет ошибка, так как внутри метода вставляем строку
        // внутрь списка Нимф, а потом при попытке вытащить его оттуда
        // получаем ошибку.
        FantasyWorldEngine.invalid(
                List.of(
                        new Nymph("Конни"),
                        new Nymph("Эльвира")),
                List.of(new Nymph("Джамиля"),
                        new Nymph("Яна")));
    }
}

class Nymph {

    private String name;

    public Nymph(String name) {
        this.name = name;
    }
}
