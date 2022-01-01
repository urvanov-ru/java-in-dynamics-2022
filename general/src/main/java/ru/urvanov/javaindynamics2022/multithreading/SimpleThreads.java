package ru.urvanov.javaindynamics2022.multithreading;

public class SimpleThreads {

    // Выводим сообщение
    // с именем текущего потока в начале.
    static void threadMessage(String message) {
        String threadName =
                Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                threadName,
                message);
    }

    private static class MessageLoop
            implements Runnable {
        public void run() {
            String importantInfo[] = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };
            try {
                for (int i = 0;
                     i < importantInfo.length;
                     i++) {
                    // Ждём 4 секунды
                    Thread.sleep(4000);
                    // Пишем сообщение
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }

    public static void main(String args[])
            throws InterruptedException {

        // Задержка в миллисекундах
        // перед тем как мы прерываем MessageLoop
        // (по умолчанию один час).
        long patience = 1000 * 60 * 60;

        // Если есть аргумент командной строки,
        // то он указывает ожидание в секундах.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        // ждём пока MessageLoop
        // существует
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Ждём максимум 1 секунду
            // завершения потока MessageLoop
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience)
                    && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                // Должно быть недолго теперь.
                // -- Ждём до конца
                t.join();
            }
        }
        threadMessage("Finally!");
    }
}