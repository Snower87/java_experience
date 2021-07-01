package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 26. Обновление элемента по индексу
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java для замены элемента в связанном списке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 01.07.2021
 * @version 1
 */

public class _26_SetElementByIndex {
    public static void main(String[] args) {
        //create list1 and add some elements
        LinkedList<String> color1= new LinkedList<>();
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
