package ru.urvanov.javaindynamics2022.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample1 {
    static class A {
        public B getB() {
            return new B();
        }
    }

    static class B {
        public C getC() {
            return new C();
        }
    }

    static class C {
        public D getD() {
            return new D("from C");
        }
    }

    static class D {
        private String value;
        public D(String value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "D [value=" + value + "]";
        }
    }

    static class E {}

    public static void main(String[] args) {
        D d = Optional.ofNullable(new A()).map(A::getB)
                .map(b -> b.getC()).map(C::getD)
                .orElse(new D("from orElse"));
        System.out.println("d = " + d);
    }
}