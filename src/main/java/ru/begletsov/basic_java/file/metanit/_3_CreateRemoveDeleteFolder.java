package ru.begletsov.basic_java.file.metanit;

import java.io.File;

/**
 * Создание, переименование и удаление каталога
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

public class _3_CreateRemoveDeleteFolder {
    public static void main(String[] args) {
        //определяем объект для каталога
        File dir = new File("F://SomeDir");
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Folder has been created");
        }
        // переименуем каталог
        File newDir = new File("F://NewSomeDir");
        boolean renamed = dir.renameTo(newDir);
        if (renamed) {
            System.out.println("Folder has been renamed");
        }
        // удалим каталог
        boolean deleted = newDir.delete();
        if(deleted) {
            System.out.println("Folder has been deleted");
        }
    }
}
