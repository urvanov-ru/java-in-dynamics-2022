package ru.urvanov.javaindynamics2022.number;

public class Numbers {
    public static void main(String[] args) {
        Integer i1 = 3334; // Упаковка int в объект Integer
        int i2 = i1;  // Распаковка Integer в примитивный тип int

        System.out.println("Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE=" + Integer.MAX_VALUE);
    }
}
