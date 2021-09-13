package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 5.1. Промежуточные операции. Метод map(). Map с числами
 * @Раздел 1.4.2. Stream API
 * @Описание Метод map() служит для преобразования элементов стрима. Вызвав этот метод, вы преобразуете каждый элемент
 * и получаете стрим из преобразованных элементов.
 * Например:
 * - List.of(1, 2, 3).stream().map(n -> 2 * n).collect(Collectors.toList()); // получим список 2, 4, 6
 * Ваша задача из заданного списка чисел получить список квадратов этих чисел
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _5_1_NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n).collect(Collectors.toList());
    }
}
