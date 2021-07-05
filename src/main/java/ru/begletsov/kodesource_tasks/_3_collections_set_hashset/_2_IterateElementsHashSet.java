package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Задание 2. Вывод и перебор всех элементов набора
 * @Раздел Коллекция HashSet
 * @Описание Напишите Java-программу для перебора всех элементов в хэш-списке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 05.07.2021
 * @version 1
 */

public class _2_IterateElementsHashSet {
    public static void iterateMethodFirst() {
        System.out.println("First method iterate (for-each):");
        // Create a empty hash set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("Pink");
        //print the hash set
        for (String element:
                hashSet) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void iterateMethodSecond() {
        System.out.println("Second method iterate (iterator):");
        // Create a empty hash set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("Pink");
        //print the hash set
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        iterateMethodFirst();
        iterateMethodSecond();
    }
}
