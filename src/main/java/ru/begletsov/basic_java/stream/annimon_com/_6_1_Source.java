package ru.begletsov.basic_java.stream.annimon_com;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 6.1. Источники Stream API
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 15.09.2021
 * @version 1
 */

public class _6_1_Source {
    public static void main(String[] args) {
        //6.1. Источники Stream API
        //1. Пример empty()
        System.out.println("1. empty():");
        Stream.empty().forEach(System.out::println);
        System.out.println();

        //2. Пример of(T value), of(T... values)
        System.out.println("2. of(T value), of(T... values):");
        Arrays.asList(1, 2, 3).stream()
                .forEach(System.out::println);
        //так проще
        Stream.of(11, 12, 13)
                .forEach(System.out::println);
        System.out.println();

        //3. Пример ofNullable(T t)
        //Появился в Java 9. Возвращает пустой стрим, если в качестве аргумента передан null,
        //в противном случае, возвращает стрим из одного элемента.
        System.out.println("3. ofNullable(T t):");
        String str = Math.random() > 0.5 ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);
        System.out.println();

        //4. Пример generate(Supplier s)
        System.out.println("4. generate(Supplier s):");
        Stream.generate(() -> 6)
                .limit(6)
                .forEach(System.out::println); //6 6 6 6 6 6
        //Поскольку стрим бесконечный, нужно его ограничивать или осторожно использовать, дабы не попасть в бесконечный цикл.
        System.out.println();

        //5. Пример iterate(T seed, UnaryOperator f)
        //Возвращает бесконечный стрим с элементами, которые образуются в результате последовательного применения
        // функции f к итерируемому значению. Первым элементом будет seed, затем f(seed), затем f(f(seed)) и так далее.
        System.out.println("5. iterate(T seed, UnaryOperator f):");
        Stream.iterate(2, x -> x + 6)
                .limit(6)
                .forEach(System.out::println); // 2, 8, 14, 20, 26, 32
        System.out.println();

        Stream.iterate(1, x -> x * 2)
                .limit(6)
                .forEach(System.out::println); // 1, 2, 4, 8, 16, 32
        System.out.println();

        //6. Пример iterate(T seed, Predicate hasNext, UnaryOperator f)
        //Появился в Java 9. Всё то же самое, только добавляется ещё один аргумент hasNext: если он возвращает false, то стрим завершается.
        //Это очень похоже на цикл for: for (i = seed; hasNext(i); i = f(i)) {...;}
        System.out.println("6. iterate(T seed, Predicate hasNext, UnaryOperator f):");
        Stream.iterate(2, x -> x < 25, x -> x + 6)
                .forEach(System.out::println); // 2, 8, 14, 20
        System.out.println();

        Stream.iterate(4, x -> x < 100, x -> x * 4)
                .forEach(System.out::println); // 4, 16, 64
        System.out.println();

        //7. Пример concat(Stream a, Stream b)
        //Объединяет два стрима так, что вначале идут элементы стрима A, а по его окончанию последуют элементы стрима B
        System.out.println("7. concat(Stream a, Stream b):");
        Stream.concat(
                Stream.of(1, 2, 3),
                Stream.of(4, 5, 6))
                .forEach(System.out::println); // 1, 2, 3, 4, 5, 6
        System.out.println();

        Stream.concat(
                Stream.of(true),
                Stream.of(4, 16))
                .forEach(System.out::println);

        //8. Пример builder()
        //Создаёт мутабельный объект для добавления элементов в стрим без использования какого-либо контейнера для этого.
        System.out.println("8. builder():");
        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
                .add(0)
                .add(1);
        for (int i = 2; i <= 8; i += 2) {
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(10)
                .build()
                .forEach(System.out::println); // 0, 1, 2, 4, 6, 8, 9, 10

        //9. Пример IntStream.range(int startInclusive, int endExclusive)
        //          LongStream.range(long startInclusive, long endExclusive)
        //Создаёт стрим из числового промежутка [start..end), то есть от start (включительно) по end.
        System.out.println("9. IntStream.range(), LongStream.range():");
        IntStream.range(0, 10)
                .forEach(System.out::println); // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        System.out.println();

        LongStream.range(-10L, -5L)
                .forEach(System.out::println); // -10, -9, -8, -7, -6

        //10. Пример IntStream.rangeClosed(int startInclusive, int endInclusive)
        //           LongStream.rangeClosed(long startInclusive, long endInclusive)
        //Создаёт стрим из числового промежутка [start..end], то есть от start (включительно) по end (включительно).
        System.out.println("10. IntStream.rangeClosed(), LongStream.rangeClosed():");
        IntStream.rangeClosed(0, 5)
                .forEach(System.out::println); // 0, 1, 2, 3, 4, 5
        System.out.println();

        LongStream.range(-8L, -5L)
                .forEach(System.out::println); // -8, -7, -6, -5
        System.out.println();
    }
}
