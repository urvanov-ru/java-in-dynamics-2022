package ru.urvanov.javaindynamics2022.generics;

import java.util.ArrayList;
import java.util.List;

public class HeapPollutionExample {

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