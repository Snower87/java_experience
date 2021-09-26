package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;

/**
 * @Задание 0.4. Понятие редукции. Метод reduce(). Редукция с начальным значением
 * @Раздел 1.4.2. Stream API
 * @Описание Иногда нам может понадобиться произвести редукцию с начальным значением. Для этого есть
 * перегруженный метод reduce(). Первый аргумент начальное значение, второй оператор. В отличие от первого метода,
 * который принимает один аргумент, этот метод возвращает начальное значение для пустого списка, а не Optional.
 * Например, прибавим числа списка к 10:
 * Integer sum = List.of(1, 2, 3).stream().reduce(10, (n1, n2) -> n1 + n2); // 16
 * Integer sum = List.of().stream().reduce(10, (n1, n2) -> n1 + n2); // 10, т.к. список пуст
 * Ваша задача умножить 5 на элементы списка
 * @author Sergei Begletsov
 * @since 26.09.2021
 * @version 1
 */

public class _0_4_ReductionWithTwoArguments {
    public static Integer collect(List<Integer> list) {
        return list.stream()
                .reduce(5, (n1, n2) -> n2 * 5);
    }
}
