package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @Задание 17. Очистка списка
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java, чтобы очистить список массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 25.06.2021
 * @version 1
 */

public class _17_ClearList {

    public static void clearListVer1() {
        System.out.println("<< FUNCTION clearListVer1 >>");
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        System.out.println("COLOR1: " + color1);
        //clear list
        color1.removeAll(color1);
        System.out.println("COLOR1: " + color1);
        System.out.println();
    }

    public static void clearListVer2() {
        System.out.println("<< FUNCTION clearListVer2 >>");
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        System.out.println("COLOR1: " + color1);
        //clear list
        ListIterator listIterator = color1.listIterator(color1.size());
        while (listIterator.hasPrevious()) {
            System.out.println("Elements before delete: " + listIterator.previous());
            listIterator.remove();
        }
        System.out.println("COLOR1: " + color1);
        System.out.println();
    }

    public static void main(String[] args) {
        clearListVer1();
        clearListVer2();
    }
}
