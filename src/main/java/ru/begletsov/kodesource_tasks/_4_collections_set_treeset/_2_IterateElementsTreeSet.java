package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Задание 2. Вывод и перебор всех элементов в наборе деревьев
 * @Раздел Коллекция TreeSet
 * @Описание Напишите Java-программу для перебора всех элементов в наборе деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _2_IterateElementsTreeSet {
    public static void iterateMethodFirst() {
        System.out.println("First method iterate (for-each):");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("White");
        treeSet.add("Blue");
        treeSet.add("Black");
        treeSet.add("Pink");
        for (String element:
                treeSet) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void iterateMethodSecond() {
        System.out.println("Second method iterate (iterator):");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("White");
        treeSet.add("Blue");
        treeSet.add("Black");
        treeSet.add("Pink");
        Iterator iterator = treeSet.iterator();
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
