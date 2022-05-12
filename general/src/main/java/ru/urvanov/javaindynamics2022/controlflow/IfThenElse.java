package ru.urvanov.javaindynamics2022.controlflow;

/**
 * Примеры if-then-else
 */
public class IfThenElse {
    public static void main(String[] args) {
        boolean isCracked = true;

        // Согласно соглашению о кодировании так писать не принято, нужно использовать блоки даже для одной инструкции
        if (isCracked)
            System.out.println("Cracked");

        if (isCracked) {
            System.out.println("In block");
            System.out.println("Cracked");
        }

        // А вот так ОК
        if (isCracked) {
            System.out.println("Cracked");
        }

        if (isCracked) {
            System.out.println("Cracked");
        } else {
            System.out.println("not cracked");
        }

        // Согласно соглашению о кодировании так писать не принято, нужно использовать блоки даже для одной инструкции
        if (isCracked)
            System.out.println("Cracked");
        else
            System.out.println("not cracked");




        int x = 3;
        if (x < 0) {
            System.out.println("< 0");
        } else if (x == 3) {
            System.out.println(" == 3");
        } else if (x > 10) {
            System.out.println(" > 10");
        } else {
            System.out.println("else (x >= 0 and x <> 3 and x <= 10)");
        }



        // В if может быть любое выражение, возвращающее boolean. Даже присваивание, хотя так делать не рекомендуется
        // согласно соглашению о кодировании в Java.
        boolean b;
        if (b = x > 0) {
            // Теперь b присвоено true, как результат
            // x > 0
        } else {
            // А вот здесь b присвоено false.
        }
    }
}
