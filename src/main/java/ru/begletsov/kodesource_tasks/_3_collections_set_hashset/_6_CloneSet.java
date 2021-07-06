package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;

/**
 * @Задание 6. Клонирование набора
 * @Раздел Коллекция HashSet
 * @Описание Напишите Java-программу для клонирования хеш-набора в другой хеш-набор.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 06.07.2021
 * @version 1
 */

public class _6_CloneSet {
    public static void printHashCode(HashSet<String> hashSet) {
        //print hash code every one elements hashSet
        for (String hash:
                hashSet) {
            System.out.println(hash + ", " + hash.hashCode());
        }
    }

    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("white");
        hashSet.add("black");
        hashSet.add("orange");
        hashSet.add("blue");
        printHashCode(hashSet);
        //print hash set
        System.out.println("hashSet: " + hashSet);
        //clone hash set
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2 = (HashSet) hashSet.clone();
        //print lists
        System.out.println("hashSet2-cloned: " + hashSet2);
        hashSet.add("pink");
        hashSet.add("green");
        printHashCode(hashSet);
    }
}
