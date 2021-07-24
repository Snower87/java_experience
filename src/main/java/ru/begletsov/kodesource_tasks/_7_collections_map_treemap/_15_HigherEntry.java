package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 15. Получить наименьший ключ, который строго превышает заданный
 * @Раздел Коллекция TreeMap
 * @Описание Напишите программу на Java, чтобы получить наименьший ключ, строго превышающий заданный ключ. Вернуть ноль, если такого ключа нет.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 24.07.2021
 * @version 1
 */

public class _15_HigherEntry {
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
        System.out.println("Key(s): "+treeMap.higherEntry(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): "+treeMap.higherEntry(20));
        System.out.println("Checking the entry for 65: ");
        System.out.println("Key(s): "+treeMap.higherEntry(65));
        System.out.println("Checking the entry for 90: ");
        System.out.println("Key(s): "+treeMap.higherEntry(90));
    }
}
