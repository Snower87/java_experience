package ru.begletsov.basic_java.files;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Класс PathAllFilesAtDirectory Дерево папок с названиями файлов (с разделителем). Для дисков H, G
 * 1) базовый функционал 2) добавил методы: сортировки и вывода на консоль
 */

public class PathAllFilesAtDirectory {
    static ArrayList list = new ArrayList();
    static List<String> strings = new ArrayList<>();

    public static void sortList() {
        Collections.sort(strings);
    }

    public static void showAllAtList() {
        for (String str: strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        File dir = new File("G:\\");
        //File dir = new File("H:\\");
        showFiles(dir.listFiles());
        sortList();
        System.out.println("=== SORTED LIST ===");
        showAllAtList();
        System.out.println("end");
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

        if (str.contains("G:\\")) {
            if (numDelim == 3) {
                System.out.println(str.substring(3));
                strings.add(str.substring(3));
            }
        }

        if (str.contains("H:\\")) {
            if (numDelim == 3) {
                System.out.println(str.substring(3));
            }
        }
    }
}
