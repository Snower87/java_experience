package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_9_FindFirst_and_Any;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Задание Требуется найти в  потоке первый элемент, удовлетворяющий заданному условию.
 * @Описание Воспользоваться методом findFirst или findAny, предварительно применив фильтр.
 * @author Sergei Begletsov
 * @since 09.09.2021
 * @version 1
 */

public class FindFirstAndAny {
    public Integer delay(Integer n) {
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException ignored) {
        }
        return n;
    }

    public void example_349() {
        //Пример 3.49 Применение findAny к параллельному потоку со случайной задержкой
        System.out.println("Example 3.49: ");
        Optional<Integer> any = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .unordered()
                .parallel()
                .map(this::delay)
                .findAny();
        System.out.println("Any: " + any);
        System.out.println();
    }

    public void example_350() {
        //Пример 3.50 Применение findAny к последовательному и к параллельному потокам
        System.out.println("Example 3.50: ");
        Optional<Integer> any = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .unordered()
                .map(this::delay)
                .findAny();
        System.out.println("Sequential Any: " + any);
        any = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .unordered()
                .parallel()
                .map(this::delay)
                .findAny();
        System.out.println("Parallel Any: " + any);
        System.out.println();
    }

    public static void main(String[] args) {
        //Пример 3.46 Нахождение первого четного числа
        System.out.println("Example 3.46: ");
        Optional<Integer> firstEven = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .filter(n -> n % 2 == 0).findFirst();
        System.out.println(firstEven);
        System.out.println(firstEven.get());
        System.out.println();

        //Пример 3.47 Применение findFirst к пустому потоку
        System.out.println("Example 3.47: ");
        Optional<Integer> firstEvenGT10	= Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .filter(n -> n > 10)
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(firstEvenGT10);
        System.out.println();

        //Пример 3.48 Использование firstEven с параллельным потоком
        System.out.println("Example 3.48: ");
        firstEven = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
        .parallel()
        .filter(n -> n % 2 == 0)
        .findFirst();
        System.out.println(firstEven);
        System.out.println();

        //Пример 3.48_1 Множества и порядок следования
        System.out.println("Example 3.48_1: ");
        List<String> wordList = Arrays.asList(
                "this", "is", "a", "stream", "of", "strings");
        Set<String> words = new HashSet<>(wordList);
        Set<String> words2 = new HashSet<>(words);
        // Теперь добавим и удалим столько элементов, чтобы вызвать повторное хэширование
        IntStream.rangeClosed(0, 50).forEachOrdered(i ->
                words2.add(String.valueOf(i)));
        words2.retainAll(wordList);
        // Множества равны, но порядок элементов различен
        System.out.println(words.equals(words2));
        System.out.println("До  : " + words);
        System.out.println("После: " + words2);
        System.out.println();

        //Пример 3.49 Применение findAny к параллельному потоку со случайной задержкой
        FindFirstAndAny findFirstAndAny = new FindFirstAndAny();
        findFirstAndAny.example_349();

        //Пример 3.50 Применение findAny к последовательному и к параллельному потокам
        findFirstAndAny.example_350();
    }
}
