package ru.urvanov.javaindynamics2022.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardEngineExample {

    class Ant{};

    class WarAnt extends Ant{};

    class WorkerAnt extends Ant{};

    void processAntsError(List<?> ants) {
        // Ошибка компиляции
        // ants.set(0, ants.get(0));
    }

    void processAntsFixed(List<?> ants) {
        processAntsHelper(ants);
    }

    // Вспомогательный метод создан так,
    // чтобы подстановочный символ мог быть захвачен.
    // через выведение типа.
    private <T> void processAntsHelper(List<T> ants) {
        ants.set(0, ants.get(0));
    }

    void swapAnts(List<? extends Ant> l1, List<? extends Ant> l2) {
        Ant ant = l1.get(0);

        // Нельзя ошибка компиляции
        // l1.set(0, l2.get(0));

        // Нельзя ошибка компиляции
        // l2.set(0, ant);
    }

}
