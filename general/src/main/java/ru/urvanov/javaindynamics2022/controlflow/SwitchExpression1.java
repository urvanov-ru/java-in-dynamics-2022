package ru.urvanov.javaindynamics2022.controlflow;

/**
 * Пример switch expression, которые появились в Java 14
 */
public class SwitchExpression1 {
    public static void main(String[] args) {
        int moneyType = 3;
        String moneyDescription;

        // исходный switch:
        switch (moneyType) {
            case 1:
            case 2:
                moneyDescription = "Gold";
                break;
            case 3:
                moneyDescription = "Aden";
                break;
            case 4:
            case 5:
                moneyDescription = "Dollar";
                break;
            default:
                moneyDescription = "Septim";
        }
        System.out.println("moneyDescription = " + moneyDescription);

        // Идентичное ему switch expression:
        switch (moneyType) {
            case 1, 2 -> moneyDescription = "Gold";
            case 3 -> moneyDescription = "Aden";
            case 4, 5 -> moneyDescription = "Dollar";
            default -> moneyDescription = "Septim";
        };
        System.out.println("moneyDescription = " + moneyDescription);
    }
}
