package ru.urvanov.javaindynamics2022.string;

// Пример использования класса StringBuilder
public class StringBuilderExample {
    public static void main(String[] args) {
        String andStr = " and Petya";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vasya");
        stringBuilder.append(andStr);
        stringBuilder.append(" go to school.");
        System.out.println(stringBuilder);
    }
}
