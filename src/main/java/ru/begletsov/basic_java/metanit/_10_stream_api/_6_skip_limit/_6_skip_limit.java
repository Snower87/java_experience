package ru.begletsov.basic_java.metanit._10_stream_api._6_skip_limit;

import java.util.stream.Stream;

public class _6_skip_limit {
    public static void main(String[] args) {
        //6. Методы skip и limit

        //6.1 Метод skip(long n)
        //Метод skip(long n) используется для пропуска n элементов. Этот метод возвращает новый поток, в котором пропущены первые n элементов
        System.out.println("6.1 Метод skip(long n):");
        Stream<String> phoneStream = Stream.of("iPhone 6 S", "Lumia 950", "Samsung Galaxy S 6", "LG G 4", "Nexus 7");
        phoneStream.skip(2)
                   .limit(2)
                   .forEach(s -> System.out.println(s));
        System.out.println();

        //6.2 Метод limit(long n) применяется для выборки первых n элементов потоков. Этот метод также возвращает модифицированный поток, в котором не более n элементов        //Метод limit(long n) применяется для выборки первых n элементов потоков. Этот метод также возвращает модифицированный поток, в котором не более n элементов.
    }
}
