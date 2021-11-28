package ru.urvanov.javaindynamics2022.classes;

// Перегрузка методов. Пример 1
class MethodOverloading1 {

    static void method1(int x) {
        System.out.println("1");
    }

    static void method1(long x) {
        System.out.println("2");
    }

    static void method1(float x) {
        System.out.println("3");
    }

    static void method1(double x) {
        System.out.println("4");
    }

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