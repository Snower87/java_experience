package ru.begletsov.collections;

import java.util.*;

/**
 * Class collectionMap проверка как данных добавляются в коллекцию Map
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 23.07.2020
 * @version 1
 */

public class collectionMap {
    public static void main(String[] args) {
        //Первая реализация HashMap
        System.out.println("HashMap: произвольный порядок");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("яблоко",1);
        hashMap.put("яблоко",2);
        hashMap.put("ананас",3);
        hashMap.put("банан",4);
        System.out.println(hashMap);
        System.out.println();

        //Вторая реализация LinkedHashMap
        System.out.println("LinkedHashMap: в порядке добавления");
        Map<String, Integer> linkedHashMap  = new LinkedHashMap<>();
        linkedHashMap.put("яблоко",1);
        linkedHashMap.put("яблоко",2);
        linkedHashMap.put("ананас",3);
        linkedHashMap.put("банан",4);
        System.out.println(linkedHashMap);
        System.out.println();

        //Третья реализация TreeMap
        System.out.println("TreeMap: красно-черное дерево, сортировка по алфавиту");
        Map<String, Integer> treeMap  = new TreeMap<>();
        treeMap.put("яблоко",1);
        treeMap.put("яблоко",2);
        treeMap.put("ананас",3);
        treeMap.put("банан",4);
        System.out.println(treeMap);
        System.out.println();
    }
}
