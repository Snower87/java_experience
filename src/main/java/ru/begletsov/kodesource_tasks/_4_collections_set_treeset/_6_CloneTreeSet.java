package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 6. Клонирование набора деревьев
 * @Раздел Коллекция TreeSet
 * @Описание Напишите Java-программу для клонирования списка наборов деревьев в другой набор деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _6_CloneTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Black");
        treeSet1.add("Pink");
        treeSet1.add("White");
        treeSet1.add("Green");
        System.out.println("treeSet1: " + treeSet1);
        TreeSet<String> treeSet2 = (TreeSet<String>) treeSet1.clone();
        System.out.println("treeSet2 (cloned): " + treeSet2);
    }
}
