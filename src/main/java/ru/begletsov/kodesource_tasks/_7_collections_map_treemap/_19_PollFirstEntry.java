package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 19. Получить (и удалить) сопоставления ключ-значение, связанного с наименьшим ключом на карте
 * @Раздел Коллекция TreeMap
 * @Описание Напишите Java-программу для удаления и получения сопоставления ключ-значение, связанного с наименьшим ключом на карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 07.08.2021
 * @version 1
 */

public class _19_PollFirstEntry {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(60, "Orange");
        treeMap.put(70, "Yellow");
        treeMap.put(80, "Blue");
        System.out.println("treeMap: " + treeMap);
        System.out.println("pollFirstEntry: " + treeMap.pollFirstEntry());
        System.out.println("treeMap after: " + treeMap);
    }
}
