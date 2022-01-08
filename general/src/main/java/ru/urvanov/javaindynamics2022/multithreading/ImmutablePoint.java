package ru.urvanov.javaindynamics2022.multithreading;

/**
 * Пример неизменяемого класса.
 */
public final class ImmutablePoint {
    private final double x;
    private final double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
