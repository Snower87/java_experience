package ru.begletsov.kodesource_tasks._7_collections_map_treemap;

import java.util.TreeMap;

/**
 * @Задание 17. Получить наибольший ключ, который строго меньше заданного
 * @Раздел Коллекция TreeMap
 * @Описание Напишите Java-программу, чтобы получить самый большой ключ строго меньше, чем данный ключ. Вернуть ноль,
 * если такого ключа нет.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 30.07.2021
 * @version 1
 */

public class _17_LowerKey {
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
        System.out.println("Key(s): " + treeMap.lowerKey(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + treeMap.lowerKey(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + treeMap.lowerKey(70));
    }
}
