package ru.urvanov.javaindynamics2022.interfaces;

public interface GreekMonster {
    boolean isSensitiveToSilver();
    void logic(VisibleWorld visibleWorld);

    // Новый метод
    default void doSomething() {
        // Некий код
    }
}
