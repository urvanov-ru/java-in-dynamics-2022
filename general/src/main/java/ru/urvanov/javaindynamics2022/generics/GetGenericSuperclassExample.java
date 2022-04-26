package ru.urvanov.javaindynamics2022.generics;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GetGenericSuperclassExample {

    private class MySuperclass<T> {
        public void method1(T arg0) {
            System.out.println(arg0);
        }
    }

    private class MyClass extends MySuperclass<String> {

    }

    public static void main(String[] args) {
        Type t = MyClass.class.getGenericSuperclass();
        ParameterizedType p = (ParameterizedType) t;
        Type[] a = p.getActualTypeArguments();
        for (Type type : a) {
            System.out.println("аргумент типа = " + type);
        }
    }
}
