package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 4. Получение элемента по индексу
 * @Раздел Коллекция ArrayList
 * @Описание Напишите Java-программу для извлечения элемента (по указанному индексу) из заданного списка массивов
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 22.06.2021
 * @version 1
 */

public class _4_GetElementByIndex {
    public static void main(String[] args) {
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        //print the list
        System.out.println(colors);
        //get and print 0, 2 elements of collection
        System.out.println("colors(0) = " + colors.get(0));
        System.out.println("colors(3) = " + colors.get(3));
    }
}
