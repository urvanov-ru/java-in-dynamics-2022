package ru.urvanov.javaindynamics2022.classes;

class Orc {
    double health = 100.0;

    public void someMethod1() {
        double health = 200.0;
        System.out.println(health); // 200.0
        System.out.println(this.health); // 100.0
    }

    public void setHealth(double health) {
        // присваиваем свойству класса
        // переданное значение
        this.health = health;
    }

    public static void main(String[] args) {
        Orc orc = new Orc();
        orc.setHealth(999.9);
        orc.someMethod1();;
    }
}