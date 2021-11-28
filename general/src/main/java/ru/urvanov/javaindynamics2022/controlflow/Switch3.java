package ru.urvanov.javaindynamics2022.controlflow;

public class Switch3 {
    public static void main(String[] args) {
        int mode = 1;

        switch (mode) {
            case 0:
                System.out.println("mode 0");
                break;
            default:
                System.out.println("mode default");
                break;
            case 1:
                System.out.println("mode 1");
                break;
            case 2:
                System.out.println("mode 2");
                break;
        }

    }
}
