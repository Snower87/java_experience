package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 1. Добавление элементов в список ArrayList
 * @Раздел Коллекция ArrayList
 * @Описание Напишите программу на Java, чтобы создать новый список массивов, добавить несколько цветов (строку)
 * и распечатать коллекцию.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 21.06.2021
 * @version 1
 */

public class AddElements_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("red");
        list.add("orange");
        list.add("white");
        list.add("red");
        list.add("red");
        list.add("blue");
        list.add("black");
        System.out.println(list);
    }
}
