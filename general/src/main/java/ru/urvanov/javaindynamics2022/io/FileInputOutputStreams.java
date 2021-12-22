package ru.urvanov.javaindynamics2022.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Файловые потоки ввода / вывода
 */
class FileInputOutputStreams {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("input.txt"); OutputStream os = new FileOutputStream("output.txt")) {
            int bytesReaded;
            final int BUFFER_SIZE = 10_000;
            byte[] buff = new byte[BUFFER_SIZE];
            while ((bytesReaded = is.read(buff)) != -1) {
                os.write(buff, 0, bytesReaded);
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }
}
