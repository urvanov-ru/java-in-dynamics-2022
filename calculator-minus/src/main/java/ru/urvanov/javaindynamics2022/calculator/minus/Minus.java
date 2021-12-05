package ru.urvanov.javaindynamics2022.calculator.minus;

import ru.urvanov.javaindynamics2022.calculator.plugin.Operation;

public class Minus implements Operation {
    @Override
    public double calculate(double x, double y) {
        return x - y;
    }
}
