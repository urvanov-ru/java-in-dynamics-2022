package ru.urvanov.javaindynamics2022.nestedclass;

// Пример класса с локальным классом
class OuterClassWithLocalClass {
    class Cyclic {}

    private int someField1;

    void foo1() {
        // Нельзя. Циклическое наследование.
        // Область видимости Cyclic для локального класса
        // включает само объявление класса.
        // class Cyclic extends Cyclic {}

        // Нельзя. Здесь ещё LocalClass не объявлено.
        // LocalClass lc = new LocalClass();

        final int x1 = 100;
        int x2 = 200;
        int x3 = 300;

        // А вот так можно. LocalClass будет локальным классом,
        // доступным внутри метода, в котором объявлен
        class LocalClass {
            private void method1() {
                // Переменная x1  final.
                // Можно обращаться из локального класса
                System.out.println(x1);

                // Переменная x2 не меняется фактически, хотя и
                // не объявлена как final. Можно обращаться.
                System.out.println(x2);

                //System.out.println(x3); НЕЛЬЗЯ!.

                // Внутренние классы имеют доступ ко всем членам
                // своего внешнего класса.
                System.out.println(someField1++);
            }
        }

        // Ещё один локальный класс
        class LocalClassB {
            void method2(LocalClass lc) {
                lc.method1(); // Можно. Так как они внутренние классы
                // одного и того же внешнего класса
            }
        }
        x3++;
        LocalClass lc = new LocalClass();
        lc.method1();
    }

    public static void main(String[] args) {
        OuterClassWithLocalClass oc = new OuterClassWithLocalClass();
        oc.foo1();
    }
}