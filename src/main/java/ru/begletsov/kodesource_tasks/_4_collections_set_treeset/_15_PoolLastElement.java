package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 15. Получить и удалить последний элемент
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java для извлечения и удаления последнего элемента набора деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 09.07.2021
 * @version 1
 */

public class _15_PoolLastElement {
    public static void main(String[] args) {
        TreeSet<Integer> treeNum = new TreeSet<Integer>();
        treeNum.add(10);
        treeNum.add(22);
        treeNum.add(36);
        treeNum.add(25);
        treeNum.add(16);
        treeNum.add(70);
        treeNum.add(82);
        treeNum.add(89);
        treeNum.add(14);
        System.out.println("Original treeNum: " + treeNum);
        System.out.println("Poll last element: " + treeNum.pollLast());
        System.out.println("After pool treeNum: " + treeNum);
    }
}
