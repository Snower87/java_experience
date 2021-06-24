package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Задание 10. Перемешать элементы списка
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java для перемешивания элементов в списке массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 24.06.2021
 * @version 1
 */

public class _10_ShuffleElements {
    public static void main(String[] args) {
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        //print the list BEFORE
        System.out.println("BEFORE: " + colors);
        //print the list AFTER shuffle
        Collections.shuffle(colors);
        System.out.println("AFTER : " + colors);
    }
}
