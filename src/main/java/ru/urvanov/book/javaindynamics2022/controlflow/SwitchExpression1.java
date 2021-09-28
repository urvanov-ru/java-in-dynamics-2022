package ru.urvanov.book.javaindynamics2022.controlflow;

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

        // Идентичный ему switch expression:
        switch (moneyType) {
            case 1, 2 -> moneyDescription = "Gold";
            case 3 -> moneyDescription = "Aden";
            case 4, 5 -> moneyDescription = "Dollar";
            default -> moneyDescription = "Septim";
        };
        System.out.println("moneyDescription = " + moneyDescription);
    }
}
