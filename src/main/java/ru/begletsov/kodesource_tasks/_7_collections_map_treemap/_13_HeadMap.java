package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 13. Получить ключи, строго меньше заданного ключа
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java, чтобы получить часть карты, ключи которой строго меньше заданного ключа.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 17.07.2021
 * @version 1
 */

public class _13_HeadMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(60, "Orange");
        treeMap.put(70, "Yellow");
        treeMap.put(80, "Blue");
        System.out.println("treeMap: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + treeMap.headMap(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Key(s): " + treeMap.headMap(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + treeMap.headMap(70));
    }
}
