package ru.urvanov.javaindynamics2022.nestedclass;

class LambdaScopeTest {
    int x = 23;

    interface A {
        void method2(int y);
    };

    class InnerClass {
        int x = 10;

        public void method1(int x) {

            A a = z -> {
                System.out.println("z=" + z);

                // можем обратиться к параметру method1,
                // так как он final по действию,
                // то есть его значение не меняется.
                System.out.println("x=" + x);

                System.out.println("this.x=" + this.x);
                System.out.println("LambdaScopeTest.this.x="
                        + LambdaScopeTest.this.x);
            };

            a.method2(x);
        }
    }

    public static void main(String[] args) {
        LambdaScopeTest lsc = new LambdaScopeTest();
        LambdaScopeTest.InnerClass ic = lsc.new InnerClass();
        ic.method1(44);
    }
}
