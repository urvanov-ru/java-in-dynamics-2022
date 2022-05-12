package ru.urvanov.javaindynamics2022.optional;

import java.util.Optional;

public class OptionalExample2 {

    static class MyClass {

        public Optional<Integer> getSomeValue() {
            return Optional.ofNullable(2);
        }
    }

    public static void main(String[] args) {
        Integer result = Optional.ofNullable(new MyClass())
                .flatMap(MyClass::getSomeValue)
                .orElse(Integer.valueOf(-1));
    }
}