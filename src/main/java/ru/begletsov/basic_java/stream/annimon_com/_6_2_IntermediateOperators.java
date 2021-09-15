package ru.begletsov.basic_java.stream.annimon_com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 6.2. Промежуточные операторы
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 15.09.2021
 * @version 1
 */

public class _6_2_IntermediateOperators {
    public static void main(String[] args) {
        //6.2. Промежуточные операторы
        //1. Пример filter(Predicate predicate)
        //Фильтрует стрим, принимая только те элементы, которые удовлетворяют заданному условию.
        System.out.println("1. filter(Predicate predicate):");
        Stream.of(1, 2, 3)
                .filter(x -> x == 10)
                .forEach(System.out::print); // Вывода нет, так как после фильтрации стрим станет пустым
        System.out.println();

        Stream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x > 100)
                .forEach(System.out::println); // 120, 410, 314
        System.out.println();

        IntStream.range(2, 9)
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println); // 3, 6
        System.out.println();

        //2. Пример map(Function mapper)
        //Применяет функцию к каждому элементу и затем возвращает стрим, в котором элементами будут результаты функции.
        // map можно применять для изменения типа элементов.
        //- Stream.mapToDouble(ToDoubleFunction mapper)
        //- Stream.mapToInt(ToIntFunction mapper)
        //- Stream.mapToLong(ToLongFunction mapper)
        //- IntStream.mapToObj(IntFunction mapper)
        //- IntStream.mapToLong(IntToLongFunction mapper)
        //- IntStream.mapToDouble(IntToDoubleFunction mapper)
        //Специальные операторы для преобразования объектного стрима в примитивный, примитивного в объектный,
        // либо примитивного стрима одного типа в примитивный стрим другого.
        System.out.println("2. map(Function mapper):");
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::println); // 13, 14, 15
        System.out.println();

        Stream.of(120, 410, 85, 32, 314, 12)
                .map(x -> x + 11)
                .forEach(System.out::println); // 131, 421, 96, 43, 325, 23
        System.out.println();

        Stream.of("10", "11", "32")
                .map(x -> Integer.parseInt(x, 16))
                .forEach(System.out::println); //16, 17, 50
        System.out.println();

        //3. Пример flatMap(Function<T, Stream<R>> mapper)
        //Один из самых интересных операторов. Работает как map, но с одним отличием — можно преобразовать
        // один элемент в ноль, один или множество других.
        //- flatMapToDouble(Function mapper)
        //- flatMapToInt(Function mapper)
        //- flatMapToLong(Function mapper)
        //Как и в случае с map, служат для преобразования в примитивный стрим.
        //Для того, чтобы один элемент преобразовать в ноль элементов, нужно вернуть null, либо пустой стрим.
        // Чтобы преобразовать в один элемент, нужно вернуть стрим из одного элемента, например, через Stream.of(x).
        // Для возвращения нескольких элементов, можно любыми способами создать стрим с этими элементами.
        System.out.println("3. flatMap(Function<T, Stream<R>> mapper):");
        Stream.of(2, 3, 0, 1, 3)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::println); // 0, 1, 0, 1, 2, 0, 0, 1, 2
        System.out.println();

        Stream.of(1, 2, 3, 4, 5, 6)
                .flatMap(x -> {
                    switch (x % 3) {
                        case 0:
                            return Stream.of(x, x*x, x*x*2);
                        case 1:
                            return Stream.of(x);
                        case 2:
                        default:
                            return Stream.empty();
                    }
                })
                .forEach(System.out::println); // 1, 3, 9, 18, 4, 6, 36, 72
    }
}
