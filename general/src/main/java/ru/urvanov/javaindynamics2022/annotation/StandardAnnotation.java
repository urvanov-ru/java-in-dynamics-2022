package ru.urvanov.javaindynamics2022.annotation;

public class StandardAnnotation extends ParentStandardAnnotation{

    @Override
    public void someMethod1() {
        // ...
    }

    @SuppressWarnings(value = "unchecked")
    public void method1() {
    }

    @SuppressWarnings("unchecked")
    void myMethod() {

    }
}
