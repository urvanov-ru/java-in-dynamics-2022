package ru.urvanov.javaindynamics2022.inheritance;

interface EuropeFolklore {
    void doIt();
}

class Dragon {
    public void doIt() {
        System.out.println("doIt");
    }
}

public class EuropeanDragon extends Dragon implements EuropeFolklore{
    // Метод doIt из интерфейса EuropeFolklore
    // уже переопределён методом из класса Dragon
    public static void main(String[] args) {
        EuropeanDragon europeanDragon = new EuropeanDragon();
        europeanDragon.doIt();
    }
}
