package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 10. Получить элементы больше/меньше заданного
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java, чтобы получить элемент в наборе деревьев, который больше или равен данному элементу.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _10_MoreOrLessValue {
    public static void main(String[] args) {
        TreeSet<Integer> treeNum = new TreeSet<Integer>();
        TreeSet<Integer> treeHead; // = new TreeSet<Integer>();
        TreeSet<Integer> treeTail; // = new TreeSet<Integer>();
        TreeSet<Integer> treeSub;  // = new TreeSet<Integer>();

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
        treeHead = (TreeSet) treeNum.headSet(7);
        treeTail = (TreeSet) treeNum.tailSet(8);
        treeSub = (TreeSet) treeNum.subSet(5, 7);
        System.out.println("treeHead: " + treeHead);
        System.out.println("treeTail: " + treeTail);
        System.out.println("treeSub: " + treeSub);
        treeNum.clear();
        System.out.println("treeHead: " + treeHead);
        System.out.println("treeTail: " + treeTail);
        System.out.println("treeSub: " + treeSub);
    }
}
