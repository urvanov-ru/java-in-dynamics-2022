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
                    Thread.sleep(2_000);
                    // Выводим значение счетчика цикла
                    writeMessage("counter " + n);
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
            // завершения потока Counter
            t.join(1_000);

            // максимально 10 секунд
            // Если поток не успел, то посылаем ему сигнал
            // прерывания
            if (((System.currentTimeMillis() - startTime) > 10000)
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