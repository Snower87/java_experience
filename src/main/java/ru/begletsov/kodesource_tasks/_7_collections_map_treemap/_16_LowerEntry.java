package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 16. Получить наибольший ключ, который строго меньше заданного
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java, чтобы получить сопоставление ключ-значение, связанное с наибольшим ключом,
 * строго меньшим, чем данный ключ. Вернуть ноль, если такого ключа нет.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 28.07.2021
 * @version 1
 */

public class _16_LowerEntry {
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
        System.out.println("Key(s): "+treeMap.lowerEntry(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): "+treeMap.lowerEntry(20));
        System.out.println("Checking the entry for 65: ");
        System.out.println("Key(s): "+treeMap.lowerEntry(65));
        System.out.println("Checking the entry for 90: ");
        System.out.println("Key(s): "+treeMap.lowerEntry(90));
    }
}
