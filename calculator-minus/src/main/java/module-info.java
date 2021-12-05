module ru.urvanov.javaindynamics2022.calculator.minus {
    requires ru.urvanov.javaindynamics2022.calculator;
    provides ru.urvanov.javaindynamics2022.calculator.plugin.Operation
            with ru.urvanov.javaindynamics2022.calculator.minus.Minus;
}