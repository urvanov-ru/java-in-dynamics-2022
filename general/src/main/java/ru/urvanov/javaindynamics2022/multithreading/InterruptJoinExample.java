package ru.urvanov.javaindynamics2022.multithreading;

public class InterruptJoinExample {

    // Выводим сообщение
    // с именем текущего потока в начале.
    static void writeMessage(String message) {
        String threadName =
                Thread.currentThread().getName();
        System.out.format("[%s]: %s%n",
                threadName,
                message);
    }

    private static class Counter
            implements Runnable {
        public void run() {
            try {
                for (int n = 0; n < 5; n++) {
                    // Ждём 2 секунды
                    Thread.sleep(50_000);
                    // Выводим значение счетчика цикла
                    System.out.println(n);
                }
            } catch (InterruptedException interruptedException) {
                writeMessage("Thread interrupted");
            }
        }
    }

    public static void main(String args[])
            throws InterruptedException {

        writeMessage("Starting Counter");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new Counter());
        t.start();

        writeMessage("Waiting for Counter to finish");
        // ждём пока MessageLoop
        // существует
        while (t.isAlive()) {
            writeMessage("calling join...");
            // Ждём максимум 1 секунду
            // завершения потока MessageLoop
            t.join(1_000);

            // максимально ждём одну минуту
            // Если поток не успел, то посылаем ему сигнал
            // прерывания
            if (((System.currentTimeMillis() - startTime) > 60000)
                    && t.isAlive()) {
                writeMessage("Interrupting...");
                t.interrupt();
                // Должно быть недолго теперь.
                // -- Ждём до конца
                t.join();
            }
        }
        writeMessage("DONE");
    }
}