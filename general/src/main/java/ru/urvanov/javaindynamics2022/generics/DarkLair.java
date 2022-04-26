package ru.urvanov.javaindynamics2022.generics;

public class DarkLair<T> {

    // Житель
    T inhabitant;

    public void setInhabitant(T inhabitant) {
        System.out.println("DarkLair.setInhabitant");
        this.inhabitant = inhabitant;
    }

    public T getInhabitant() {
        return this.inhabitant;
    }

}

class MonsterDarkLair extends DarkLair<Monster> {
    public void setInhabitant(Monster inhabitant) {
        System.out.println("MonsterDarkLair.setInhabitant");
        super.setInhabitant(inhabitant);
    }

    public static void main(String[] args) {
        MonsterDarkLair mdl = new MonsterDarkLair();
        DarkLair dl = mdl; // сырой тип - компилятор генерирует
                           // предупреждение unchecked warning

        // Исключение ClassCastException
        dl.setInhabitant(new Chimera("Greenus Maximus"));
    }
}
