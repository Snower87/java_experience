package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;

/**
 * @Задание 5. Пустой набор или нет
 * @Раздел Коллекция HashSet
 * @Описание Напишите Java-программу для проверки того, что набор хэшей пуст или нет.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 06.07.2021
 * @version 1
 */

public class _5_IsEmptySet {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("Pink");
        System.out.println("COLOR1: " + hashSet);
        //print set is empty?
        System.out.println("Size hashSet: " + hashSet.size() + ", isEmpty = " + hashSet.isEmpty());
        //print set is empty?
        System.out.println("AFTER revome all elements:");
        hashSet.removeAll(hashSet);
        System.out.println("Size hashSet: " + hashSet.size() + ", isEmpty = " + hashSet.isEmpty());
    }
}
