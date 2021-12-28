package ru.urvanov.javaindynamics2022.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.*;

// Пример реализации SimpleFileVisitor
public class PrintFiles
        extends SimpleFileVisitor<Path> {

    // Выводит в консоль информацию о
    // каждом типе файлов.
    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attr) {
        if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link: %s ", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular file: %s ", file);
        } else {
            System.out.format("Other: %s ", file);
        }
        System.out.println("(" + attr.size() + "bytes)");
        return CONTINUE;
    }

    // Пишет в консоль каждый посещаяемый каталог
    @Override
    public FileVisitResult postVisitDirectory(Path dir,
                                              IOException exc) {
        System.out.format("Directory: %s%n", dir);
        return CONTINUE;
    }

    // Если возникла какая-нибудь ошибка при доступе к файлу,
    // то выводим эту ошибку.
    // Если вы не переопределите этот метод, и возникнет
    // ошибка, то бросится исключение IOException
    @Override
    public FileVisitResult visitFileFailed(Path file,
                                           IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }
}
