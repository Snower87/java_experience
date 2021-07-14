package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 4. Проверить содержит ли карта TreeMap значение
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java для поиска значения в древовидной карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 14.07.2021
 * @version 1
 */

public class _4_ContainsValue {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "Orange");
        treeMap.put(5, "Yellow");
        treeMap.put(6, "Blue");
        System.out.println("treeMap: " + treeMap);
        String value = "Yellow";
        System.out.println("1. Is value 'Yellow' exists?");
        if (treeMap.containsValue(value)) {
            System.out.println("yes - treeMap contains value " + value);
        } else {
            System.out.println("treeMap NOT contains value " + value);
        }
        value = "6";
        System.out.println("2. Is value '6' exists?");
        if (treeMap.containsValue(value)) {
            System.out.println("yes - treeMap contains value " + value);
        } else {
            System.out.println("treeMap NOT contains value " + value);
        }
    }
}
