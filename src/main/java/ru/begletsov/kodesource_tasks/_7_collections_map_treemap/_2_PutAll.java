package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 2. Объедините две карты TreeMap
 * @Раздел Коллекция TreeMap
 * @Описание Напишите Java-программу для копирования содержимого Tree Map в другую Tree Map.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 13.07.2021
 * @version 1
 */

public class _2_PutAll {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(6, "Red");
        treeMap1.put(2, "Green");
        treeMap1.put(3, "Black");
        TreeMap<Integer, String> treeMap2 = new TreeMap<>();
        treeMap2.put(4, "Orange");
        treeMap2.put(1, "Yellow");
        treeMap2.put(5, "Blue");
        System.out.println("treeMap1: " + treeMap1);
        System.out.println("treeMap2: " + treeMap2);
        System.out.println("after join two maps: ");
        treeMap1.putAll(treeMap2);
        System.out.println("treeMap1: " + treeMap1);
    }
}
