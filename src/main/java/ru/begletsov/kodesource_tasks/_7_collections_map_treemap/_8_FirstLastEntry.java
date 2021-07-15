package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 8. Получить наибольшее/наименьшее сопоставление ключ-значение в карте TreeMap
 * @Раздел Коллекция TreeMap
 * @Описание Напишите Java-программу, чтобы получить сопоставление ключ-значение, связанное с наибольшим ключом и наименьшим ключом на карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 15.07.2021
 * @version 1
 */

public class _8_FirstLastEntry {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C6", "Red");
        treeMap.put("C5", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "Orange");
        treeMap.put("C2", "Yellow");
        treeMap.put("C1", "Blue");
        System.out.println("treeMap: " + treeMap);
        System.out.println("Greatest key: " + treeMap.firstEntry());
        System.out.println("Least key: " + treeMap.lastEntry());
    }
}
