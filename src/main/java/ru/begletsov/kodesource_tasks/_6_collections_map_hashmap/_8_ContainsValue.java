package ru.begletsov.kodesource_tasks._6_collections_map_hashmap;

import java.util.HashMap;

/**
 * @Задание 8. Проверить содержит ли карта значение
 * @Раздел Коллекция HashMap
 * @Описание Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного значения.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 11.07.2021
 * @version 1
 */

public class _8_ContainsValue {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "Orange");
        hashMap1.put(5, "Yellow");
        hashMap1.put(6, "Blue");
        System.out.println("hashMap1: " + hashMap1);
        String value = "Red";
        System.out.println("1. Is value 'Red' exists?");
        if (hashMap1.containsValue(value)) {
            System.out.println("yes");
        } else {
            System.out.println("not");
        }
        value = "orange";
        System.out.println("2. Is value 'orange' exists?");
        if (hashMap1.containsValue(value)) {
            System.out.println("yes");
        } else {
            System.out.println("not");
        }
    }
}
