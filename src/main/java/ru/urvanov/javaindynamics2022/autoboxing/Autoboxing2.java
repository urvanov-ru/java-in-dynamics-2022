package ru.urvanov.javaindynamics2022.autoboxing;

class Autoboxing2 {

    public static void method1(int x) {
    }


    public static void main(String[] args) {
        Integer i1 = 100;

        method1(i1); // распаковка

        Double d1 = 2.3;
        Double d2 = 3.3;
        double d3 = i1 + d1 + d2; // распаковка

        System.out.println(d3);
    }
}