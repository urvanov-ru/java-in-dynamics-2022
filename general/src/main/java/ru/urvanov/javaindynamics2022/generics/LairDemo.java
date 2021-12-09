package ru.urvanov.javaindynamics2022.generics;

class Chimera {

    private String name;

    public Chimera(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}


class LairDemo {

    public static <U> void addLair(U u,
                                   java.util.List<Lair<U>> lairs) {
        Lair<U> lair = new Lair<>();
        lair.setInhabitant(u);
        lairs.add(lair);
    }

    public static <U> void outputLairs(java.util.List<Lair<U>> lairs) {
        int counter = 0;
        for (Lair<U> lair : lairs) {
            U lairInhabitant = lair.getInhabitant();
            System.out.println("Lair #" + counter + " contains ["
                    + lairInhabitant.toString() + "]" );
            counter++;
        }
    }

    public static void main(String[] args) {
        java.util.ArrayList<Lair<Chimera>> listOfChimerasLairs
                = new java.util.ArrayList<>();
        LairDemo.<Chimera>addLair(new Chimera("Michael"), listOfChimerasLairs);
        LairDemo.addLair(new Chimera("Rafael"), listOfChimerasLairs);
        LairDemo.addLair(new Chimera("Pushkin"), listOfChimerasLairs);
        LairDemo.outputLairs(listOfChimerasLairs);
    }

}