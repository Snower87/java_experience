package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 7. Поиск элемента в списке
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java для поиска элемента в списке массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 23.06.2021
 * @version 1
 */

public class _7_FindElement {
    public static void main(String[] args) {
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        String name = "red";
        if (colors.contains(name)) {
            System.out.println("List contains red-element");
            System.out.println("Index red element in the list: " + colors.indexOf("red"));
        } else {
            System.out.println("List NOT contains red-element");
        }
    }
}
