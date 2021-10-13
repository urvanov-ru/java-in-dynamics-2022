package ru.urvanov.javaindynamics2022.nestedclass;

import static ru.urvanov.javaindynamics2022.nestedclass.OuterForImport.X1;
import static ru.urvanov.javaindynamics2022.nestedclass.OuterForImport.NestedClass;

class ImportNested {
    public static void main(String[] args) {
        System.out.println("X1=" + X1);
        NestedClass obj1 = new NestedClass();
    }
}