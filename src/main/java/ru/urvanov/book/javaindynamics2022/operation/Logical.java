package ru.urvanov.book.javaindynamics2022.operation;

/**
 * Логические операции
 */
public class Logical {
    public static void main(String[] args) {
        boolean b1 = true && true; //true
        boolean b2 = true && false; //false
        boolean b3 = true || false; // true
        boolean b4 = false || false; //false

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


        class A {
            boolean method1() {
                System.out.println("method1");
                return true;
            }
        }
        A obj = new A();
        if (obj != null && obj.method1()) { // obj.method1() будет
                                            // вызывать только
                                            // если проверка
                                            //  obj!= null вернула true.
        }
    }
}
