package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 12. Получить элемент строго больше
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java, чтобы получить элемент в наборе деревьев, который меньше или равен данному элементу.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 09.07.2021
 * @version 1
 */

public class _12_ValueStrictlyMore76 {
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
        System.out.println("treeNum: " + treeNum);
        System.out.println("Strictly greater than 70 : " + treeNum.higher(70));
        System.out.println("Strictly greater than 22 : " + treeNum.higher(22));
    }
}
