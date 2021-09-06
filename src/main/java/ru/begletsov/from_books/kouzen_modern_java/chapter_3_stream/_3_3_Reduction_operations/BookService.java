package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_3_Reduction_operations;

import java.util.*;

public class BookService {
    public static void main(String[] args) {
        //Пример 3.28 Помещение объектов Book в структуру Map с помощью аккумулятора
        List<BookReduction> books = new LinkedList<>();
        books.add(new BookReduction(1, "Modern Java Recipes"));
        books.add(new BookReduction(2, "Making Java Groovy"));
        books.add(new BookReduction(3, "Gradle Recipes for Android"));

        HashMap<Integer, String> bookMap = books.stream()
                .reduce(new HashMap<Integer, String>(),
                (map, book) -> {
                    map.put(book.getId(), book.getTitle());
                    return map;
                },
                (map1, map2) -> {
                    map1.putAll(map2);
                    return map1;
                });
        bookMap.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
