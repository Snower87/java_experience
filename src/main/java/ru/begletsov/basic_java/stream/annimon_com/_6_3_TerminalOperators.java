package ru.begletsov.basic_java.stream.annimon_com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 6.3. Терминальные операторы
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 16.09.2021
 * @version 1
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
        System.out.println();

        System.out.println(
                IntStream.rangeClosed(-3, 6)
                         .count()); // 10
        System.out.println();

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
        System.out.println();

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
        System.out.println(result.isPresent()); // false
        System.out.println();

        Optional<Integer> sum9 = Stream.of(1, 2, 3, 4, 5)
                .reduce((acc, x) -> acc + x);
        System.out.println(sum9.get()); // 15
        System.out.println();

        int sum9_1 = IntStream.of(2, 4, 6, 8)
                .reduce(5 , (acc, x) -> acc + x); // sum: 25
        System.out.println("sum9_1: " + sum9_1);
        System.out.println();

        int product = IntStream.range(0, 10)
                .filter(x -> x++ % 4 == 0)
                .reduce((acc, x) -> acc * x)
                .getAsInt(); // product: 0
        System.out.println("product: " + product);
        System.out.println();
    }
}
