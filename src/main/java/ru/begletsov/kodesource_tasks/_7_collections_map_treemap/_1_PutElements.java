package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Задание 1. Добавьте элементы в карту TreeMap
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java, чтобы связать указанное значение с указанным ключом в древовидной карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 13.07.2021
 * @version 1
 */

public class _1_PutElements {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "Orange");
        treeMap.put(5, "Yellow");
        treeMap.put(6, "Blue");
        System.out.println(treeMap);
        System.out.println("key-set method:");
        for (Integer key: treeMap.keySet()) {
            System.out.println(key + ", " + treeMap.get(key));
        }
        System.out.println("entry-set method:");
        for (Map.Entry<Integer, String> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
