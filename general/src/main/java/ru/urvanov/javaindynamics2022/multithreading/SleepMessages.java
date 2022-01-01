package ru.urvanov.javaindynamics2022.multithreading;

public class SleepMessages {
    public static void main(String args[])
            throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            // Ждём 4 секунды
            Thread.sleep(4000);
            // Выводим сообщение
            System.out.println(importantInfo[i]);
        }
    }
}