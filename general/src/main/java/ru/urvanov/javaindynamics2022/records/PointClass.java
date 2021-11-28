package ru.urvanov.javaindynamics2022.records;

import java.util.Objects;

public final class PointClass {

    private final int x;
    private final int y;

    public PointClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointClass point = (PointClass) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    public static void main(String[] args) {
        PointClass pointClass = new PointClass(100, 200);
        System.out.println("pointClass = " + pointClass);
    }
}
