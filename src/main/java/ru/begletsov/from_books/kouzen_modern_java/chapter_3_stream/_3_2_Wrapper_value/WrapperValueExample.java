package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_2_Wrapper_value;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Задание Требуется создать коллекцию из потока значений примитивных типов.
 * @Описание Использовать метод boxedинтерфейса Streamдля обертывания элементов. Мож-но вместо этого отобразить значения, пользуясь подходящим классом-оберт-кой, или воспользоваться вариантом метода collectс тремя аргументами.
 * @author Sergei Begletsov
 * @since 06.09.2021
 * @version 1
 */

public class WrapperValueExample {
    public static void main(String[] args) {
        //Пример 3.8 Преобразование потока строк в список
        System.out.println("Example 3.8: ");
        List<String> strings = Stream.of("this", "is", "a", "list", "of", "strings")
                    .collect(Collectors.toList());
        strings.forEach(System.out::println);
        System.out.println();

        //Пример 3.9 Преобразование потока int в список Integer (НЕ КОМПИЛИРУЕТСЯ)
        System.out.println("Example 3.9: ");
        //IntStream.of(3, 1, 4, 1, 5, 9)
        //        .collect(Collectors.toList()); // не компилируется
        System.out.println();

        //Пример 3.10 Использование метода boxed
        System.out.println("Example 3.10: ");
        List<Integer> ints = IntStream.of(3, 1, 4, 1, 5, 9)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println();

        //Пример 3.11 Использование метода mapToObj
        System.out.println("Example 3.11: ");
        List<Integer> ints2 = IntStream.of(3, 1, 4, 1, 5, 9)
                //.mapToObj(Integer::valueOf)
                .mapToObj(aaa -> Integer.valueOf(aaa))
                .collect(Collectors.toList());
        System.out.println();

        //Пример 3.12 Использование варианта collect с тремя аргументами
        System.out.println("Example 3.12: ");
        List<Integer> ints3 = IntStream.of(3, 1, 4, 1, 5, 9)
                .collect(ArrayList<Integer>::new, ArrayList::add, ArrayList::addAll);
        System.out.println();

        //Пример 3.13 Преобразование IntStream в массив
        System.out.println("Example 3.13: ");
        int[] intArray1 = IntStream.of(3, 1, 4, 1, 5, 9).toArray();
        // или
        //int[] intArray2 = IntStream.of(3, 1, 4, 1, 5, 9).toArray(int[]::new);
        IntStream.of(intArray1).filter(i -> i > 4).forEach(System.out::println);
        System.out.println();
    }
}
