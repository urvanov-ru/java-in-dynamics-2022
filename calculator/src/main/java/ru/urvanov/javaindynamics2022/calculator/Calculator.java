package ru.urvanov.javaindynamics2022.calculator;

import ru.urvanov.javaindynamics2022.calculator.plugin.Operation;

import java.util.ServiceLoader;
import java.util.stream.StreamSupport;

public class Calculator {
    public static void main(String[] args) {
        double x = 100.1;
        double y = 23.73;
        ServiceLoader<Operation> sl
                = ServiceLoader.load(Operation.class);
        sl.forEach(op -> {
            System.out.println(
                    "Operation: " + op.getClass().getName()
                    + ". Operands: " + x + ", " + y
                    + ". Result = " + op.calculate(x, y));
        });
    }
}
