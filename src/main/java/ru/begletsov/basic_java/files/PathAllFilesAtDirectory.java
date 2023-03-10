package ru.begletsov.basic_java.files;

import java.io.File;
import java.util.ArrayList;

/**
 * Класс PathAllFilesAtDirectory Дерево папок с названиями файлов (с разделителем). Для дисков H, G
 */

public class PathAllFilesAtDirectory {
    static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        File dir = new File("G:\\Games");
        //File dir = new File("H:\\");
        showFiles(dir.listFiles());
    }

    public static void showFiles(File[] files) {
        for (File file: files) {
            if (file.isDirectory()) {
                //System.out.println();
                //System.out.println("Directory:    " + file.getAbsolutePath());
                parsingString(file.getAbsolutePath());
                showFiles(file.listFiles());
            } else {
                //System.out.println(file.getName());
            }
        }
    }

    public static void parsingString(String str) {
        int numDelim = 0;
        for (char ch: str.toCharArray()) {
            if (ch == '\\') {
                numDelim++;
            }
        }

        if (str.contains("G:\\Games")) {
            if (numDelim == 4) {
                System.out.println(str.substring(9));
            }
        }

        if (str.contains("H:\\")) {
            if (numDelim == 3) {
                System.out.println(str.substring(3));
            }
        }
    }
}
