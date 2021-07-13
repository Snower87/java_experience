package ru.begletsov.kodesource_tasks._6_collections_map_hashmap;

import java.util.HashMap;

/**
 * @Задание 12. Получить коллекцию значений в карте
 * @Раздел Коллекция HashMap
 * @Описание Напишите программу на Java, чтобы получить коллекционное представление значений, содержащихся в этой карте.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 12.07.2021
 * @version 1
 */

public class _12_Values {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "Orange");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Blue");
        System.out.println("hashMap: " + hashMap);
        System.out.println("values hashMap: " + hashMap.values());
    }
}
