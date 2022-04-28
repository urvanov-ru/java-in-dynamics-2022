package ru.urvanov.javaindynamics2022.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class FileChannelExample {
    public static void main(String[] args) {
        String s = "Моя добавленная строчка\n";
        byte data[] = s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);

        ByteBuffer copy = ByteBuffer.allocate(12);

        // Вместо output.txt укажите имя существующего файла
        // (его содержимое будет изменено)
        try (FileChannel fc = FileChannel.open(
                Paths.get("output.txt"), READ, WRITE)) {
            // Читаем первые 12
            // байт из файла.
            int nread;
            do {
                nread = fc.read(copy);
            } while (nread != -1 && copy.hasRemaining());

            // Пишем "Моя добавленная строчка" в начало файла.
            fc.position(0);
            while (out.hasRemaining())
                fc.write(out);
            out.rewind();

            // Перемещаемся в конец файла. Копируем первые 12 байт в
            // конец файла.  Пишем "Моя добавленная строчка" снова.
            long length = fc.size();
            fc.position(length-1);
            copy.flip();
            while (copy.hasRemaining())
                fc.write(copy);
            while (out.hasRemaining())
                fc.write(out);
        } catch (IOException x) {
            System.out.println("I/O Exception: " + x);
        }
    }
}
