package ru.begletsov.basic_java.metanit._10_stream_api._5_takeWhile_dropWhile_concat_distinct;

import java.util.stream.Stream;

public class _5_takeWhile_dropWhile_concat_distinct {
    public static void main(String[] args) {
        //5. Получение подпотока и объединение потоков

        //5.1 Метод takeWhile()
        //Метод takeWhile() выбирает из потока элементы, пока они соответствуют условию.
        //Если попадается элемент, который не соответствует условию, то метод завершает свою работу. Выбранные элементы возвращаются в виде потока.
        System.out.println("5.1 Метод takeWhile() для упорядоченного массива:");
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        Stream<Integer> streamNumbers = Stream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
                        streamNumbers.takeWhile(n -> n < 0)
                                     .forEach(n -> System.out.println(n));
        System.out.println();

        System.out.println("5.1 Метод takeWhile() для не отсортированного массива:");
        Stream<Integer> streamNumbers_1 = Stream.of(0, 1, 2, 3, 4, 5, -5, -4, -3, -2, -1);
        streamNumbers_1.sorted()
                        .takeWhile(n -> n < 0)
                        .forEach(n -> System.out.println(n));
        System.out.println();

        //5.2 Метод dropWhile()
        //Метод dropWhile() выполняет обратную задачу - он пропускает элементы потока, которые соответствуют условию
        //до тех пор, пока не встретит элемент, который НЕ соответствует условию
        //Дословно: пропускать пока выполняется
        System.out.println("5.2 Метод dropWhile():");
        Stream<Integer> streamNumbers2 = Stream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        streamNumbers2.dropWhile(n -> n < 0)
                      .forEach(n -> System.out.println(n));
        System.out.println();

        //5.3 Метод concat()
        //Статический метод concat() объединяет элементы двух потоков, возвращая объединенный поток
        System.out.println("5.3 Метод concat():");
        Stream<String> name1Stream = Stream.of("Tom", "Hanks", "Billy", "Bob");
        Stream<String> name2Stream = Stream.of("Adriano", "Alice", "Anni");
        Stream.concat(name2Stream, name1Stream).forEach(s -> System.out.println(s));
        System.out.println();

        //5.4 Метод distinct()
        //Метод distinct() возвращает только уникальные элементы в виде потока
        System.out.println("5.4 Метод distinct():");
        Stream.of("Anna", "Tom", "Tom",  "Bill", "Tom", "Tom")
                .distinct()
                .forEach(System.out::println);
        System.out.println();
    }
}
