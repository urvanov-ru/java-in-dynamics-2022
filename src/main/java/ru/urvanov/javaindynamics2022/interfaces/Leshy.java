package ru.urvanov.javaindynamics2022.interfaces;

public class Leshy implements Monster {
    private double x;
    private double y;

    @Override
    public boolean isSensitiveToSilver() {
        return false;
    }

    @Override
    public void logic(VisibleWorld visibleWorld) {
        // некая логика.
    }

    @Override
    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean isAggressive() {
        return false;
    }

}