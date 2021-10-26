package ru.urvanov.javaindynamics2022.enums;

enum MagicCreature {
    GOBLIN(100, 50),
    HOBGOBLIN(110, 30),
    GREMLIN(200, 10);

    private int health;
    private int magic;

    MagicCreature(int health, int magic) {
        this.health = health;
        this.magic = magic;
    }

    public int getHealth() {
        return this.health;
    }

    public int getMagic() {
        return this.magic;
    }

    public static void main(String[] args) {
        System.out.println("Goblin. Health: "
                + MagicCreature.GOBLIN.getHealth()
                + " magic: " + MagicCreature.GOBLIN.getMagic());
    }
}

