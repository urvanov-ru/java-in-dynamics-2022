package ru.urvanov.javaindynamics2022.calculator.sum;

import ru.urvanov.javaindynamics2022.calculator.plugin.Operation;

public class Sum implements Operation {
    @Override
    public double calculate(double x, double y) {
        return x + y;
    }
}
