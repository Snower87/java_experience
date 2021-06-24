package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 12. Извлечь часть списка
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java для извлечения части списка массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 24.06.2021
 * @version 1
 */

public class _12_GetElementsFromTo {
    public static void main(String[] args) {
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        //print elements list from...to
        List<String> subColors = colors.subList(0, 3);
        System.out.println(subColors);
    }
}
