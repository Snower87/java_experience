package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;

/**
 * @Задание 20. Увеличить размер списка
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java, чтобы увеличить размер списка массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 26.06.2021
 * @version 1
 */

public class _20_IncreaseListSize {
    public static void main(String[] args) {
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<>(10);
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        color1.add("White");
        System.out.println(color1.size());
        //Increase capacity to 50
        color1.ensureCapacity(50);
        System.out.println(color1.size());
    }
}
