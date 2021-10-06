package ru.begletsov.basic_java.file.metanit;

import java.io.File;
import java.util.Arrays;

/**
 * Работа с файлами и каталогами
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

public class _1_FirstFile {
    public static void main(String[] args) {
        // создаем объект File для каталога
        File dir1 = new File("C://AVR_Project");
        String[] files = dir1.list();
        Arrays.stream(files).forEach(System.out::println);
    }
}
