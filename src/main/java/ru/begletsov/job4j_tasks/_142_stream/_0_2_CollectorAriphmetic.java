package ru.begletsov.job4j_tasks._142_stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @Задание 0.2. Понятие редукции. Произвольный Collector для подсчета
 * @Раздел 1.4.2. Stream API
 * @Описание Редукция может быть использована не только для сведения в коллекцию, но и для сведению например, к числу,
 * строке и тд. Например, нам нужен коллектор, который поделит 100 на все числа в стриме. Например, для 4, и 5, (100 / 4) / 5 = 5.
 * Давайте напишем такой коллектор:
 * - // сюда сложим элементы
 * - Supplier<List<Integer>> supplier = LinkedList::new;
 * - // говорим, как добавлять элементы
 * - BiConsumer<List<Integer>, Integer> consumer = List::add;
 * - // не вдаемся в подробности. Просто нужно
 * - BinaryOperator<List<Integer>> merger = (xs, ys) -> {
 * -     xs.addAll(ys);
 * -     return xs;
 * - };
 * - // это функция, которая обработает наш список после сборки
 * - // здесь вся логика
 * - Function<List<Integer>, Integer> function = (ns) -> {
 * -     int number = 100;
 * -     for (Integer n : ns) {
 * -         number /= n;
 * -     }
 * -     return number;
 * - };
 * - Integer result = List.of(4, 5).stream()
 * -        .collect(Collector.of(supplier, consumer, merger, function));
 * - System.out.println(result); // 5
 * Как видно, по коду, вся логика сидит в function.
 * Ваша задача дописать метод, чтобы он умножал элементы списка
 * @author Sergei Begletsov
 * @since 30.09.2021
 * @version 1
 */

public class _0_2_CollectorAriphmetic {
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> consumer = List::add;
        BinaryOperator<List<Integer>> merger = (xs, ys) -> {
            xs.addAll(ys);
            return xs;
        };

        Function<List<Integer>, Integer> function = (ns) -> {
            return ns.stream()
                    .reduce(1, (acc, x) -> acc * x);
        };

        return list.stream()
                .collect(Collector.of(supplier, consumer, merger, function));
    }
}
