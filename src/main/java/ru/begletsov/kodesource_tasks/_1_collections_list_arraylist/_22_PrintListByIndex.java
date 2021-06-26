package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;

/**
 * @Задание 22. Печать всех элементов через индекс
 * @Раздел Коллекция ArrayList
 * @Описание Напишите Java-программу для печати всех элементов ArrayList, используя расположение элементов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 26.06.2021
 * @version 1
 */

public class _22_PrintListByIndex {
    public static void main(String[] args) {
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        color1.add("White");
        //print list with index
        System.out.println("elements color1 list:");
        for (int index = 0; index < color1.size(); index++) {
            System.out.println(index + ": " + color1.get(index));
        }
    }
}
