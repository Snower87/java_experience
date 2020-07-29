package ru.begletsov.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Class iteratorListCollection перебор коллекции List (4 варианта): через for, Iterator, Stream.
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 29.07.2020
 * @version 1
 */

public class iteratorListCollection {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(20);
        lists.add(19);
        lists.add(18);
        lists.add(22);

        //===============================================
        //   Перебор всех элементов через цикл for
        //              << 1-2 Вариант >>
        //===============================================

        //1 Вариант через цикл for
        System.out.println();
        System.out.println("1 Вариант. Обход всех элементов через цикл for:");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

        //2 Вариант через цикл for
        System.out.println();
        System.out.println("2 Вариант. Обход всех элементов через цикл for:");
        for (Object value: lists) {
           System.out.println(value);
        }

        //===============================================
        //   Перебор всех элементов через итератор
        //              << 3 Вариант >>
        //===============================================

        //3.1 Вариант обхода через Iterator
        System.out.println();
        System.out.println("3.1 Вариант. Обход через Iterator:");
        Iterator iterator = lists.iterator();
        try {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {};

        //3.2 Вариант обхода через Iterator
        System.out.println();
        System.out.println("3.2 Вариант. Обход через Iterator:");
        for (Iterator<Integer> iterator2 = lists.iterator(); iterator2.hasNext();) {
            System.out.println(iterator2.next());
        }

        //===============================================
        //   Перебор всех элементов через Stream
        //              << 4 Вариант >>
        //===============================================
        System.out.println();
        System.out.println("4 Вариант. Обход через Stream:");
        lists.stream()
                //.forEach(System.out::print);
                .forEach(c -> System.out.println(c));
    }
}
