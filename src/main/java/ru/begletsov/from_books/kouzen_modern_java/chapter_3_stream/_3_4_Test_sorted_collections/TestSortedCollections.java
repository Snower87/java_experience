package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_4_Test_sorted_collections;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Задание Требуется проверить, отсортирован ли поток с помощью редукции
 * @Описание Использовать метод reduce для проверки пар соседних элементов
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 1
 */

public class TestSortedCollections {
    public static void main(String[] args) {
        //Пример 3.29 Суммирование BigDecimal с помощью reduce
        System.out.println("Example 3.29: ");
        BigDecimal total = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
                .limit(10)
                .reduce(BigDecimal.ZERO, (acc, val) -> acc.add(val));
        System.out.println("Сумма равна " + total);
        System.out.println();

        //Пример 3.30 Сортировка строк по длине
        System.out.println("Example 3.30: ");
        List<String> strings = Arrays.asList(
                "this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        sorted.forEach(s -> System.out.print(s + " "));
        System.out.println();

        //Пример 3.31 Проверка правильности сортировки потока строк
        System.out.println("Example 3.31: ");
        //реализовано в тесте testSortedCollection
    }
}
