package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 10. Получить представление ключей в обратном порядке
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java, чтобы получить представление в обратном порядке ключей, содержащихся в данной карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 15.07.2021
 * @version 1
 */

public class _10_DescendingKeySet {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "Orange");
        treeMap.put(5, "Yellow");
        treeMap.put(6, "Blue");
        System.out.println("treeMap: " + treeMap);
        System.out.println("descending key: " + treeMap.descendingKeySet());
        TreeMap<Integer, String> treeMap2 = new TreeMap<>(treeMap.descendingMap());
        System.out.println("treeMap2: " + treeMap2);
    }
}
