package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Задание 8. Преобразовать набор Set в дерево TreeSet
 * @Раздел Коллекция HashSet
 * @Описание Напишите Java-программу для преобразования хэш-набора в набор деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 07.07.2021
 * @version 1
 */

public class _8_ConvertSetToTreeSet {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("white");
        hashSet.add("black");
        hashSet.add("orange");
        hashSet.add("blue");
        //print hash set
        System.out.println("hashSet: " + hashSet);
        // Create a empty tree set
        Set<String> treeSet = new TreeSet<>(Collections.reverseOrder());
        //Set<String> treeSet = new TreeSet<>(hashSet); //можно так создать
        treeSet.addAll(hashSet);
        //print tree set elements
        System.out.println("treeSet: " + treeSet);
    }
}
