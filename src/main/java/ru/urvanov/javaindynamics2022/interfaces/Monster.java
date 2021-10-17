package ru.urvanov.javaindynamics2022.interfaces;

public interface Monster {

    // Объявляем константу
    int MONSTR_OBSTACLE_ID = 23;

    // методы


    boolean isSensitiveToSilver();

    void logic(VisibleWorld visibleWorld);

    void setPosition(double x, double y);

    boolean isAggressive();
}
