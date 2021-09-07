package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_5_Debug_stream;

import java.util.stream.IntStream;

/**
 * @Задание Требуется видеть отдельные элементы потока по мере их обработки.
 * @Описание Вставить в нужное место потока промежуточную операцию peek.
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 1
 */

public class DebugStream {
    //Пример 3.32 Удвоение, фильтрация и суммирование целых чисел
    public static int sumDoublesDivisibleBy3(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .map(n -> n * 2)
                .filter(n -> n % 3 == 0)
                .sum();
    }

    //Пример 3.33 Добавление тождественного отображения для печати
    public static int sumDoublesDivisibleBy3Ver2(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .map(n -> {
                    System.out.println(n);
                    return n;
                })
                .map(n -> n * 2)
                .filter(n -> n % 3 == 0)
                .sum();
    }

    //Пример 3.34 Несколько методов peek
    public static int sumDoublesDivisibleBy3WithPeek(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .peek(n -> System.out.printf("original: %d%n", n))
                .map(n -> n * 2)
                .peek(n -> System.out.printf("doubled : %d%n", n))
                .filter(n -> n % 3 == 0)
                .peek(n -> System.out.printf("filtered: %d%n", n))
                .sum();
    }
}
