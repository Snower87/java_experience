package ru.begletsov.basic_java.stream.annimon_com;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 6.3. Терминальные операторы
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 16.09.2021
 * @version 2
 */

public class _6_3_TerminalOperators {
    public static void main(String[] args) {
        //6.3. Терминальные операторы
        //1. Пример void forEach(Consumer action)
        //Выполняет указанное действие для каждого элемента стрима.
        System.out.println("1. void forEach(Consumer action):");
        Stream.of(120, 410, 85, 32, 314, 12)
                .forEach(x -> System.out.format("%s, ", x)); // 120, 410, 85, 32, 314, 12
        System.out.println();
        System.out.println();

        //2. Пример void forEachOrdered(Consumer action)
        //Тоже выполняет указанное действие для каждого элемента стрима, но перед этим добивается правильного порядка вхождения элементов.
        //Используется для параллельных стримов, когда нужно получить правильную последовательность элементов.
        System.out.println("2. void forEachOrdered(Consumer action):");
        IntStream.range(0, 100000)
                .parallel()
                .filter(x -> x % 10000 == 0)
                .map(x -> x / 10000)
                .forEach(System.out::println); // 5, 6, 7, 3, 4, 8, 0, 9, 1, 2
        System.out.println();

        IntStream.range(0, 100000)
                .parallel()
                .filter(x -> x % 10000 == 0)
                .map(x -> x / 10000)
                .forEachOrdered(System.out::println); // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        System.out.println();

        //3. Пример long count()
        //Возвращает количество элементов стрима.
        System.out.println("3. long count():");
        long count = IntStream.range(0, 10)
                .flatMap(x -> IntStream.range(0, x))
                .count();
        System.out.println(count); // 45

        System.out.println(
                IntStream.rangeClosed(-3, 6)
                         .count()); // 10

        System.out.println(
                Stream.of(0, 2, 9, 13, 5, 11)
                        .map(x -> x * 2)
                        .filter(x -> x % 2 == 1)
                        .count()); // 0
        System.out.println();

        //4. Пример R collect(Collector collector)
        //Один из самых мощных операторов Stream API. С его помощью можно собрать все элементы в список, множество
        // или другую коллекцию, сгруппировать элементы по какому-нибудь критерию, объединить всё в строку и т.д..
        //В классе java.util.stream.Collectors очень много методов на все случаи жизни, мы рассмотрим их позже.
        // При желании можно написать свой коллектор, реализовав интерфейс Collector.
        System.out.println("4. R collect(Collector collector):");
        List<Integer> list = Stream.of(1, 2, 3)
                .collect(Collectors.toList()); // list: [1, 2, 3]
        System.out.println("list: " + list);

        String s = Stream.of(1, 2, 3)
                .map(String::valueOf)
                .collect(Collectors.joining("-", "<", ">")); // s: "<1-2-3>"
        System.out.println("s: " + s);
        System.out.println();

        //5. Пример R collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner)
        //То же, что и collect(collector), только параметры разбиты для удобства. Если нужно быстро сделать какую-то операцию,
        // нет нужды реализовывать интерфейс Collector, достаточно передать три лямбда-выражения.
        //supplier должен поставлять новые объекты (контейнеры), например new ArrayList(), accumulator добавляет элемент
        // в контейнер, combiner необходим для параллельных стримов и объединяет части стрима воедино.
        System.out.println("5. R collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner):");
        List<String> list5 = Stream.of("a", "b", "c", "d")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll); // list: ["a", "b", "c", "d"]
        System.out.println("list5: " + list5);
        System.out.println();

        //6. Пример Object[] toArray()
        //Возвращает нетипизированный массив с элементами стрима.
        // A[] toArray(IntFunction<A[]> generator)
        //Аналогично, только возвращает типизированный массив.
        System.out.println("6. Object[] toArray():");
        String[] elements6 = Stream.of("a", "b", "c", "d")
                .toArray(String[]::new); // elements: ["a", "b", "c", "d"]
        System.out.println();

