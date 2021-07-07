package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;

/**
 * @Задание 10. Сравнение двух хеш-наборов
 * @Раздел Коллекция HashSet
 * @Описание Напишите Java-программу для сравнения двух хеш-наборов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 07.07.2021
 * @version 1
 */

public class _10_CompareTwoSet {
    public static void main(String[] args) {
        //create a empty hashSet1 and add some elements
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Black");
        hashSet1.add("White");
        hashSet1.add("Pink");
        //create hashSet2 and add some elements
        HashSet<String> hashSet2 = new HashSet<>(hashSet1);
        hashSet2.remove("Black");
        //compare 2 set
        for (String color: hashSet1) {
            System.out.println(hashSet2.contains(color) ? "YES, Color2 contains " + color: "NO, Color2 not contains " + color);
        }
    }
}
