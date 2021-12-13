package ru.urvanov.javaindynamics2022.generics;

public class IntegerNode extends Node<Integer> {
    public IntegerNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }

    public static void main(String[] args) {
        IntegerNode mn = new IntegerNode(5);
        Node n = mn;            // Сырой тип - компилятор генерирует
        // предупреждение unchecked warning
        n.setData("Hello");
        Integer x = mn.data;    // Исключение ClassCastException.
    }
}
