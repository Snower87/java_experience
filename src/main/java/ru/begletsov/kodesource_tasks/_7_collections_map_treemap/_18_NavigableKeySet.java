package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 18. Получить представление NavigableSet о ключах, содержащихся в карте
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java, чтобы получить представление NavigableSet о ключах, содержащихся в карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 01.08.2021
 * @version 1
 */

public class _18_NavigableKeySet {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(60, "Orange");
        treeMap.put(70, "Yellow");
        treeMap.put(80, "Blue");
        System.out.println("treeMap: " + treeMap);
        System.out.println("navigableKeySet: " + treeMap.navigableKeySet());
    }
}
