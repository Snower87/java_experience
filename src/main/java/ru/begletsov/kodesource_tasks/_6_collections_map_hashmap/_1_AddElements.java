package ru.begletsov.kodesource_tasks._6_collections_map_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Задание 1. Добавьте элементы в карту HashMap
 * @Раздел Коллекция HashMap
 * @Описание Напишите программу на Java, чтобы связать указанное значение с указанным ключом в HashMap.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 10.07.2021
 * @version 1
 */

public class _1_AddElements {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "Orange");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Blue");
        System.out.println(hashMap);
        System.out.println("key-set method:");
        for (Integer key:
             hashMap.keySet()) {
            System.out.println(key + ", " + hashMap.get(key));
        }
        System.out.println("entry-set method:");
        for(Map.Entry x: hashMap.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
