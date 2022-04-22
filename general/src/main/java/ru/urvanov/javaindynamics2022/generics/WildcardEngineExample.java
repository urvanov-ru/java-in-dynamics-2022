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

    void processAntsFixed(List<?> ants) {
        processAntsHelper(ants);
    }

    // Вспомогательный метод создан так,
    // чтобы подстановочный символ мог быть захвачен.
    // через выведение типа.
    private <T> void processAntsHelper(List<T> ants) {
        ants.set(0, ants.get(0));
    }
}
