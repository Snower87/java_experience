package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;

/**
 * @Задание 18. Пустой список или нет
 * @Раздел Коллекция ArrayList
 * @Описание Написать Java-программу для проверки списка массивов пуст или нет.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 25.06.2021
 * @version 1
 */

public class _18_IsEmptyList {
    public static void main(String[] args) {
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<>();
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
