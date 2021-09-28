package ru.urvanov.book.javaindynamics2022.controlflow;

/**
 * Примеры while
 */
public class While {
    public static void main(String[] args) {
        int n = 0;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }

        // Это тоже корректный код, но obj1 должен
        // иметь метод  someMethodReturnsBoolean(),
        // возвращающий boolean.
        A obj1 = new A();
        boolean b;
        while (b = obj1.someMethodReturnsBoolean()) {
            // операторы
        }
    }

    static class A {
        public boolean someMethodReturnsBoolean() {
            return false;
        }
    }
}
