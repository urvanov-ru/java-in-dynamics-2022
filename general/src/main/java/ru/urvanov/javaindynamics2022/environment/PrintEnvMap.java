package ru.urvanov.javaindynamics2022.environment;

import java.util.Map;

public class PrintEnvMap {
    public static void main (String[] args) {
        Map<String, String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name + "="  + env.get(name));
        }
    }
}