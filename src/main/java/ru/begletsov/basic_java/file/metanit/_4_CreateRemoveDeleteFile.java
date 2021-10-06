package ru.begletsov.basic_java.file.metanit;

import java.io.File;
import java.io.IOException;

/**
 * Создание, переименование и удаление файлов
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

public class _4_CreateRemoveDeleteFile {
    public static void main(String[] args) {
        // определяем объект для каталога
        File myFile = new File("F://SomeDir//notes.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());

        boolean createdDir = myFile.mkdir();
        if (createdDir) {
            System.out.println("Folder has been created");
        }

        boolean createFile = false;
        //createFile = myFile.createNewFile();
        if(createFile)
            System.out.println("File created");
        else
            System.out.println("File not created");

        if(myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println("File size: " + myFile.length());
        if(myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if(myFile.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

        // создадим новый файл
        File newFile = new File("F://SomeDir//MyFile");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
