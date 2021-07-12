package ru.begletsov.kodesource_tasks._6_collections_map_hashmap;

import java.util.HashMap;

/**
 * @Задание 10. Получить значение по ключу в отображении
 * @Раздел Коллекция HashMap
 * @Описание апишите программу на Java, чтобы получить значение указанного ключа на карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 11.07.2021
 * @version 1
 */

public class _10_GetValue {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "Orange");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Blue");
        System.out.println("hashMap: " + hashMap);
        System.out.println("get value hashMap by key = 5: " + hashMap.get(5));
    }
}
