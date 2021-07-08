package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 1. Добавление элементов в набор деревьев
 * @Раздел Коллекция TreeSet
 * @Описание Напишите Java-программу для создания нового набора деревьев, добавьте несколько цветов (строку) и распечатайте набор деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _1_AddElement {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("White");
        treeSet.add("Blue");
        treeSet.add("Black");
        treeSet.add("Pink");
        System.out.println("treeSet: " + treeSet);
    }
}
