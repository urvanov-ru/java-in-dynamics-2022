package ru.urvanov.javaindynamics2022.optional;

import java.util.Optional;

public class OptionalExample3 {

    static class MyClass {

        public Optional<Integer> getSomeValue() {
            return Optional.ofNullable(2);
        }
    }

    static class NoResultValueException extends Exception {
    }

    public static void main(String[] args) throws NoResultValueException {
        Integer result = Optional.ofNullable(new MyClass())
                .flatMap(MyClass::getSomeValue)
                .orElseThrow(NoResultValueException::new);
    }
}