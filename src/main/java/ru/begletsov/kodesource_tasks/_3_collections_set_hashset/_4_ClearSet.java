package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;

/**
 * @Задание 4. Очистить набор
 * @Раздел Коллекция HashSet
 * @Описание Напишите программу на Java, чтобы очистить хэш-набор.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 06.07.2021
 * @version 1
 */

public class _4_ClearSet {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>(hashSet);
        hashSet.add("White");
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("Pink");
        //print hash set
        System.out.println("Original hashSet: " + hashSet);
        hashSet.clear();
        //print after clear hash set
        System.out.println("After clear hashSet: " + hashSet);
    }
}
