package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Задание 14. Поменять два элемента в списке
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java, которая поменяет два элемента в списке массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 24.06.2021
 * @version 1
 */

public class _14_SwapTwoElements {
    public static void main(String[] args) {
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        //print the list BEFORE
        System.out.println("BEFORE: " + colors);
        //print elements list AFTER swap
        Collections.swap(colors, 0,  3);
        System.out.println("AFTER : " + colors);
    }
}
