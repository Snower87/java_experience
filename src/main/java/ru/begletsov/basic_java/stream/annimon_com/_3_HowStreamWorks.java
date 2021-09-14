package ru.begletsov.basic_java.stream.annimon_com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 3. Как работает стрим
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _3_HowStreamWorks {
    public static void main(String[] args) {
        //У стримов есть некоторые особенности. Во-первых, обработка не начнётся до тех пор, пока не будет вызван
        //терминальный оператор. list.stream().filter(x -> x > 100); не возьмёт ни единого элемента из списка.
        //Во-вторых, стрим после обработки нельзя переиспользовать.

        //Пример 3.1:
        System.out.println("Example 3.1: ");
        List<String> list = List.of("1", "2", "3");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);            //Код на второй строке выполнится, а вот на третьей выбросит исключение
        //stream.filter(s -> s.contains("Stream API"));
        //stream.forEach(System.out::println);
        System.out.println();
    }
}
