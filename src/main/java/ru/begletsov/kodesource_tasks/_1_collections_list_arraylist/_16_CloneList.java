package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;

/**
 * @Задание 16. Клонирование списка
 * @Раздел Коллекция ArrayList
 * @Описание Напишите Java-программу для клонирования списка массивов в другой список массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 25.06.2021
 * @version 1
 */

public class _16_CloneList {
    public static void main(String[] args) {
        //create list1 and add some elements
        ArrayList<String> color1= new ArrayList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        System.out.println("COLOR1: " + color1);
        //clone list
        ArrayList<String> cloneList = (ArrayList<String>) color1.clone();
        System.out.println("CLONE COLOR1: " + cloneList);
    }
}
