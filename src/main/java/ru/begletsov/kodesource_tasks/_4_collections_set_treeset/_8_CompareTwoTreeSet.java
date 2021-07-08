package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 8. Сравнение двух деревьев
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java для сравнения двух наборов деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _8_CompareTwoTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Black");
        treeSet1.add("White");
        treeSet1.add("Pink");
        TreeSet<String> treeSet2 = new TreeSet<>(treeSet1);
        treeSet2.remove("Black");
        for (String color: treeSet1) {
            System.out.println(treeSet2.contains(color) ? "YES, Color2 contains " + color: "NO, Color2 not contains " + color);
        }
    }
}
