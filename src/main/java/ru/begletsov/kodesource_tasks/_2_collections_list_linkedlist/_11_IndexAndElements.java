package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Задание 11. Вывести индексы и элементы списка
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для отображения элементов и их позиций в связанном списке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 24.06.2021
 * @version 1
 */

public class _11_IndexAndElements {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        for (int index = 0; index < colors.size(); index++) {
            System.out.println("Index " + index + ", element: " + colors.get(index));
        }
    }
}
