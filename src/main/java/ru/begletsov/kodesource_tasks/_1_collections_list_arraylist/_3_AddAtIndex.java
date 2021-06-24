package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 3. Вставка элемента по индексу
 * @Раздел Коллекция ArrayList
 * @Описание Напишите Java-программу для вставки элемента в список массивов в первой позиции.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 21.06.2021
 * @version 1
 */

public class _3_AddAtIndex {
    public static void main(String[] args) {
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("black");
        colors.add("yellow");
        //print the list "before"
        System.out.println("Elements list colors BEFORE add at index:");
        System.out.println(colors);
        System.out.println();
        //print the list "after"
        colors.add(0, "<blue1>");
        colors.add(colors.size(), "<blue2>");
        System.out.println("Elements list colors AFTER:");
        System.out.println(colors);
    }
}
