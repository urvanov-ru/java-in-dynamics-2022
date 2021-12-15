package ru.urvanov.javaindynamics2022.exception;

import java.io.*;

class BlockFinally {

    public static void main(String[] args) {
        byte[] bytesToWrite = new byte[100];
        OutputStream os = null;
        try {
            os = new FileOutputStream("output.file");
            os.write(bytesToWrite);
            System.out.println("end try");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot find the file.");
        } catch (IOException ioex) {
            System.out.println("Error writing file: " + ioex.getMessage());
        } finally {
            System.out.println("finally.");
            if (os != null) {
                // Метод close тоже может бросить
                // исключение.
                try {
                    os.close();
                } catch (IOException closeException) {
                    System.out.println("closeException: "
                            + closeException.getMessage());
                }
            }
        }

        System.out.println("End of program.");
    }
}