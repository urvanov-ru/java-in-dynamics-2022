package ru.urvanov.javaindynamics2022.nestedclass;

import static ru.urvanov.javaindynamics2022.nestedclass.OuterForImportStaticNested.X1;
import static ru.urvanov.javaindynamics2022.nestedclass.OuterForImportStaticNested.NestedClass;

class ImportStaticNested {
    public static void main(String[] args) {
        System.out.println("X1=" + X1);
        NestedClass obj1 = new NestedClass();
    }
}