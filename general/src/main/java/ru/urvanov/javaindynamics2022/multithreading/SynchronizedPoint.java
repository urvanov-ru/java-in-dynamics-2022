package ru.urvanov.javaindynamics2022.multithreading;

/**
 * Пример синхронизированного класса.
 */
public class SynchronizedPoint {
    private double x;
    private double y;

    public SynchronizedPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public synchronized void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public synchronized void setX(double x) {
        this.x = x;
    }

    public synchronized  void setY(double y) {
        this.y = y;
    }

    public synchronized double getX() {
        return x;
    }

    public synchronized  double getY() {
        return y;
    }

    public void setIfPositive(double x, double y) {
        if ((x <=0) || (y <= 0)) {
            throw new IllegalArgumentException("negative");
        }
        synchronized (this) {
            this.x = x;
            this.y = y;
        }
    }
}
