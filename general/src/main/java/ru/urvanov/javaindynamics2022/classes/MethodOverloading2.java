package ru.urvanov.javaindynamics2022.classes;

// Перегрузка методов. Пример 2.
class MethodOverloading2 {

    static void method1(Short x) {
        System.out.println("5");
    }

    static void method1(short... x) {
        System.out.println("6");
    }

    public static void main(String[] args) {
        short x = 20;
        method1(x);
    }
}