package ru.begletsov.collections.crud;

import ru.begletsov.equals_hashcode.Student;

import java.util.*;

/**
 * Class crudAtSet CRUD (Create Read Update Delete) для коллекции Set
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 09.09.2020
 * @version 1
 */

public class crudAtSet {
    public static void showSet(Set set) {
        set.stream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        //1. Входные данные
        Set<String> fruits = new HashSet<>();
        System.out.println("HashSet: хаотичный порядок элементов");
        fruits.add("яблоко");
        fruits.add("яблоко");
        fruits.add("ананас");
        fruits.add("банан");
        showSet(fruits);
        System.out.println("Кол-во уникальных значений: " + fruits.size());
        System.out.println();

        Set<Student> students = new LinkedHashSet<>();
        System.out.println("LinkedHashSet: в порядке добавления");
        students.add(new Student("Петя", 20));
        students.add(new Student("Ваня", 18));
        students.add(new Student("Саня", 17));
        students.add(new Student("Зина", 22));
        students.add(new Student("Надя", 18));
        students.add(new Student("Петя", 20));
        showSet(students);
        System.out.println("Кол-во уникальных значений: " + students.size());
        System.out.println();

        Set<String> country = new TreeSet<>();
        country.add("Англия");
        country.add("США");
        country.add("Франция");
        country.add("Россия");
        country.add("Япония");
        country.add("Болгария");
        country.add("Англия");
        country.add("Англия");
        showSet(country);
        System.out.println("Кол-во уникальных значений: " + country.size());
        System.out.println();
    }
}
