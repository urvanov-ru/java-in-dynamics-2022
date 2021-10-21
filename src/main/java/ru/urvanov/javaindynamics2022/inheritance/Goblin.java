package ru.urvanov.javaindynamics2022.inheritance;

public class Goblin extends Monster {

    @Override
    void instanceMethod() {
        System.out.println("Goblin instance method");
    }

    static void staticMethod() {
        System.out.println("Goblin static method");
    }
}