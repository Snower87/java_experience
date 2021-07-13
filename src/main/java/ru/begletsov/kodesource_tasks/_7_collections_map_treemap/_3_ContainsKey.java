package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 3. Проверить содержит ли карта TreeMap ключ
 * @Раздел Коллекция TreeMap
 * @Описание Напишите Java-программу для копирования содержимого Tree Map в другую Tree Map.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 13.07.2021
 * @version 1
 */

public class _3_ContainsKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "Orange");
        treeMap.put(5, "Yellow");
        treeMap.put(6, "Blue");
        System.out.println("treeMap: " + treeMap);
        int key = 3;
        System.out.println("1. Is key '3' exists?");
        if (treeMap.containsKey(key)) {
            System.out.println("yes - " + treeMap.get(key));
        } else {
            System.out.println("treeMap NOT contains KEY " + key);
        }
        key = 18;
        System.out.println("2. Is key '18' exists?");
        if (treeMap.containsKey(key)) {
            System.out.println("yes - " + treeMap.get(key));
        } else {
            System.out.println("treeMap NOT contains KEY " + key);
        }
    }
}
