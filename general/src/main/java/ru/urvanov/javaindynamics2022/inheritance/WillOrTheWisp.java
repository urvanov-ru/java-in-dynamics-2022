package ru.urvanov.javaindynamics2022.inheritance;

// Класс реализует метод Cloneable
// В противном случае метод clone()
// будет генерировать
// исключение CloneNotSupportedException.
public class WillOrTheWisp implements Cloneable {

    private int x;
    private double y;

    // Переопределяем метод clone()
    // с protected на public.
    // И возвращаемый методом тип делаем более специфичным
    public WillOrTheWisp clone()
            throws CloneNotSupportedException {
        // Мы должны вызвать метод базового класса,
        // чтобы гарантировать, что возвращаемое значение
        // будет именно того типа, у экземпляра которого
        // вызван метод clone().
        WillOrTheWisp result = (WillOrTheWisp) super.clone();

        // Метод clone() в классе Object
        // копирует только значения полей.
        // Если у нас есть ссылочные типы,
        // то мы должны создать копии для
        // них самостоятельно
        // ...


        return result;
    }

    public static void main(String[] args)
            throws CloneNotSupportedException {
        WillOrTheWisp willOrTheWisp = new WillOrTheWisp();
        willOrTheWisp.x = 100;
        willOrTheWisp.y = 140.33;
        WillOrTheWisp clonedObject = willOrTheWisp.clone();
        System.out.println("x = " + clonedObject.x);
        System.out.println("y = " + clonedObject.y);
    }
}