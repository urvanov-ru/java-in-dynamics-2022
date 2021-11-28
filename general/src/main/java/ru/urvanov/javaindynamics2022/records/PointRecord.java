package ru.urvanov.javaindynamics2022.records;

public record PointRecord(int x, int y) {

    public static void main(String[] args) {
        PointRecord pointRecord = new PointRecord(100, 100);
        System.out.println("record = " + pointRecord);
    }
}
