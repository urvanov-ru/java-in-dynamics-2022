package ru.urvanov.javaindynamics2022.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Выведение типов и создание экземпляра обобщённого класса
public class DiamondOperator {
    public static void main(String[] args) {
        // Обычный способ
        Map<String, List<String>> myMap1 = new HashMap<String, List<String>>();

        // diamond operator
        Map<String, List<String>> myMap2 = new HashMap<>();

        // Не совсем хороший способ, использование сырого типа
        Map<String, List<String>> myMap3 = new HashMap(); // unchecked
                                   // conversion warning
    }
}
