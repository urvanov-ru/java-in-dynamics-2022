package ru.urvanov.javaindynamics2022.multithreading;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkAbs extends RecursiveAction {
    private int[] source;
    private int[] destination;
    private int start;
    private int length;

    public ForkAbs(
            int[] source,
            int start,
            int length,
            int[] destination) {
        this.source = source;
        this.start = start;
        this.length = length;
        this.destination = destination;
    }

    private void computeDirectly() {
        // Это только пример. В реальности здесь
        // могут быть довольно сложные вычисления.
        for (int n = start; n < start + length; n++) {
            destination[n] = Math.abs(source[n]);
        }
    }


    private static int threshold = 10;

    @Override
    protected void compute() {
        if (length < threshold) {
            computeDirectly();
            return;
        }

        int split = length / 2;
        invokeAll(new ForkAbs(source, start, split, destination),
                new ForkAbs(
                        source,
                        start + split,
                        length - split,
                        destination));
    }

    public static void main(String[] args) {
        int[] source = new int[100];
        int[] destination = new int[source.length];
        Random random = new Random();
        System.out.println("source = ");
        for (int n = 0; n < source.length; n ++) {
            source[n] = random.nextInt();
            System.out.print(source[n]);
            System.out.print(" ");
        }
        System.out.println();

        ForkAbs forkAbs = new ForkAbs(source, 0, source.length, destination);

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(forkAbs);

        System.out.println("destination = ");
        for (int n = 0; n < destination.length; n ++) {
            System.out.print(destination[n]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
