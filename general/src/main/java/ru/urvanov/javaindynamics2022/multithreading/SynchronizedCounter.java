package ru.urvanov.javaindynamics2022.multithreading;

public class SynchronizedCounter {
    private int value = 0;

    public void increment100000() {
        for (int n = 0; n < 100_000; n++) {
            increment();
        }
    }

    private synchronized void increment() {
        value++;
    }

    public void decrement100000() {
        for (int n = 0; n < 100_000; n++) {
            decrement();
        }
    }

    private synchronized void decrement() {
        value--;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedCounter counter = new SynchronizedCounter();
        Thread threadIncrement = new Thread(counter::increment100000);
        Thread threadDecrement = new Thread(counter::decrement100000);
        threadIncrement.start();
        threadDecrement.start();
        threadIncrement.join();
        threadDecrement.join();
        // Результат будет 0, так как методы
        // increment и decrement синхронизированы.
        System.out.println(counter.getValue());
    }

    private int getValue() {
        return value;
    }
}
