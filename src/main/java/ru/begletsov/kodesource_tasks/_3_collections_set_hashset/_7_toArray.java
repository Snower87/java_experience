package ru.begletsov.kodesource_tasks._3_collections_set_hashset;

import java.util.HashSet;

/**
 * @Задание 7. Преобразовать набор Set в массив
 * @Раздел Коллекция HashSet
 * @Описание Напишите Java-программу для преобразования хэш-набора в массив.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 07.07.2021
 * @version 1
 */

public class _7_toArray {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("white");
        hashSet.add("black");
        hashSet.add("orange");
        hashSet.add("blue");
        //print hash set
        System.out.println("hashSet: " + hashSet);
        //Вариант 1
        //String[] massList = hashSet.toArray(new String[0]);
        //Вариант 2
        String[] massList = new String[hashSet.size()];
        hashSet.toArray(massList);
        System.out.println("= Array elements: =");
        for (String mass:
                massList) {
            System.out.print(mass + " ");
        }
    }
}
