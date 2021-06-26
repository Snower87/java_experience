package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;

/**
 * @Задание 21. Заменить элемент по указанному индексу
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java, чтобы заменить второй элемент ArrayList указанным элементом.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 26.06.2021
 * @version 1
 */

public class _21_SetElementByIndex {
    public static void main(String[] args) {
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        color1.add("White");
        System.out.println(color1);
        //rewrite element list with index = 1
        String newColor = "Green2";
        color1.set(1, newColor);
        //print list after rewrite
        System.out.println(color1);
    }
}
