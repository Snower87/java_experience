package ru.begletsov.kodesource_tasks._6_collections_map_hashmap;

import java.util.HashMap;

/**
 * @Задание 6. Клонирование карты
 * @Раздел Коллекция HashMap
 * @Описание Напишите программу на Java, чтобы получить поверхностную копию экземпляра HashMap.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 11.07.2021
 * @version 1
 */

public class _6_CloneMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Green");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "Orange");
        hashMap1.put(5, "Yellow");
        hashMap1.put(6, "Blue");
        System.out.println("hashMap1: " + hashMap1);
        System.out.println("Size hashMap1: " + hashMap1.size() + ", isEmpty = " + hashMap1.isEmpty());
        System.out.println("hashMap2 BEFORE clone: " + hashMap2);
        System.out.println("Size hashMap2: " + hashMap2.size() + ", isEmpty = " + hashMap2.isEmpty());
        hashMap2 = (HashMap<Integer, String>) hashMap1.clone();
        System.out.println("hashMap2 AFTER clone: " + hashMap2);
        System.out.println("Size hashMap2: " + hashMap2.size() + ", isEmpty = " + hashMap2.isEmpty());
    }
}
