package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 3. Добавить все элементы набора деревьев в другой
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java, чтобы добавить все элементы указанного набора деревьев в другой набор деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _3_AddAll {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("White");
        treeSet1.add("Blue");
        System.out.println("treeSet1: " + treeSet1);
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Black");
        treeSet2.add("Pink");
        treeSet2.add("White");
        treeSet2.add("Green");
        System.out.println("treeSet2: " + treeSet2);
        treeSet1.addAll(treeSet2);
        System.out.println("treeSet1 after addAll: " + treeSet1);
    }
}
