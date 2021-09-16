package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 9.3. Промежуточные операции. Метод takeWhile()
 * @Раздел 1.4.2. Stream API
 * @Описание Метод takeWhile() позволяет брать из стрима только первые элементы, которые удовлетворяют определенному условию.
 * Если условие перестает выполняться, то оставшиеся элементы отбрасываются.
 * Стоит отметить, что для корректной работы, этого метода нужно чтобы часть элементов, которая удовлетворяет условию должна идти "спереди".
 * Поэтому нужно либо точно знать, что элементы отсортированы, либо использовать метод sorted() для сортировки.
 * Например:
 * - List.of("abc", "bc", "ab", "cd", "a").sorted().takeWhile(s -> s.startWith("a")) // в стриме останутся только "a", "ab", "abc"
 * Ваша задача получить из списка только отрицательные элементы. Элементы исходного списка могут идти в произвольном порядке
 * @author Sergei Begletsov
 * @since 16.09.2021
 * @version 1
 */

public class _9_3_TakeWhileMethod {
    public static List<Integer> takeWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Integer::compareTo)
                .takeWhile(num -> num < 0)
                .collect(Collectors.toList());
    }
}
