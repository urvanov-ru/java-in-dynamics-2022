package ru.urvanov.javaindynamics2022.enums;

public class DirectionTest {
    public static void main(String[] args) {
        // Объявление переменной
        Direction direction = Direction.NORTH;

        // Перебор всех значений перечисления
        for (Direction dir : Direction.values()) {
            System.out.println("toString(): " + dir.toString());
            System.out.println("ordinal(): " + dir.ordinal());
            System.out.println("name() :" + dir.name());
        }
    }
}
