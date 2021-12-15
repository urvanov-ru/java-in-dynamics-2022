package ru.urvanov.javaindynamics2022.exception;

import java.io.*;

class BlockTry {

    public static void main(String[] args) {
        byte[] bytesToWrite = new byte[100];

        try {
            OutputStream os = new FileOutputStream("output.file");
            os.write(bytesToWrite);
            os.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot find the file.");
        } catch (IOException ioex) {
            System.out.println("Error writing file: " + ioex.getMessage());
        }

    }
}