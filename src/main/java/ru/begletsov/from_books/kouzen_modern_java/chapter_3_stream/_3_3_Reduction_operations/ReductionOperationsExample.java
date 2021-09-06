package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_3_Reduction_operations;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Задание Требуется получить одно значение в результате операций с потоком.
 * @Описание Использовать метод reduce для аккумулирования результатов вычислений.
 * @author Sergei Begletsov
 * @since 06.09.2021
 * @version 1
 */

public class ReductionOperationsExample {
    public static void main(String[] args) {
        //Пример 3.14 Операции редукции для потока IntStream
        System.out.println("Example 3.14: ");
        String[] strings = "this is an array of strings".split(" ");
        long count = Arrays.stream(strings)
                .map(String::length)
                .count();
        System.out.println("Всего существует " + count + " строк");
        System.out.println();

        int totalLength = Arrays.stream(strings)
                .mapToInt(String::length)
                .sum();
        System.out.println("Суммарная длина равна " + totalLength);
        System.out.println();

        OptionalDouble ave = Arrays.stream(strings)
                .mapToInt(String::length)
                .average();
        System.out.println("Средняя длина равна " + ave.getAsDouble());
        System.out.println();

        OptionalInt max = Arrays.stream(strings)
                .mapToInt(String::length)
                .max();
        OptionalInt min = Arrays.stream(strings)
                .mapToInt(String::length)
                .min();
        System.out.println("Максимальная и	минимальная длины равны " + max.getAsInt() + " и	" + min.getAsInt());
        System.out.println();

        //Пример 3.15 Суммирование чисел с помощью reduce
        System.out.println("Example 3.15: ");
        int sum1 = IntStream.rangeClosed(1, 10)
                    .reduce((x, y) -> x + y).orElse(0);
        System.out.println("Сумма чисел [0, 10] равна " + sum1);
        System.out.println();

        //Пример 3.16 Печать значений x и y
        System.out.println("Example 3.16: ");
        int sum2 = IntStream.rangeClosed(1, 10)
        .reduce((x, y) -> {
            System.out.printf("x=%d, y=%d%n", x, y);
            return x + y;
        }).orElse(0);
        System.out.println();
        System.out.println("Сумма чисел [0, 10] равна " + sum2);
        System.out.println();

        //Пример 3.18 Удвоение значений в процессе суммирования (НЕПРАВИЛЬНО)
        System.out.println("Example 3.18: ");
        int doubleSum = IntStream.rangeClosed(1, 10)
                .reduce((x, y) -> x + 2 * y).orElse(0);
        System.out.println("Результат = " + doubleSum);
        System.out.println();

        //Пример 3.19 Удвоение значений в процессе суммирования (ПРАВИЛЬНО)
        System.out.println("Example 3.19: ");
        int doubleSum2 = IntStream.rangeClosed(1, 10)
                .reduce(0, (x, y) -> x + 2 * y);
        System.out.println("Результат = " + doubleSum2);
        System.out.println();

        //Пример 3.21 Выполнение редукции с помощью бинарного оператора
        System.out.println("Example 3.21: ");
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println();

        //Пример 3.22 Нахождение максимума с помощью редукции
        System.out.println("Example 3.22: ");
        Integer max2 = Stream.of(3, 1, 4, 1, 5, 9)
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Максимальное значение равно " + max2);
        System.out.println();

        //Пример 3.23 Конкатенация потока строк с помощью редукции
        System.out.println("Example 3.23: ");
        String s = Stream.of("this", "is", "a", "list")
                .reduce("", String::concat);
        System.out.println(s);
        System.out.println();

        //Пример 3.24 Собирание строк с помощью StringBuilder
        System.out.println("Example 3.24: ");
        String s2 = Stream.of("this", "is", "a", "list")
            .collect(() -> new StringBuilder(),
                    (sb, str) -> sb.append(str),
                    (sb1, sb2) -> sb1.append(sb2))
            .toString();
        System.out.println(s2);
        System.out.println();

        //Пример 3.25 Собирание строк с помощью ссылок на методы
        System.out.println("Example 3.25: ");
        String s3 = Stream.of("this", "is", "a", "list")
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .toString();
        System.out.println(s3);
        System.out.println();

        //Пример 3.26 Соединение строк с помощью класса Collectors
        System.out.println("Example 3.26: ");
        String s4 = Stream.of("this", "is", "a", "list")
                .collect(Collectors.joining());
        System.out.println(s4);
        System.out.println();
    }
}