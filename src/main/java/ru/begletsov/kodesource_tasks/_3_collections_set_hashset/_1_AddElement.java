package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;

/**
 * @Задание 1. Добавление элементов в набор
 * @Раздел Коллекция HashSet
 * @Описание Напишите Java-программу для добавления указанного элемента в конец хеш-набора.
 * и распечатать коллекцию.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 05.07.2021
 * @version 1
 */

public class _1_AddElement {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("White");
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("Pink");
        //print hash set
        System.out.println("hashSet: " + hashSet);
    }
}
