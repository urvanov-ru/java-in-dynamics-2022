package ru.urvanov.javaindynamics2022.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class SimpleCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(
                () -> "Test1");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(
                () -> "Test2", Executors.newCachedThreadPool());
        System.out.println(future1.get());
        System.out.println(future2.get());

        CompletableFuture<Void> future3 = CompletableFuture.runAsync(
                () -> System.out.println("Test3"));
        CompletableFuture<Void> future4 = CompletableFuture.runAsync(
                () -> System.out.println("Test4"),
                Executors.newCachedThreadPool());
    }
}