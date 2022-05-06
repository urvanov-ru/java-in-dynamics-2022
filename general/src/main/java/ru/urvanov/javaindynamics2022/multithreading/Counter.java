package ru.urvanov.javaindynamics2022.multithreading;

// Пример вмешательства в поток (thread interference)
class Counter {
    private int value = 0;

    public void increment() {
        for (int n = 0; n < 100_000; n++) {
            value++;
        }
    }

    public void decrement() {
        for (int n = 0; n < 100_000; n++) {
            value--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread threadIncrement = new Thread(counter::increment);
        Thread threadDecrement = new Thread(counter::decrement);
        threadIncrement.start();
        threadDecrement.start();
        threadIncrement.join();
        threadDecrement.join();
        // Каждый раз будем получать разный результат
        // из-за того что потоки несинхронизированы.
        // Это последствия thread interference.
        System.out.println(counter.getValue());
    }

    private int getValue() {
        return value;
    }

}