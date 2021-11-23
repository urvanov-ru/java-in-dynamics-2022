package ru.urvanov.javaindynamics2022.classes;

// Перегрузка методов. Пример 4.
class MethodOverloading4 {

    static class Monster {}

    static class Goblin extends Monster {}

    static class Hobgoblin extends Goblin {}

    static void method1(Monster obj) {
        System.out.println("1");
    }

    static void method1(Goblin obj) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Hobgoblin obj = new Hobgoblin();
        method1(obj);
    }

}