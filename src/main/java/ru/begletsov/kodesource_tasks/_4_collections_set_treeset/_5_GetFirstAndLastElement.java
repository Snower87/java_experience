package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 5. Получить первый и последний элемент в наборе деревьев
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java, чтобы получить первый и последний элементы в наборе деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _5_GetFirstAndLastElement {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Black");
        treeSet1.add("Pink");
        treeSet1.add("White");
        treeSet1.add("Green");
        System.out.println("treeSet1: " + treeSet1);
        System.out.println("First element: " + treeSet1.first());
        System.out.println("Last element: " + treeSet1.last());
    }
}
