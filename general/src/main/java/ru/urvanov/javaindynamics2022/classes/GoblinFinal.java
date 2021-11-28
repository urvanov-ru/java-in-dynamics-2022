package ru.urvanov.javaindynamics2022.classes;

class GoblinFinal {
    final String name;

    public GoblinFinal (String name) {
        this.name = name; // Инициализируем переменную final.
    }

    public void someMethod1(final String secondName) {
        final String thirdName = "Third";

        // Переменные с final менять после инициализации нельзя!
        // this.name = secondName; //Нельзя! Ошибка компиляции.
        // secondName = "3"; // Нельзя! Ошибка компиляции.
        // thirdName = "4"; // Нельзя! Ошибка компиляции.
    }


    // Этот метод нельзя переопределять в потомках.
    public final void myFinalMethod1() {
    }

    // Этот метод нельзя скрывать в потомках.
    public static final void myFinalMethod2() {
    }


    // Пример объявления константы
    static final double PI = 3.141592653589793;
}