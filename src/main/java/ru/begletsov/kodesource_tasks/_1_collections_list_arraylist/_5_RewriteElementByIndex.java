package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 5. Обновление элемента по индексу
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java для обновления определенного элемента массива по заданному элементу.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 22.06.2021
 * @version 1
 */

public class _5_RewriteElementByIndex {
    public static void main(String[] args) {
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        //print the list BEFORE
        System.out.println("BEFORE: " + colors);
        colors.set(0, "red2");
        int indexGreen = colors.indexOf("green");
        colors.set(indexGreen, "green2");
        //print the list AFTER
        System.out.println("AFTER: " + colors);
    }
}
