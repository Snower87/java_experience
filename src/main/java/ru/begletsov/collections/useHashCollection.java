package ru.begletsov.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class useHashCollection проверряю как добавляются данные в Hash-коллекциях
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 10.07.2020
 * @version 1
 */

public class useHashCollection {
    public static void main(String[] args) {
        System.out.println("HashSet: хаотичный порядок элементов");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("яблоко");
        hashSet.add("яблоко");
        hashSet.add("ананас");
        hashSet.add("банан");
        System.out.println(hashSet);
        System.out.println();

        System.out.println("LinkedHashSet: в порядке добавления");
        Set<String>  linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("яблоко");
        linkedHashSet.add("яблоко");
        linkedHashSet.add("ананас");
        linkedHashSet.add("банан");
        System.out.println(linkedHashSet);
        System.out.println();

        System.out.println("TreeSet: сортировка по красно-черному дереву");
        Set<String>  treeSet = new TreeSet<>();
        treeSet.add("яблоко");
        treeSet.add("яблоко");
        treeSet.add("ананас");
        treeSet.add("банан");
        System.out.println(treeSet);
        System.out.println();
    }
}
