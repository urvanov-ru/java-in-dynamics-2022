package ru.urvanov.javaindynamics2022.classes;

/**
 * Пример полей классов
 */
public class GoblinFields {
    private int money;
    double health;
    protected int diamonds = 10;
    public String name;

    // Можно объявлять поля одного типа через запятую, НО!
    // Так делать НЕ рекомендуется
    int x, y, z; // Объявляем три переменные: x, y, z
}
