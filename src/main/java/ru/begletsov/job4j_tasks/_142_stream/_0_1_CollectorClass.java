package ru.begletsov.job4j_tasks._142_stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @Задание 0.1. Понятие редукции. Произвольный Collector для сборки в коллекцию
 * @Раздел 1.4.2. Stream API
 * @Описание Говоря простыми словами редукция (от англ. reduction - уменьшение) - это сведения, набора элементов
 * к чему-то одному. Например, использование коллекторов предполагает сведение результата чаще всего к коллекции.
 * Но так же есть и другие способы редукции, их мы разберем позже.
 * Рассмотрим пример, создания произвольного коллектора. Собирать будем в связный список. Добавление будет идти
 * всегда в начало. Пример:
 *  //в созданно нами коллекции, будет храниться наш результат
 *  Supplier<Deque<Integer>> supplier = LinkedList::new;
 *
 *  //здесь мы указываем как мы будем собирать элементы в коллекцию
 *  BiConsumer<Deque<Integer>, Integer> biConsumer = Deque::addFirst;
 *
 *  //так нужно просто прописать. Оператор используется для совмещения
 *  //результатов параллельных вычислений
 *  BinaryOperator<Deque<Integer>> operator = (left, right) -> {
 *      right.forEach(left::addFirst);
 *      return left;
 *  };
 *
 *  Deque<Integer> result = List.of(1, 2, 3).stream()
 *           .collect(Collector.of(
 *                   supplier,
 *                   biConsumer,
 *                   operator)
 *            );
 *  result.forEach(System.out::println);
 *  //Результат будет: 3, 2, 1
 *  Ваша задача прописать создание коллекции и добавление элемента. Коллекцией будет LinkedList, для добавление
 *  нужно использовать метод add().
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 1
 */

public class _0_1_CollectorClass {
    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream().collect(Collector.of(supplier, biConsumer, operator));
    }
}
