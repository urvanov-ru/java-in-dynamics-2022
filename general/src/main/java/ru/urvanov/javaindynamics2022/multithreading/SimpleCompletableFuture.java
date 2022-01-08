package ru.urvanov.javaindynamics2022.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class SimpleCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture
                .supplyAsync(() -> "Test1");
        CompletableFuture<String> future2 = CompletableFuture
                .supplyAsync(() -> "Test2", Executors.newCachedThreadPool());
        System.out.println(future1.get());
        System.out.println(future2.get());

        CompletableFuture<Void> future3 = CompletableFuture.runAsync(
                () -> System.out.println("Test3"));
        CompletableFuture<Void> future4 = CompletableFuture.runAsync(
                () -> System.out.println("Test4"),
                Executors.newCachedThreadPool());
        future3.join();
        future4.join();



        // thenAccept
        CompletableFuture<String> completableFutureThenAccept
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<Void> futureThenAccept = completableFutureThenAccept
                .thenAccept(s -> System.out.println("Computation returned: " + s));

        futureThenAccept.get();


        // thenRun
        CompletableFuture<String> completableFutureThenRun
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<Void> futureThenRun = completableFutureThenRun
                .thenRun(() -> System.out.println("Computation finished."));

        futureThenRun.get();


        // thenApply
        CompletableFuture<Integer> futureThenApply
                = CompletableFuture.supplyAsync(() -> 2);

        futureThenApply.thenApply(result -> result + 3);

        futureThenApply.thenApply(result -> result -1);

        Integer futureThenApplyResult = futureThenApply.get();
        System.out.println(futureThenApplyResult);



        // allOf
        List<CompletableFuture<Void>> allOf = new ArrayList<>();
        allOf.add(CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("allOfTaskOne");
        }));
        allOf.add(CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("allOfTaskTwo");
        }));
        CompletableFuture.allOf(allOf.toArray(new CompletableFuture[allOf.size()])).join();

        // anyOf
        List<CompletableFuture<Void>> anyOf = new ArrayList<>();
        anyOf.add(CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("anyOfTaskOne");
        }));
        anyOf.add(CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("anyOfTaskTwo");
        }));
        CompletableFuture.allOf(anyOf.toArray(new CompletableFuture[anyOf.size()])).join();
    }
}