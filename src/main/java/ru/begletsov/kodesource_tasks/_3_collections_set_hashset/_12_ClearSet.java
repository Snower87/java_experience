package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;

/**
 * @Задание 12. Очистка набора
 * @Раздел Коллекция HashSet
 * @Описание Напишите программу на Java, чтобы удалить все элементы из хеш-набора.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 07.07.2021
 * @version 1
 */

public class _12_ClearSet {
    public static void main(String[] args) {
        //create a empty hashSet1 and add some elements
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Black");
        hashSet1.add("White");
        hashSet1.add("Pink");
        //print hash set
        System.out.println("hashSet1: " + hashSet1);
        //clear set and print
        hashSet1.clear();
        System.out.println("set size: " + hashSet1.size() + " elements, " +"hashSet1: " + hashSet1);
    }
}
