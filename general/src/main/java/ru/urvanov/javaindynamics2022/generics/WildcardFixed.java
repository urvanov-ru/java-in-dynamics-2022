package ru.urvanov.javaindynamics2022.generics;

import java.util.List;

public class WildcardFixed {

    void foo(List<?> i) {
        fooHelper(i);
    }

    // Вспомогательный метод создан так, чтобы
    // подстановочный символ мог быть захвачен.
    // через выведение типа.
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }

}