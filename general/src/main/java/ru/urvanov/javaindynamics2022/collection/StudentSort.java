package ru.urvanov.javaindynamics2022.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {
        StudentScore[] studentScoreArray = new StudentScore[] {
                new StudentScore("Mary", 2, 5, 1),
                new StudentScore("John", 5, 5, 5),
                new StudentScore("Tom", 2, 2, 2)
        };
        List<StudentScore> studentScoreList = Arrays.asList(studentScoreArray);
        Collections.sort(studentScoreList);
        System.out.println(studentScoreList);
    }
}
