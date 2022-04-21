package ru.begletsov.basic_java.stream.javarush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _1_ExamplesStreamAPI {
    public static void main(String[] args) {
        //Пример 1. Создание потока для коллекции List
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();
        stream.filter(str -> str.toString().length() == 3)
                .forEach(x -> System.out.println(x));

        //Пример 2. Пример работы с потоком
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
                 .filter(x -> x > 90)
                 .limit(3)
                 .forEach(System.out::println);

        //Пример 3. Экземпляр стрима нельзя использовать более одного раза
        List<Integer> iList = List.of(1, 2, 3, 4, 5);
        iList.stream()
             .limit(2)
             .forEach(System.out::println);

        iList.stream()
             .filter(x -> x >= 4)
             .forEach(System.out::println);

        //Пример 4. Преобразование строки -> в массив с уникальными символами
        String[] array = {"Java", "Ruuuussssshhhh"};
        Stream<String> stringStream = Arrays.stream(array);
        stringStream.map(s -> s.split(""))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .forEach(System.out::println);

        //Пример 5. Использование ФИ
        Predicate<Integer> predicate = num -> num > 3;
        Stream.of(8, 9, 1, 2, 4, 10)
                 .sorted()
                 .filter(predicate)
                 .forEach(System.out::println);
    }
}
