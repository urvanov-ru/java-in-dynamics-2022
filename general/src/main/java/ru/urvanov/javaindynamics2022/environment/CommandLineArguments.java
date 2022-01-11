package ru.urvanov.javaindynamics2022.environment;

public class CommandLineArguments {
    public static void main (String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}
