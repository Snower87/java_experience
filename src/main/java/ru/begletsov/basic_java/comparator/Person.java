package ru.begletsov.basic_java.comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName()); //сортировка по алфавиту (по-возрастанию)
        //return name.length() - o.getName().length(); //сортировка по длине слова (по-возрастанию)
    }

    public static void showInfo(List<Person> list) {
        //list.forEach(a -> System.out.println(a.getName()));
        list.stream().map((x) -> x.getName()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        Person andrey = new Person("andrey");
        Person petr = new Person("petr");
        Person vladimir = new Person("vladimir");
        Person sergey = new Person("sergey");
        Person zak = new Person("zak");
        personList.add(zak);
        personList.add(petr);
        personList.add(andrey);
        personList.add(vladimir);
        personList.add(sergey);

        System.out.println("До сортировки:");
        showInfo(personList);
        System.out.println();

        System.out.println("После сортировки:");
        Collections.sort(personList);
        showInfo(personList);
    }
}
