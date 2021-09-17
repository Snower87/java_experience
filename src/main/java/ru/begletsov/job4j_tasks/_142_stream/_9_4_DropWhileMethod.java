package ru.begletsov.job4j_tasks._142_stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 9.4. Промежуточные операции. Метод dropWhile()
 * @Раздел 1.4.2. Stream API
 * @Описание Данный метод похож на метод takeWhile() только он позволяет пропустить элементы, которые удовлетворяют условию.
 * Этот метод также нужно использовать только для отсортированных элементов, т.к. если для первого элемента не выполниться условие,
 * то в стриме останутся все элементы.
 * Ваша задача оставить в списке только положительные элементы. Порядок элементов исходного списка может быть произвольным
 * @author Sergei Begletsov
 * @since 17.09.2021
 * @version 1
 */

public class _9_4_DropWhileMethod {
    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Comparator.naturalOrder())
                .dropWhile(i -> i < 0)
                .collect(Collectors.toList());
    }
}
