package ru.urvanov.javaindynamics2022.generics;

public class IntegerNode extends Node<Integer> {
    public IntegerNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
