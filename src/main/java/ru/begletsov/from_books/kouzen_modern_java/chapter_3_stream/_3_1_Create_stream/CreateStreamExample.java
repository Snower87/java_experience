package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_1_Create_stream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @Задание Требуется создать поток из источника данных.
 * @Описание Использовать статические фабричные методы интерфейса Streamили метод stream интерфейса Iterableили класса Arrays.
 * @author Sergei Begletsov
 * @since 06.09.2021
 * @version 1
 */

public class CreateStreamExample {
    public static void main(String[] args) {
        //Пример 3.2 Создание потока методом Stream.of
        System.out.println("Example 3.2: ");
        String names = Stream.of("Gomez", "Morticia", "Wednesday", "Pugsley")
                .collect(Collectors.joining(", "));
        System.out.println(names);
        System.out.println();

        //Пример 3.3 Создание потока методом Arrays.stream
        System.out.println("Example 3.3: ");
        String[] munsters = { "Herman", "Lily", "Eddie", "Marilyn", "Grandpa" };
        names = Arrays.stream(munsters)
                .collect(Collectors.joining(", "));
        System.out.println(names);
        System.out.println();

        //Пример 3.4 Создание потока методом Stream.iterate
        System.out.println("Example 3.4: ");
        List<BigDecimal> nums =
                Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE) )
                        .limit(10)
                        .collect(Collectors.toList());
        System.out.println(nums); // печатается [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Stream.iterate(LocalDate.now(), ld -> ld.plusDays(1L))
                .limit(10)
                .forEach(System.out::println); // печатается 10 дней, начиная с сегодняшнего
        System.out.println();

        //Пример 3.5 Создание потока случайных чисел типа double
        System.out.println("Example 3.5: ");
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
        System.out.println();

        //Пример 3.6 Создание потока из коллекции
        System.out.println("Example 3.6: ");
        List<String> bradyBunch = Arrays.asList("Greg", "Marcia", "Peter", "Jan",
                "Bobby", "Cindy");
        names = bradyBunch.stream()
                .collect(Collectors.joining(", "));
        System.out.println(names);
        System.out.println();

        //Пример 3.7 Методы range и rangeClosed
        System.out.println("Example 3.7: ");
        List<Integer> ints = IntStream.range(10, 15)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(ints); // печатается [10, 11, 12, 13, 14]

        List<Long> longs = LongStream.rangeClosed(10, 15)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(longs); // печатается [10, 11, 12, 13, 14, 15]
        System.out.println();

    }
}
