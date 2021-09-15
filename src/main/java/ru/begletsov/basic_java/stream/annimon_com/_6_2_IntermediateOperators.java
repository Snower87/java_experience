package ru.begletsov.basic_java.stream.annimon_com;

import java.util.Comparator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 6.2. Промежуточные операторы
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 15.09.2021
 * @version 2
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
        System.out.println();

        //4. Пример mapMulti(BiConsumer<T, Consumer<R>> mapper)
        //Появился в Java 16. Этот оператор похож на flatMap, но использует императивный подход при работе.
        //Теперь вместе с элементом стрима приходит ещё и Consumer, в который можно передать одно или несколько значений,
        // либо не передавать вовсе.
        System.out.println("4. mapMulti(BiConsumer<T, Consumer<R>> mapper):");
        //Вот как было с flatMap:
        Stream.of(1, 2, 3, 4, 5, 6)
                .flatMap(x -> {
                    if (x % 2 == 0) {
                        return Stream.of(-x, x);
                    }
                    return Stream.empty();
                })
                .forEach(System.out::println); // -2, 2, -4, 4, -6, 6
        System.out.println();
        //А вот так можно переписать с использованием mapMulti:
        /*
        Stream.of(1, 2, 3, 4, 5, 6)
                .mapMulti((x, consumer) -> {
                    if (x % 2 == 0) {
                        consumer.accept(-x);
                        consumer.accept(x);
                    }
                })
                .forEach(System.out::println); // -2, 2, -4, 4, -6, 6
        */
        //Служат для преобразования в примитивный стрим:
        //- mapMultiToDouble(BiConsumer<T, DoubleConsumer> mapper)
        //- mapMultiToInt(BiConsumer<T, IntConsumer> mapper)
        //- mapMultiToLong(BiConsumer<T, LongConsumer> mapper)

        //5. Пример limit(long maxSize)
        //Ограничивает стрим maxSize элементами.
        System.out.println("5. limit(long maxSize):");
        Stream.of(120, 410, 85, 32, 314, 12)
                .limit(4)
                .forEach(System.out::println); // 120, 410, 85, 32
        System.out.println();

        Stream.of(120, 410, 85, 32, 314, 12)
                .limit(2)
                .limit(5)
                .forEach(System.out::println); // 120, 410
        System.out.println();

        Stream.of(19)
                .limit(0)
                .forEach(System.out::println); // Вывода нет
        System.out.println();

        //6. Пример skip(long n)
        //Пропускает n элементов стрима.
        System.out.println("6. skip(long n):");
        Stream.of(5, 10)
                .skip(40)
                .forEach(System.out::println); // Вывода нет
        System.out.println();

        Stream.of(120, 410, 85, 32, 314, 12)
                .skip(2)
                .forEach(System.out::println); // 85, 32, 314, 12
        System.out.println();

        IntStream.range(0, 10)
                .limit(5)
                .skip(3)
                .forEach(System.out::println); // 3, 4
        System.out.println();

        IntStream.range(0, 10)
                .skip(5)
                .limit(3)
                .skip(1)
                .forEach(System.out::println); // 6, 7
        System.out.println();

        //7. Пример sorted(), sorted(Comparator comparator)
        //Сортирует элементы стрима. Причём работает этот оператор очень хитро: если стрим уже помечен как отсортированный,
        // то сортировка проводиться не будет, иначе соберёт все элементы, отсортирует их и вернёт новый стрим, помеченный как отсортированный. См. 9.1
        System.out.println("7. sorted(), sorted(Comparator comparator):");
        IntStream.range(0, 100000000)
                .sorted()
                .limit(3)
                .forEach(System.out::println); // 0, 1, 2
        System.out.println();

        IntStream.concat(
                IntStream.range(0, 100000000),
                    IntStream.of(-1, -2))
                .sorted()
                .limit(3)
                .forEach(System.out::println); // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        System.out.println();

        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted()
                .forEach(System.out::println); // 12, 32, 85, 120, 314, 410
        System.out.println();

        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println); // 410, 314, 120, 85, 32, 12
        System.out.println();

        //8. Пример distinct()
        System.out.println("8. distinct():");
        //Убирает повторяющиеся элементы и возвращаем стрим с уникальными элементами. Как и в случае с sorted, смотрит,
        // состоит ли уже стрим из уникальных элементов и если это не так, отбирает уникальные и помечает стрим как содержащий уникальные элементы.
        Stream.of(2, 1, 8, 1, 3, 2)
                .distinct()
                .forEach(System.out::println); // 2, 1, 8, 3
        System.out.println();

        IntStream.concat(
                IntStream.range(2, 5),
                IntStream.range(0, 4))
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        //9. Пример peek(Consumer action)
        //Выполняет действие над каждым элементом стрима и при этом возвращает стрим с элементами исходного стрима.
        // Служит для того, чтобы передать элемент куда-нибудь, не разрывая при этом цепочку операторов (вы же помните,
        // что forEach — терминальный оператор и после него стрим завершается?), либо для отладки.
        System.out.println("9. peek(Consumer action):");
        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .map(x -> x * x)
                .forEach(x -> System.out.format("after map: %d%n", x));
        System.out.println();

        //10. Пример takeWhile(Predicate predicate)
        //Появился в Java 9. Возвращает элементы до тех пор, пока они удовлетворяют условию, то есть функция-предикат
        // возвращает true. Это как limit, только не с числом, а с условием.
        System.out.println("10. takeWhile(Predicate predicate):");
        Stream.of(1, 2, 3, 4, 2, 5)
                .takeWhile(x -> x < 3)
                .forEach(System.out::println);
        System.out.println();

        IntStream.range(2, 7)
                .takeWhile(x -> x != 5
                )
                .forEach(System.out::println); // 2, 3, 4
        System.out.println();

        //11. Пример dropWhile(Predicate predicate)
        System.out.println("11. dropWhile(Predicate predicate):");
        //Появился в Java 9. Пропускает элементы до тех пор, пока они удовлетворяют условию, затем возвращает оставшуюся
        // часть стрима. Если предикат вернул для первого элемента false, то ни единого элемента не будет пропущено.
        // Оператор подобен skip, только работает по условию.
        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x >= 3)
                .forEach(System.out::println); // 1, 2, 3, 4, 2, 5
        System.out.println();

        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x < 3)
                .forEach(System.out::println); // 3, 4, 2, 5
        System.out.println();

        //12. Пример boxed()
        System.out.println("12. boxed():");
        DoubleStream.of(0.1, Math.PI)
                .boxed()
                .map(Object::getClass)
                .forEach(System.out::println);
        //class java.lang.Double
        //class java.lang.Double
        System.out.println();
    }
}
