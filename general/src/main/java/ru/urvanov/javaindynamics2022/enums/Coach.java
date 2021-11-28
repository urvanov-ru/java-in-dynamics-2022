package ru.urvanov.javaindynamics2022.enums;

public class Coach {
    private int x;
    private int y;

    public void move(Direction direction) {
        switch (direction) {
            case NORTH:
                y--;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y++;
                break;
            case WEST:
                x--;
                break;
        }
    }
}
