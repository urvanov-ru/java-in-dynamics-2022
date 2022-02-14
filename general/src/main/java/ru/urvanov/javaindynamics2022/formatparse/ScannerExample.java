package ru.urvanov.javaindynamics2022.formatparse;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(
                    new FileReader(
                            "scanner-data.txt",
                            StandardCharsets.UTF_8)));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}