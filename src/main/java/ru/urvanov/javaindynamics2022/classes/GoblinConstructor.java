package ru.urvanov.javaindynamics2022.classes;

public class GoblinConstructor {
    private int money;
    double health;
    protected int diamonds = 10;
    public String name;

    // Конструктор без параметров.
    public GoblinConstructor() {
    }

    // Конструктор с двумя параметрами
    public GoblinConstructor(int initialMoney, double initialHealth) {
        money = initialMoney;
        health = initialHealth;
    }

    // Конструктор с одним параметром.
    public GoblinConstructor(String goblinName) {
        name = goblinName;
    }


    // Приватный конструктор. Его можно будет вызвать
    // только внутри этого метода.
    private GoblinConstructor(int initialDiamonds) {
        diamonds = initialDiamonds;
    }

    //... ещё конструкторы и методы

    public GoblinConstructor someMethod1(String str) {
        return this;
    };

    public GoblinConstructor someMethod2() {
        return this;
    };

    public static void main(String[] args) {
        String myParam1 = "myValue1";
        String myParam2 = "myValue2";

        GoblinConstructor goblin0 = new GoblinConstructor();
        GoblinConstructor goblin1 = new GoblinConstructor("Vasya");
        GoblinConstructor goblin2 = new GoblinConstructor(3, 45.0);

        new GoblinConstructor(myParam1).someMethod1(myParam2);
        new GoblinConstructor(myParam1).someMethod1(myParam2).someMethod2(); //... и т. д.
    }
}
