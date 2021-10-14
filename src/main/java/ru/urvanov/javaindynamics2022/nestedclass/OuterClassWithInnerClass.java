package ru.urvanov.javaindynamics2022.nestedclass;

// Класс с внутренним классом
class OuterClassWithInnerClass {


    private int x1;

    private void method1() {}

    private static void method2() {}

    // Внутренний класс
    class InnerClass {

        // Внутренние классы имеют доступ
        // ко всем членам внешнего класса
        // независимо от модификатора доступа.
        int y1 = x1;

        {
            method1();
            method2();
        }
        // ... и т. д.


        // Можно объявлять константы
        public static final int MY_CONSTANT = 34;

        // Никаких других статических членов объявлять
        // во внутренних классах нельзя!
        // Будет ошибка компиляции.

        // НЕЛЬЗЯ!
        //static {
        //
        //}
        //

        // НЕЛЬЗЯ
        //static void method1() {};
    }
}