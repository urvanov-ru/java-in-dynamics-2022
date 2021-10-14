package ru.urvanov.javaindynamics2022.nestedclass;

// Пример класса с анонимным классом
class OuterClassWithAnonymousClass {

    interface MyInterface {
        void someMethod1();
    }

    public static void main(String[] args) {

        final int x1 = 100;
        int x2 = 200;
        int x3 = 300;

        // Объявляем новый класс, который реализует
        // интерфейс MyInterface, и не имеет
        // своего имени.
        // Присваиваем переменной obj1 экземпляр этого класса
        MyInterface obj1 = new MyInterface() {
            private int x1;
            // ... ещё поля.


            public void someMethod1() {
                // ... выполение действий.
                // x1 доступна, так как она объявлена как final
                System.out.println(x1);
                // x2 не объявлена как final, но она никогда
                // не меняет своего значения
                System.out.println(x2);
                // System.out.println(x3); НЕЛЬЗЯ, так как x3 меняет значение
            }

            //... ещё методы.
        };
        obj1.someMethod1();

        x3++; // x3 НЕ final
    }
}