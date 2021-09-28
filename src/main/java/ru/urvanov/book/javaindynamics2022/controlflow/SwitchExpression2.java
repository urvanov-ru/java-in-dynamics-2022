package ru.urvanov.book.javaindynamics2022.controlflow;

/**
 * Пример switch expressions, который возвращает значение.
 */
public class SwitchExpression2 {
    public static void main(String[] args) {
        int moneyType = 3;
        String moneyDescription = switch (moneyType) {
            case 1, 2:
                System.out.println("Some text");
                yield "Gold";
            case 3:
                yield "Aden";
            case 4, 5:
                yield "Dollar";
            default:
                yield "Septim";
        };
        System.out.println("moneyDescription = " + moneyDescription);
    }
}
