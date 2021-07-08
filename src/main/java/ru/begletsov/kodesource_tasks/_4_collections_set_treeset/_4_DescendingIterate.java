package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Задание 4. Вывод в обратном порядке (на консоль) элементов набора деревьев
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java для создания представления в обратном порядке элементов, содержащихся в данном наборе деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _4_DescendingIterate {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Black");
        treeSet1.add("Pink");
        treeSet1.add("White");
        treeSet1.add("Green");
        System.out.println("treeSet1: " + treeSet1);
        Iterator descendingIterator = treeSet1.descendingIterator();
        System.out.println("Descending iterate treeSet1:");
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
