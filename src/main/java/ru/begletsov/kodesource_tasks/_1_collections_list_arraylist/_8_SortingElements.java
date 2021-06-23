package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Задание 8. Сортировка массива
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java для сортировки заданного списка массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 23.06.2021
 * @version 1
 */

public class _8_SortingElements {
    public static void sortNaturalOrder(List<String> list) {
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorting by natural order:");
        System.out.println(list);
    }

    public static void sortReverseOrder(List<String> list) {
        list.sort(Comparator.reverseOrder());
        System.out.println("Sorting by reverse order:");
        System.out.println(list);
    }

    public static void sortCollectionMethod(List<String> list) {
        System.out.println("Collections sort by natural order:");
        Collections.sort(list);
        System.out.println(list);
        System.out.println();
        System.out.println("Collections sort by reverse order:");
        //Collections.sort(list, Collections.reverseOrder());
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        System.out.println("BEFORE sorting:");
        System.out.println(colors);
        System.out.println();
        sortNaturalOrder(colors);
        System.out.println();
        sortReverseOrder(colors);
        System.out.println();
        sortCollectionMethod(colors);
    }
}
