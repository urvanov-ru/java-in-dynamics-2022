package ru.urvanov.javaindynamics2022.multithreading;

public class SleepExample {
    public static void main(String args[])
            throws InterruptedException {
        for (int n = 0; n < 10; n++) {
            // Ждём 2 секунды
            Thread.sleep(2_000);
            // Выводим значение счетчика цикла
            System.out.println(n);
        }
    }
}