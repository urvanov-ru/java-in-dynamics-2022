package ru.urvanov.javaindynamics2022.interfaces;

public class Pan implements GreekMonster {
    @Override
    public boolean isSensitiveToSilver() {
        return false;
    }

    @Override
    public void logic(VisibleWorld visibleWorld) {
        // некая логика.
    }
}