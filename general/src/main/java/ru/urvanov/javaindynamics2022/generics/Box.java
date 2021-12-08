package ru.urvanov.javaindynamics2022.generics;

public class Box<T> {

    public void add(T value) {
        // добавление value в Box
    }

    public void boxTest(Box<Number> n) { /* ... */ }

    public static void main(String[] args) {
        Box<Number> box = new Box<Number>();
        box.add(Integer.valueOf(10));   // OK
        box.add(Double.valueOf(10.1));  // OK
    }
}
