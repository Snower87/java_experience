package ru.begletsov.basic_java.comparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getName().length(), b.getName().length()); //по-возрастанию длины строки
        //return Integer.compare(b.getName().length(), a.getName().length()); //по-убыванию длины строки
    }
}
