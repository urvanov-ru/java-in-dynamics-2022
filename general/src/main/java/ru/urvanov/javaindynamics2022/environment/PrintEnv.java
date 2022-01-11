package ru.urvanov.javaindynamics2022.environment;

public class PrintEnv {
    public static void main (String[] args) {
        for (String env: args) {
            String value = System.getenv(env);
            if (value != null) {
                System.out.println(env + "=" + value);
            } else {
                System.out.println(env + " is empty");
            }
        }
    }
}
