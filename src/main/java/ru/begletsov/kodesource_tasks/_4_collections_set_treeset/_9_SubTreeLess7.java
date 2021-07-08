package ru.begletsov.kodesource_tasks._4_collections_set_treeset;

import java.util.TreeSet;

/**
 * @Задание 9. Получить ветку дерева меньше 7
 * @Раздел Коллекция TreeSet
 * @Описание Напишите программу на Java, чтобы найти числа меньше 7 в наборе деревьев.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 08.07.2021
 * @version 1
 */

public class _9_SubTreeLess7 {
    public static void main(String[] args) {
        TreeSet<Integer> treeNum = new TreeSet<Integer>();
        TreeSet<Integer> treeHead; // = new TreeSet<Integer>();
        TreeSet<Integer> treeTail; // = new TreeSet<Integer>();
        TreeSet<Integer> treeSub;  // = new TreeSet<Integer>();
        for (int i = 0; i < 11; i++) {
            treeNum.add(i);
        }
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
