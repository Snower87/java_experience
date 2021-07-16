package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 11. Получить отображение по значению ключа (меньшим или равным данному ключу)
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java, чтобы получить отображение значения ключа, связанное с наибольшим ключом, меньшим или равным данному ключу.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 16.07.2021
 * @version 1
 */

public class _11_FloorEntry {
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
        System.out.println("Value is: " + treeMap.floorEntry(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + treeMap.floorEntry(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + treeMap.floorEntry(70));
    }
}
