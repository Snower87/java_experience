package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 6. Удаление элемента по индексу
 * @Раздел Коллекция ArrayList
 * @Описание Напишите Java-программу для удаления третьего элемента из списка массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 22.06.2021
 * @version 1
 */

public class _6_RemoveElementByIndex {
    public static void main(String[] args) {
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        //print the list BEFORE
        System.out.println("BEFORE: " + colors);
        //print the list AFTER
        colors.remove(2);
        System.out.println("AFTER1: " + colors);
        colors.remove(0);
        System.out.println("AFTER2: " + colors);
    }
}
