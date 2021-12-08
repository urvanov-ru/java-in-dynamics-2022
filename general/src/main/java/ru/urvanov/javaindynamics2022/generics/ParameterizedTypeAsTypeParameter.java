package ru.urvanov.javaindynamics2022.generics;

// Пример использования параметризованного типа как параметр типа
public class ParameterizedTypeAsTypeParameter {
    public static void main(String[] args) {
        PairLair<Goblin, Lair<Genie>> hierarchicalLair = new PairLair<>();
    }
}
