package ru.begletsov.basic_java.stream.annimon_com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 4. Параллельные стримы
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _4_ParallelStream {
    public static void main(String[] args) {
        //Стримы бывают последовательными (sequential) и параллельными (parallel). Последовательные выполняются
        //только в текущем потоке, а вот параллельные используют общий пул ForkJoinPool.commonPool().
        //При этом элементы разбиваются (если это возможно) на несколько групп и обрабатываются в каждом потоке отдельно.
        //Затем на нужном этапе группы объединяются в одну для предоставления конечного результата.

        //Пример 4.1:
        System.out.println("Example 4.1: ");
        //Чтобы получить параллельный стрим, нужно либо вызвать метод parallelStream() вместо stream(),
        //либо превратить обычный стрим в параллельный, вызвав промежуточный оператор parallel.
        List<Integer> list = List.of(2, 3, 4, 5, 1);
        List<Integer> listParallel1 = list.parallelStream()
                .filter(x -> x >= 3)
                .map(x -> x * 2)
                .collect(Collectors.toList());
        listParallel1.stream().forEach(System.out::println);
        System.out.println();

        Integer sumParallel2 = IntStream.range(0, 10)
                .parallel()
                .map(x -> x * 1)
                .sum();
        System.out.println("sumParallel2 = " + sumParallel2);
        System.out.println();

        //Пример 4.2:
        System.out.println("Example 4.2: ");
        //Вот так делать нельзя:
        final List<Integer> ints = new ArrayList<>();
        IntStream.range(0, 100)
                .parallel()
                .forEach(i -> ints.add(i));
        System.out.println(ints.size());
        //Это код Шрёдингера. Он может нормально выполниться и показать 100, может выполниться и показать 86,
        //а может и упасть с ошибкой Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 332 at java.util.ArrayList.add(ArrayList.java:459).
    }
}
