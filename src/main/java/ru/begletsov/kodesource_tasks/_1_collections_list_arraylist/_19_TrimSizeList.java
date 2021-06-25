package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;

/**
 * @Задание 19. Урезать до размеров списка
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java, чтобы урезать емкость списка массивов текущим размером списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 25.06.2021
 * @version 1
 */

public class _19_TrimSizeList {
    public static void main(String[] args) {
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<>(10);
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        color1.add("White");
        System.out.println("COLOR1: " + color1);
        //print list after trim
        color1.trimToSize();
        System.out.println("COLOR1: " + color1);
    }
}
