package ru.begletsov.kodesource_tasks._6_collections_map_hashmap;

import java.util.HashMap;

/**
 * @Задание 7. Проверить содержит ли карта ключ
 * @Раздел Коллекция HashMap
 * @Описание Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного ключа.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 11.07.2021
 * @version 1
 */

public class _7_ContainsKey {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "Orange");
        hashMap1.put(5, "Yellow");
        hashMap1.put(6, "Blue");
        System.out.println("hashMap1: " + hashMap1);
        int key = 3;
        System.out.println("1. Is key '3' exists?");
        if (hashMap1.containsKey(key)) {
            System.out.println("yes - " + hashMap1.get(key));
        } else {
            System.out.println("hashMap1 NOT contains KEY " + key);
        }
        key = 33;
        System.out.println("2. Is key '33' exists?");
        if (hashMap1.containsKey(key)) {
            System.out.println("yes - " + hashMap1.get(key));
        } else {
            System.out.println("hashMap1 NOT contains KEY " + key);
        }
    }
}
