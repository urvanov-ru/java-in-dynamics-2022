package ru.urvanov.javaindynamics2022.generics;

class GenericConstructor<X> {
    <T> GenericConstructor(T t) {
        // ...
    }

    public static void main(String[] args) {
        new GenericConstructor<Integer>("");

        GenericConstructor<Integer> myObject = new GenericConstructor<>("");
    }
}