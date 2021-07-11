package ru.begletsov.kodesource_tasks._6_collections_map_hashmap;

import java.util.HashMap;
import java.util.Set;

/**
 * @Задание 9. Получить набор отображений в карте
 * @Раздел Коллекция HashMap
 * @Описание Напишите Java-программу для создания набора представлений отображений, содержащихся в карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 11.07.2021
 * @version 1
 */

public class _9_EntrySet {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "Orange");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Blue");
        System.out.println("hashMap: " + hashMap);
        Set setKeyValue = hashMap.entrySet();
        System.out.println("Set values: " + setKeyValue);
    }
}
