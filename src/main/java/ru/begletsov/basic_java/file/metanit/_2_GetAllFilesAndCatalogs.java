package ru.begletsov.basic_java.file.metanit;

import java.io.File;

/**
 * Получение списка всех файлов и каталогов по указанному пути
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

public class _2_GetAllFilesAndCatalogs {
    public static boolean getAllFilesAndFolder(String path) {
        //получаем объект для каталога
        File dir = new File(path);
        //если объект - каталог
        if (dir.isDirectory()) {
            for (File file: dir.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println(file.getName() + " folder");
                } else {
                    System.out.println(file.getName() + " file");
                }
            }
        }
        return dir.exists();
    }

    public static void main(String[] args) {
        getAllFilesAndFolder("C://AVR_Project");
    }
}