        //7. Пример List<T> toList()
        //Наконец-то добавлен в Java 16. Возвращает список, подобно collect(Collectors.toList()). Отличие в том,
        // что теперь возвращаемый список гарантированно нельзя будет модифицировать. Любое добавление или удаление
        // элементов в полученный список будет сопровождаться исключением UnsupportedOperationException.
        System.out.println("7. List<T> toList():");
        List<String> elements7 = Stream.of("a", "b", "c", "d")
                .map(String::toUpperCase)
                //.toList(); // elements: ["A", "B", "C", "D"] //только с java16
                .collect(Collectors.toList());
        System.out.println();

        //8. Пример void T reduce(T identity, BinaryOperator accumulator)
        //               U reduce(U identity, BiFunction accumulator, BinaryOperator combiner)
        //Ещё один полезный оператор. Позволяет преобразовать все элементы стрима в один объект. Например, посчитать
        // сумму всех элементов, либо найти минимальный элемент.
        //Сперва берётся объект identity и первый элемент стрима, применяется функция accumulator и identity становится
        // её результатом. Затем всё продолжается для остальных элементов.
        System.out.println("8. T reduce(), U reduce():");
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println("sum: " + sum);
        System.out.println();

        //9. Пример Optional reduce(BinaryOperator accumulator)
        //Этот метод отличается тем, что у него нет начального объекта identity. В качестве него служит первый элемент
        // стрима. Поскольку стрим может быть пустой и тогда identity объект не присвоится, то результатом функции
        // служит Optional, позволяющий обработать и эту ситуацию, вернув Optional.empty().
        System.out.println("9. Optional reduce(BinaryOperator accumulator):");
        Optional<Integer> result = Stream.<Integer>empty()
                .reduce((acc, x) -> acc + x);
        System.out.println("result.isPresent(): " + result.isPresent()); // false

        Optional<Integer> sum9 = Stream.of(1, 2, 3, 4, 5)
                .reduce((acc, x) -> acc + x);
        System.out.println("sum9.get(): " + sum9.get()); // 15

        int sum9_1 = IntStream.of(2, 4, 6, 8)
                .reduce(5 , (acc, x) -> acc + x); // sum: 25
        System.out.println("sum9_1: " + sum9_1);

        int product = IntStream.range(0, 10)
                .filter(x -> x++ % 4 == 0)
                .reduce((acc, x) -> acc * x)
                .getAsInt(); // product: 0
        System.out.println("product: " + product);
        System.out.println();

        //10. Пример Optional min(Comparator comparator)
        //           Optional max(Comparator comparator)
        //Поиск минимального/максимального элемента, основываясь на переданном компараторе. Внутри вызывается reduce:
        //reduce((a, b) -> comparator.compare(a, b) <= 0 ? a : b));
        //reduce((a, b) -> comparator.compare(a, b) >= 0 ? a : b));
        System.out.println("10. Optional min, max(Comparator comparator):");
        int min = Stream.of(20, 11, 45, 78, 13)
                .min(Integer::compare).get(); // min: 11
        System.out.println("min: " + min);

        int max = Stream.of(20, 11, 45, 78, 13)
                .max(Integer::compare).get(); // max: 78
        System.out.println("max: " + max);
        System.out.println();

        //11. Пример Optional findAny()
        //Возвращает первый попавшийся элемент стрима. В параллельных стримах это может быть действительно любой элемент,
        // который лежал в разбитой части последовательности.
        //12. Пример Optional findFirst()
        // Гарантированно возвращает первый элемент стрима, даже если стрим параллельный.
        //Если нужен любой элемент, то для параллельных стримов быстрее будет работать findAny().
        System.out.println("11, 12. Optional findAny(), Optional findFirst():");
        int anySeq = IntStream.range(4, 65536)
                .findAny()
                .getAsInt(); // anySeq: 4
        System.out.println("anySeq: " + anySeq);

        int firstSeq = IntStream.range(4, 65536)
                .findFirst()
                .getAsInt(); // firstSeq: 4
        System.out.println("firstSeq: " + firstSeq);

        int anyParallel = IntStream.range(4, 65536)
                .parallel()
                .findAny()
                .getAsInt(); // anyParallel: 32770
        System.out.println("anyParallel: " + anyParallel);

        int firstParallel = IntStream.range(4, 65536)
                .parallel()
                .findFirst()
                .getAsInt(); // firstParallel: 4
        System.out.println("firstParallel: " + firstParallel);
        System.out.println();

