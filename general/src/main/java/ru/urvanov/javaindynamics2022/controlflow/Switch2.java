package ru.urvanov.javaindynamics2022.controlflow;

public class Switch2 {

    public static void main(String[] args) {
        int mode = 1;

        switch (mode) {
            case -1:
                System.out.println("mode -1");
                break;
            case 0:
                System.out.println("mode 0");
            case 1:
            case 2:
                System.out.println("mode 0 or 1 or 2");
                break;
            case 3:
                System.out.println("mode 2");
                break;
            default:
                System.out.println("mode default");
                break;
        }
    }
}
