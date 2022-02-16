package ru.begletsov.basic_java.metanit._3_oop_classes._14_generics;

public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = {"Mike", "Billy", "Bob", "Nadia", "Vlad"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }

    public <T> void print(T[] items) {
        for (T item: items) {
            System.out.println(item);
        }
    }
}
