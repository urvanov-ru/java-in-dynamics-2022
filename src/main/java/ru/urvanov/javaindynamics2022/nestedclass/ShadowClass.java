package ru.urvanov.javaindynamics2022.nestedclass;

class ShadowClass {
    int x = -1;

    class FirstInnerClass {
        int x = 1;

        class SecondInnerClass {
            int x = 2;

            void method1(int x) {
                // Параметр метода method1
                System.out.println("x=" + x);

                // Член класса SecondInnerClass
                System.out.println("this.x=" + this.x);

                // Член класса FirstInnerClass
                System.out.println("FirstInnerClass.this.x=" + FirstInnerClass.this.x);

                // Член класса ShadowClass
                System.out.println("ShadowClass.this.x=" + ShadowClass.this.x);
            }
        }
    }

    public static void main(String[] args) {
        ShadowClass sc = new ShadowClass();
        ShadowClass.FirstInnerClass fic = sc.new FirstInnerClass();
        ShadowClass.FirstInnerClass.SecondInnerClass sic = fic.new SecondInnerClass();
        sic.method1(3);
    }
}
