package ru.urvanov.javaindynamics2022.optional;

import java.util.Optional;

class Satyr {
    public void myMethod() {

    }

    public Integer getSomeValue() {
        return 2;
    }

    public static Integer testMethod(Satyr myClass) {
        if (myClass != null) {
            myClass.myMethod();
            return myClass.getSomeValue();
        }
        return null;
    }

    public static void main(String[] args) {
        Satyr myClass = new Satyr();

        Integer result1 = testMethod(myClass);

        int result2 = testMethodWithOptional(Optional.ofNullable(myClass));
    }

    public static Integer testMethodWithOptional(Optional<Satyr> myClass) {
        myClass.ifPresent(Satyr::myMethod);
        return myClass.map(Satyr::getSomeValue).orElse(null);
    }

}