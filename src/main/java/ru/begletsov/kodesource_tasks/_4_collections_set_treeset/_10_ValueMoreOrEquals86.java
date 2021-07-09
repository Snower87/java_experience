package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 10. Получить элемент больше или равен заданному
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java, чтобы получить элемент в наборе деревьев, который больше или равен данному элементу.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _10_ValueMoreOrEquals86 {
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
        System.out.println("Greater than or equal to 86 : " + treeNum.ceiling(86));
        System.out.println("Greater than or equal to 30 : " + treeNum.ceiling(30));
    }
}
