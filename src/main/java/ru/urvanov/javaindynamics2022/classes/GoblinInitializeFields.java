package ru.urvanov.javaindynamics2022.classes;

/**
 * Пример инициализации полей
 */
public class GoblinInitializeFields {
    int x = 300;

    int y = x * 3; // Будет вычислено значение и присвоено 900.

    public static void main(String[] args) {
        GoblinInitializeFields spider = new GoblinInitializeFields();
        System.out.println(spider.x);
        System.out.println(spider.y);
    }

    static int idCounter;

    int money;

    static {
        // Инициализация статических полей
        idCounter = 3;
    }

    {
        // Инициализации переменных экземпляров.
        money = 300;
    }
}
