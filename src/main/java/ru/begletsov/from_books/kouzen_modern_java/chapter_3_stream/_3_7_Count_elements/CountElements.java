package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_7_Count_elements;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Задание Требуется узнать, сколько элементов в потоке.
 * @Описание Использовать метод Stream.count или Collectors.counting.
 * @author Sergei Begletsov
 * @since 05.09.2021
 * @version 1
 */

public class CountElements {
    public static void main(String[] args) {
        //Пример 3.39 Подсчет элементов в потоке
        long count = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5).count();
        System.out.println("Example 3.39: " + count);
        System.out.printf("В потоке %d элементов%n", count);
        System.out.println();

        //Пример 3.40 Подсчет элементов с помощью метода Collectors.counting
        count = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .collect(Collectors.counting());
        System.out.println("Example 3.40: ");
        System.out.printf("В потоке %d элементов%n", count);
        System.out.println();

        //Пример 3.41 Подсчет строк в группах по длине
        List<String> strings = Arrays.asList("aa", "aa", "aa", "aaa");
        Map<Boolean, Long> numberLengthMap = strings.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.length() % 2 == 0, Collectors.counting()));
        System.out.println("Example 3.41: ");
        numberLengthMap.forEach((k,v) -> System.out.printf("%5s: %d%n", k, v));
    }
}
