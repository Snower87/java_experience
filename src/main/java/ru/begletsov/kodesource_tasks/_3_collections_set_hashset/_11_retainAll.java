package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;

/**
 * @Задание 11. Элементы одинаковые для двух наборов
 * @Раздел Коллекция HashSet
 * @Описание Напишите Java-программу для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 07.07.2021
 * @version 1
 */

public class _11_retainAll {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        // use add() method to add values in the hash set
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Black");
        hashSet1.add("White");
        System.out.println("hashSet1 content: " + hashSet1);
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Red");
        hashSet2.add("Pink");
        hashSet2.add("Black");
        hashSet2.add("Orange");
        System.out.println("hashSet2 content: " + hashSet2);
        hashSet1.retainAll(hashSet2);
        System.out.println("hashSet1 content AFTER: " + hashSet1);
    }
}
