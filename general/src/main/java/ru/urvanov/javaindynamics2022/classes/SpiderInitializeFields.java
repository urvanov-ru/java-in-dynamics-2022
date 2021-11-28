package ru.urvanov.javaindynamics2022.classes;

public class SpiderInitializeFields {
    int x1;

    {
        x1 = 100;
    }

    int x2 = x1 + 1;

    SpiderInitializeFields() {
        x1 = 200;
    }

    int x3 = x1 + 2;

    {
        x1 = -100;
    }

    public static void main(String[] args) {
        SpiderInitializeFields s = new SpiderInitializeFields();
        System.out.println("x1=" + s.x1);
        System.out.println("x2=" + s.x2);
        System.out.println("x3=" + s.x3);
    }
}
