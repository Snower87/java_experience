package ru.begletsov.kodesource_tasks._6_collections_map_hashmap;

import java.util.HashMap;

/**
 * @Задание 3. Объединить две карты
 * @Раздел Коллекция HashMap
 * @Описание Напишите программу на Java, чтобы скопировать все сопоставления с указанной карты на другую карту.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 10.07.2021
 * @version 1
 */

public class _3_JoinTwoMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap2.put(4, "Orange");
        hashMap2.put(5, "Yellow");
        hashMap2.put(6, "Blue");
        System.out.println("hashMap1: " + hashMap1);
        System.out.println("hashMap2: " + hashMap2);
        System.out.println("after join two maps: ");
        hashMap1.putAll(hashMap2);
        System.out.println("hashMap1: " + hashMap1);
    }
}
