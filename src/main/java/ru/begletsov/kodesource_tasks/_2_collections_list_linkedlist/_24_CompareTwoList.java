package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 24. Сравнение двух списков
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java для сравнения двух связанных списков.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 01.07.2021
 * @version 1
 */

public class _24_CompareTwoList {
    public static void main(String[] args) {
        //create list1 and add some elements
        LinkedList<String> color1= new LinkedList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("White");
        color1.add("Pink");
        //create list2 and add some elements
        LinkedList<String> color2= new LinkedList<>();
        color2.add("Red");
        color2.add("Green");
        color2.add("Black");
        color2.add("Pink");
        //compare 2 list
        for (String color: color1) {
            System.out.println(color2.contains(color) ? "YES, Color2 contains " + color: "NO, Color2 not contains " + color);
        }
    }
}
