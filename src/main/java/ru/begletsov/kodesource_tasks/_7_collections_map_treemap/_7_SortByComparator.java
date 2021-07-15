package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Задание 7. Сортировка TreeMap с помощью компаратора
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java для сортировки ключей в Tree Map с помощью компаратора.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 15.07.2021
 * @version 1
 */

public class _7_SortByComparator {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>(new SortKey());
        //TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C6", "Red");
        treeMap.put("C5", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "Orange");
        treeMap.put("C2", "Yellow");
        treeMap.put("C1", "Blue");
        System.out.println("treeMap: " + treeMap);
    }

    public static class SortKey implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str2.compareTo(str1);
        }
    }
}
