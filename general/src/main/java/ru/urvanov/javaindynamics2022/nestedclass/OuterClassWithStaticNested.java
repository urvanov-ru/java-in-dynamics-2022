package ru.urvanov.javaindynamics2022.nestedclass;

class OuterClassWithStaticNested {
    private static int a1;
    protected static int a2;
    static int a3;
    public static int a4;

    private int x1;
    protected int x2;
    int x3;
    public int x4;

    private static void privateStaticOuterMethod1() {}

    static void packagePrivateStaticOuterMethod1() {}

    protected static void protectedStaticOuterMethod1() {}

    public static void publicStaticOuterMethod1() {}

    private void privateInstanceOuterMethod1() {}

    void packagePrivateInstanceOuterMethod1() {}

    protected void protectedInstanceOuterMethod1() {}

    public void publicInstanceOuterMethod1() {}

    static class StaticNestedClass {
        public void method1() {
            // можно обращаться к приватным статическим членам.
            int y1 = a1;
            int y2 = a2;
            int y3 = a3;
            int y4 = a4;


            privateStaticOuterMethod1();
            packagePrivateStaticOuterMethod1();
            protectedStaticOuterMethod1();
            publicStaticOuterMethod1();

            //int x4 = x2;  НЕЛЬЗЯ! Только через ссылку на объект
        }

        public void method2(OuterClassWithStaticNested oc) {
            // К членам экземпляров только через ссылку.
            int z1 = oc.x1;
            int z2 = oc.x2;
            int z3 = oc.x3;
            int z4 = oc.x4;

            oc.privateInstanceOuterMethod1();
            oc.packagePrivateInstanceOuterMethod1();
            oc.protectedInstanceOuterMethod1();
            oc.publicInstanceOuterMethod1();
        }
    }

    public static void main(String[] args) {
        OuterClassWithStaticNested.StaticNestedClass obj1
                = new OuterClassWithStaticNested.StaticNestedClass();
        obj1.method1();
    }
}