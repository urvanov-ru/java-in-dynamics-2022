package ru.urvanov.javaindynamics2022.multithreading;

public class ThreadChild extends Thread {

    public void run() {
        System.out.println("Текст из другого потока");
    }

    public static void main(String args[]) {
        (new ThreadChild()).start();
    }

}