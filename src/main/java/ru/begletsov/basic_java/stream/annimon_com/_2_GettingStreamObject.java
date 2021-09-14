package ru.begletsov.basic_java.stream.annimon_com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 2. Получение объекта Stream
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _2_GettingStreamObject {
    public static void main(String[] args) {
        //как создать или получить объект java.util.stream.Stream:
        // - Пустой стрим: Stream.empty()
        // - Стрим из List: list.stream()
        // - Стрим из Map: map.entrySet().stream()
        // - Стрим из массива: Arrays.stream(array)
        // - Стрим из указанных элементов: Stream.of("a", "b", "c")

        //Пример 2.1:
        System.out.println("Example 2.1: ");
        List<String> list = Arrays.stream(args)
                .filter(s -> s.length() <= 2)   //Промежуточный оператор filter отбирает только те строки, длина которых не превышает два
                .collect(Collectors.toList());  //Терминальный оператор collect собирает полученные элементы в новый список.
        System.out.println(list);
        System.out.println();

        //Пример 2.2:
        System.out.println("Example 2.2: ");
        IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300)           //filter — отбирает элементы, значение которых меньше 300,
                .map(x -> x + 11)               //map — прибавляет 11 к каждому числу,
                .limit(3)                       //limit — ограничивает количество элементов до 3.
                .forEach(System.out::print);    //1319643
        System.out.println();
    }
}
