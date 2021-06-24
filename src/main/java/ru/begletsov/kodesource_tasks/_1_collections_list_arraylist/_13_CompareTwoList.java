package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;

/**
 * @Задание 12. Сравнение 2х списков
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java для сравнения двух списков массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 24.06.2021
 * @version 1
 */

public class _13_CompareTwoList {
    public static void main(String[] args) {
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<String>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("White");
        color1.add("Pink");
        //create list1 and add some elements
        ArrayList<String> color2= new ArrayList<String>();
        color2.add("Red");
        color2.add("Green");
        color2.add("Black");
        color2.add("Pink");
        //compare 2 list
        for (String color: color1) {
            System.out.println(color2.contains(color) ? "YES, Color1 contains " + color: "NO, Color1 not contains " + color);
        }
    }
}
