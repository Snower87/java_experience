package ru.begletsov.kodesource_tasks._1_collections_list_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Задание 9. Копирование одного списка в другой
 * @Раздел Коллекция ArrayList
 * @Описание Напишите Java-программу для копирования одного списка массивов в другой.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 23.06.2021
 * @version 1
 */

public class _9_CopyList {
    public static void main(String[] args) {
        List<String> abc = new ArrayList<>();
        abc.add("A");
        abc.add("B");
        abc.add("C");
        System.out.println("List1: " + abc);
        List<String> num = new ArrayList<>();
        num.add("1");
        num.add(String.valueOf(2));
        num.add("3");
        num.add("4");
        num.add("5");
        System.out.println("List2: " + num);
        System.out.println("List2 AFTER copy elements List1:");
        Collections.copy(num, abc);
        System.out.println("List1: " + abc);
        System.out.println("List2: " + num);
    }
}
