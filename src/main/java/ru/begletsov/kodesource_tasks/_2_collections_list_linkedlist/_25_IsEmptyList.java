package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Задание 25. Пустой список или нет
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java для сравнения двух связанных списков.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 01.07.2021
 * @version 1
 */

public class _25_IsEmptyList {
    public static void main(String[] args) {
        //create list1 and add some elements
        LinkedList<String> color1= new LinkedList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        System.out.println("COLOR1: " + color1);
        //print list is empty?
        System.out.println("Size list: " + color1.size() + ", isEmpty = " + color1.isEmpty());
        //print list is empty?
        System.out.println("AFTER revome all elements:");
        color1.removeAll(color1);
        System.out.println("Size list: " + color1.size() + ", isEmpty = " + color1.isEmpty());
    }
}
