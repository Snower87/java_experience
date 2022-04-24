package ru.begletsov.basic_java.metanit._10_stream_api._2_create_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _2_Create_stream {
    public static void main(String[] args) {
        //Вариант 1 использования потока
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Париж", "Лондон", "Москва");
        cities.stream() //получаем поток
                .filter(str -> str.length() < 6) // применяем фильтрацию по длине строки
                .forEach(System.out::println); // выводим отфильтрованные строки на консоль

        //Вариант 2 использования потока
        Stream<String> citiesStream = cities.stream(); //получаем поток
                citiesStream = citiesStream.filter(str -> str.length() < 6); // применяем фильтрацию по длине строки
                citiesStream.forEach(System.out::println); // выводим отфильтрованные строки на консоль

        // Цикл потока проходит следующие три стадии:
        // 1. Создание потока
        // 2. Применение к потоку ряда промежуточных операций
        // 3. Применение к потоку терминальной операции и получение результата

        //Пример 3. Создание потока через Arrays.stream(T[] array)
        Stream<String> citiesStream3 = Arrays.stream(new String[]{"Париж", "Лондон", "Москва"});
        citiesStream3.forEach(System.out::println);

        //Пример 4. Создание потоков IntStream, DoubleStream, LongStream
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 7, 10});
        intStream.forEach(System.out::println);

        DoubleStream doubleStream = Arrays.stream(new double[]{3.4, 6.7, 9.5, 8.333, 121});
        doubleStream.forEach(System.out::println);

        //Пример 5. Ещё один способ создания потока представляет статический метод of(T..values) класса Stream
        Stream citiesStream5 = Stream.of("Париж", "Лондон", "Москва");
        citiesStream5.forEach(s -> System.out.println(s));

        // можно передать массив
        String[] cities5 = {"Париж", "Лондон", "Москва"};
        Stream citiesStream5_1 = Stream.of(cities5);
        citiesStream5_1.forEach(s -> System.out.println(s));

        IntStream intStream5 = IntStream.of(1, 2, 3, 4, 5, 7, 10);
        intStream5.forEach(i -> System.out.println(i));

        DoubleStream doubleStream5 = DoubleStream.of(3.4, 6.7, 9.5, 8.333, 121);
        doubleStream5.forEach(d -> System.out.println(d));
    }
}
