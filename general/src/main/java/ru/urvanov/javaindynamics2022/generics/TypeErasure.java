package ru.urvanov.javaindynamics2022.generics;

public class TypeErasure {
    public static void main(String[] args) {
        Lair<Monster> monsterLair = new Lair<>();
        Lair<Integer> integerLair = new Lair<>();
        // Выведет true
        System.out.println(monsterLair.getClass() == integerLair.getClass());
    }
}
