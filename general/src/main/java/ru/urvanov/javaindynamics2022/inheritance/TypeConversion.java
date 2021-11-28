package ru.urvanov.javaindynamics2022.inheritance;

/**
 * Пример приведения типов
 */
public class TypeConversion {
    public static void main(String[] args) {
        Goblin obj = new Goblin();
        Object obj1 = new Goblin();
        Monster obj2 = new Goblin();
        Goblin goblin = (Goblin) obj;
    }
}