        //13. Пример boolean allMatch(Predicate predicate)
        //Возвращает true, если все элементы стрима удовлетворяют условию predicate. Если встречается какой-либо элемент,
        // для которого результат вызова функции-предиката будет false, то оператор перестаёт просматривать элементы и возвращает false.
        System.out.println("13. boolean allMatch(Predicate predicate):");
        boolean result13 = Stream.of(1, 2, 3, 4, 5)
                .allMatch(x -> x <= 7);     // result13: true
        System.out.println("result13: " + result13);

        boolean result13_1 = Stream.of(1, 2, 3, 4, 5)
                .allMatch(x -> x < 3);      // result13_1: false
        System.out.println("result13_1: " + result13_1);

        boolean result13_2 = Stream.of(120, 410, 85, 32, 314, 12)
                .allMatch(x -> x % 2 == 0); // result13_2: false
        System.out.println("result13_2: " + result13_2);
        System.out.println();

        //14. Пример boolean anyMatch(Predicate predicate)
        //Возвращает true, если хотя бы один элемент стрима удовлетворяет условию predicate. Если такой элемент
        // встретился, нет смысла продолжать перебор элементов, поэтому сразу возвращается результат.
        System.out.println("14. boolean anyMatch(Predicate predicate):");
        boolean result14_1 = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x -> x == 3);     // result: true
        System.out.println("result14_1: " + result14_1);

        boolean result14_2 = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x -> x == 8);     // result: false
        System.out.println("result14_2: " + result14_2);

        boolean result14_3 = Stream.of(120, 410, 85, 32, 314, 12)
                .anyMatch(x -> x % 22 == 0);  // result: false
        System.out.println("result14_3: " + result14_3);
        System.out.println();

        //15. Пример boolean noneMatch(Predicate predicate)
        //Возвращает true, если, пройдя все элементы стрима, ни один не удовлетворил условию predicate.
        // Если встречается какой-либо элемент, для которого результат вызова функции-предиката будет true, то оператор
        //перестаёт перебирать элементы и возвращает false.
        System.out.println("15. boolean noneMatch(Predicate predicate):");
        boolean result15_1 = Stream.of(1, 2, 3, 4, 5)
                .noneMatch(x -> x == 9); // result: true
        System.out.println("result15_1: " + result15_1);

        boolean result15_2 = Stream.of(1, 2, 3, 4, 5)
                .noneMatch(x -> x == 3); // result: false
        System.out.println("result15_2: " + result15_2);

        boolean result15_3 = Stream.of(120, 410, 86, 32, 314, 12)
                .noneMatch(x -> x % 2 == 1); // result: true
        System.out.println("result15_3: " + result15_3);
        System.out.println();

        //16. Пример OptionalDouble average()
        //Только для примитивных стримов. Возвращает среднее арифметическое всех элементов. Либо Optional.empty, если стрим пуст.
        System.out.println("16. OptionalDouble average():");
        double result16_1 = IntStream.range(2, 16)
                .average()
                .getAsDouble(); // result: 8.5
        System.out.println("result16_1: " + result16_1);
        System.out.println();

        //17. Пример sum()
        //Возвращает сумму элементов примитивного стрима. Для IntStream результат будет типа int, для LongStream — long, для DoubleStream — double.
        System.out.println("17. sum():");
        long result17 = LongStream.range(2, 16)
                .sum(); // result: 119
        System.out.println("result17: " + result17);
        System.out.println();

        //18. Пример IntSummaryStatistics summaryStatistics()
        //Полезный метод примитивных стримов. Позволяет собрать статистику о числовой последовательности стрима,
        //а именно: количество элементов, их сумму, среднее арифметическое, минимальный и максимальный элемент.
        System.out.println("18. IntSummaryStatistics summaryStatistics():");
        LongSummaryStatistics stats = LongStream.range(2, 16)
                .summaryStatistics();
        System.out.format("  count: %d%n", stats.getCount());       //   count: 14
        System.out.format("    sum: %d%n", stats.getSum());         //     sum: 119
        System.out.format("average: %.1f%n", stats.getAverage());   // average: 8,5
        System.out.format("    min: %d%n", stats.getMin());         //     min: 2
        System.out.format("    max: %d%n", stats.getMax());         //     max: 15
        System.out.println();
    }
}
