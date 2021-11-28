package ru.urvanov.javaindynamics2022.autoboxing;

public class Autoboxing3 {
    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 20;

        System.out.println("x > y : " + (x > y)); // false
        System.out.println("x < y : " + (x < y)); // true

        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);
        // x1 и x2 ссылаются на разные экземпляры объектов
        System.out.println("x1 >= x2 : " + (x1 >= x2)); //true
        System.out.println("x1 <= x2 : " + (x1 <= x2)); //true
        System.out.println("x1 == x2 : " + (x1 == x2)); //false происходит
        // сравнение ссылок
        System.out.println("x1 != x2 : " + (x1 != x2)); // true происходит
        // сравнение ссылок


        Integer x3 = Integer.valueOf(10);
        Integer x4 = 10; // Здесь неявно вызывается Integer.valueOf
        // Теперь x3 и x4 указывают на один и тот же объект из-за кэширования.
        System.out.println("x3 == x4 : " + (x3 == x4)); // true из-за кэширования
        // см. метод Integer.valueOf
        System.out.println("x3 != x4 : " + (x3 != x4)); // false из-за кэширования
        // см. метод Integer.valueOf
    }
}
