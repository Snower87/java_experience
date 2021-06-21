package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Задание 2. Итерация всех элементов списка массивов (for-each, iterator)
 * @Раздел Коллекция ArrayList
 * @Описание Напишите Java-программу для итерации всех элементов списка массивов
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 21.06.2021
 * @version 1
 */

public class ForEachIterate_2 {
    public static void iterateMethodFirst() {
        System.out.println("First method iterate (for-each):");
        //create list and add some elements
        List<String> numberString = new ArrayList<String>();
        numberString.add("111");
        numberString.add("222");
        numberString.add("333");
        //print the list
        for (String element:
                numberString) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void iterateMethodSecond() {
        System.out.println("Second method iterate (iterator):");
        //create list and add some elements
        List<String> colors = new ArrayList<String>();
        colors.add("white");
        colors.add("black");
        colors.add("orange");
        colors.add(2, "grey");
        //print the list
        Iterator iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        iterateMethodFirst();
        iterateMethodSecond();
    }
}
