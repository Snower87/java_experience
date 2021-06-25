package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;

/**
 * @Задание 15. Объединение двух списков
 * @Раздел Коллекция ArrayList
 * @Описание Напишите Java-программу для объединения двух списков массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 25.06.2021
 * @version 1
 */

public class _15_JoinTwoList {
    public static void main(String[] args) {
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<String>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        System.out.println("COLOR1: " + color1);
        //create list1 and add some elements
        ArrayList<String> color2= new ArrayList<String>();
        color2.add("Yellow");
        color2.add("White");
        System.out.println("COLOR2: " + color2);
        //Join 2 List
        color1.addAll(color2);
        System.out.println("= COLOR1 after Join = ");
        System.out.println("COLOR1: " + color1);
    }
}
