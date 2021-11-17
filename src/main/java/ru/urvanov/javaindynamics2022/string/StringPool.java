package ru.urvanov.javaindynamics2022.string;

// Пример работы пула строк
public class StringPool {
    public static void main(String[] args) {
        String vasya = "Vasya", ya = "ya";
        System.out.println(vasya == "Vasya"); // 1    true
        System.out.println(vasya == ("Vas" + ya)); // 2   false
        System.out.println(vasya == ("Vas" + "ya")); // 3   true
        System.out.println(vasya == ("Vas" + ya).intern()); // 4    true
    }
}
