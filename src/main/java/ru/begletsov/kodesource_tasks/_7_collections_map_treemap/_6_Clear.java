package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 6. Очистить карту TreeMap
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java, чтобы получить все ключи из заданной древовидной карты.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 14.07.2021
 * @version 1
 */

public class _6_Clear {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "Orange");
        treeMap.put(5, "Yellow");
        treeMap.put(6, "Blue");
        System.out.println("treeMap: " + treeMap);
        treeMap.clear();
        System.out.println("treeMap: " + treeMap);
    }
}
