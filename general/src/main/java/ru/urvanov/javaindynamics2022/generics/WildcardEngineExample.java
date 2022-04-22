package ru.urvanov.javaindynamics2022.generics;

import java.util.List;

public class WildcardEngineExample {

    class Ant{};

    class WarAnt extends Ant{};

    class WorkerAnt extends Ant{};

    void processAntsError(List<?> ants) {
        // Ошибка компиляции
        // ants.set(0, ants.get(0));
    }
}
