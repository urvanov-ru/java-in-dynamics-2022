package ru.urvanov.javaindynamics2022.exception;

import java.io.*;

class TryWithResources {

    public static void main(String[] args) {
        byte[] bytesToWrite = new byte[100];

        try (OutputStream os = new FileOutputStream("output.file")) {
            os.write(bytesToWrite);
            System.out.println("end try");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot find the file.");
        } catch (IOException ioex) {
            System.out.println("Error writing file: " + ioex.getMessage());
        }
        // Блок finally уже не нужен, но можно использовать, если хочется.

        System.out.println("End of program.");
    }
}
