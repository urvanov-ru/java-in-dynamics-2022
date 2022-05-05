package ru.urvanov.javaindynamics2022.multithreading;

public class RunnableImpl implements Runnable {

    public void run() {
        System.out.println("Текст из другого потока");
    }

    public static void main(String args[]) {
        (new Thread(new RunnableImpl())).start();
    }

}