package ru.begletsov.job4j_tasks._141_lambda;

import java.util.Optional;

/**
 * @Задание 5.3. Optional. Метод ifPresent()
 * @Раздел 1.4.1. Lambda
 * @Описание Иногда нужно при нахождении Optional выполнить какое-то действие. Для этого существует метод ifPresent(),
 * он принимает Consumer, который будет выполнен, если значение Optional не пустое. Например:
 * - Optional.of(1).ifPresent(System.out::println); // выведется 1
 * - Optional.empty().ifPresent(System.out::println); // ничего не выведется, потому что значения нет
 * Ваша задача:
 * 1. Написать метод max(). Он находит максимальный элемент массива. Если массив пуст, то возвращает пустой Optional,
 * в противном случае Optional из максимального значения
 * 2. Метод ifPresent() вызывает метод max(). Если значение существует, то выводит максимальное значение например,
 * "Max: 3". Для вывода нужно использовать System.out.println()
 * @author Sergei Begletsov
 * @since 28.08.2021
 * @version 1
 */

public class _5_3_OptionalIfPresent {
    /**
     * Вызывает метод max() и выводит данные на консоль
     * @param data входные данные
     */
    public static void ifPresent(int[] data) {
        if (max(data).isPresent()) {
            Optional.of(max(data)).ifPresent((num) -> System.out.println("Max: " + num.get()));
        } else {
            Optional.empty().ifPresent(System.out::println);
        }
    }

    /**
     * Находит максимальный элемент массива
     * @param data входные данные
     * @return если массив пуст, то возвращает пустой Optional,
     *         в противном случае Optional из максимального значения
     */
    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return Optional.of(max);
    }
}
