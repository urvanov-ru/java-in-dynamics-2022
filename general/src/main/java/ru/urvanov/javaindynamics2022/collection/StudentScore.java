package ru.urvanov.javaindynamics2022.collection;

import java.util.Objects;

public final class StudentScore implements Comparable<StudentScore> {
    private final String name;
    private final int math;
    private final int physics;
    private final int philosophy;

    public StudentScore(
            String name,
            int math,
            int physics,
            int philosophy) {
        if (name == null) {
            throw new NullPointerException();
        }
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.philosophy = philosophy;
    }

    private double averageScore() {
        return ((double) math + physics + philosophy) / 3.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentScore that = (StudentScore) o;
        return math == that.math
                && physics == that.physics
                && philosophy == that.philosophy
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, math, physics, philosophy);
    }

    @Override
    public int compareTo(StudentScore otherStudentScore) {
        if (otherStudentScore == null) {
            throw new NullPointerException();
        }
        double averageScoreThis = averageScore();
        double averageScoreOther = otherStudentScore.averageScore();
        return Double.compare(averageScoreThis, averageScoreOther);
    }

    @Override
    public String toString() {
        return "StudentScore{" +
                "name='" + name + '\'' +
                ", math=" + math +
                ", physics=" + physics +
                ", philosophy=" + philosophy +
                '}';
    }
}
