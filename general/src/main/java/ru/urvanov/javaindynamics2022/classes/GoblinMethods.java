package ru.urvanov.javaindynamics2022.classes;

/**
 * Пример метода
 */
public class GoblinMethods {
    private int hitPoints;
    public int fire(boolean withAim, double windDirection,
                    double windPower) {
        // ... инструкции...
        return hitPoints;
    }

    public int returnSix() {
        return 6;
    }

    public double sum(double x1, double x2) {
        return x1 + x2;
    }

    public void myVoidMethod1() {
        // ...
        if (hitPoints > 3) {
            return;
        }
        //...
    }




    // Примеры перегрузки методов

    public void hit(Axe axe) {
        // ... operators
    }

    public void hit(Flail flail) {
        // ... operators
    }

    public void hit(Scimitar scimitar) {
        // ... operators
    }

    public void hit(Torch torch) {
        // ... operators
    }

    public void hit(Sword sword) {
        // ... operators
    }

    public void hit(Sword sword, int comboCount) {
        // ... operators
    }


    public static void main(String[] args) {
        GoblinMethods goblin = new GoblinMethods();
        Scimitar scimitar = new Scimitar();
        goblin.hit(scimitar); // будет вызван public void hit(Scimitar scimitar)

        Sword sword = new Sword();
        goblin.hit(sword); // будет вызван public void hit(Sword sword)
    }
}
