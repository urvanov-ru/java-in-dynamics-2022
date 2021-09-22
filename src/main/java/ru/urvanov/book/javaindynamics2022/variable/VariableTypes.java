package ru.urvanov.book.javaindynamics2022.variable;

public class VariableTypes {

    // переменные класса ( статические свойства / поля )
    static int variableTypesCounter;
    static String globalName;

    // Переменные экземпляров ( не статические свойства /  поля )
    // Объявлены без ключевого поля static
    // их значения различны для каждого из экземпляров
    private double health;
    private String instanceName;

    // args -  это параметры
    public static void main(String[] args) {

        // Объявление локальных переменных.
        // Доступны только внутри метода
        float value1;
        String str1;
        double sum;
    }
}
