package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Задание 3. Получить размер набора
 * @Раздел Коллекция HashSet
 * @Описание Напишите программу на Java, чтобы получить количество элементов в хэш-наборе.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 05.07.2021
 * @version 1
 */

public class _3_GetSizeHashSet {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("Pink");
        //print hash set size collection
        System.out.println("size hashset: " + hashSet.size());
        System.out.println("original hashset: " + hashSet);
        String[] elements = hashSet.toArray(new String[0]);
        System.out.println("massiv elements[] from hashset: " + Arrays.deepToString(elements));
    }
}
