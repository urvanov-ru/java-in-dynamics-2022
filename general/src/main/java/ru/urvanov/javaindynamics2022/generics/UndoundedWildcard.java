package ru.urvanov.javaindynamics2022.generics;

import java.util.Arrays;
import java.util.List;

// Примеры неограниченных подстановочных символов
public class UndoundedWildcard {

    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
    }

}
