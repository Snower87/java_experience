package ru.begletsov.job4j_tasks._141_lambda;

import java.util.Optional;

/**
 * @Задание 5.2. Optional. Методы isPresent(), isEmpty(), get()
 * @Раздел 1.4.1. Lambda
 * @Описание Для того, чтобы проверить, что в Optional есть значение или нет, можно использовать метод isPresent(),
 * isEmpty(). Например:
 * - Optional.of(1).isPresent(); // даст true
 * - Optional.empty().isEmpty(); // даст true
 * Для получения значения, которое мы поместили с помощью метода of() мы можем использовать метод get()
 * Например:
 * - Optional.of(1).get() // Вернет 1
 * - Optional.empty().get() // Вернет исключение!
 * Запомните, перед вызовом метода get() всегда нужно использовать isPresent(). В этом суть Optional, чтобы программист
 * не забывал делать проверки.
 * Ваша задача:
 * 1. Написать метод indexOf(). Он ищет индекс по значению. Если индекс не найден, должно вернуться Optional.empty().
 * Если найден, то Optional из этого индекса.
 * 2. В методе get() нужно вызвать метод indexOf(). Если вернулся пустой Optional, то метод должен вернуть -1, в противном
 * случае сам индекс.
 * @author Sergei Begletsov
 * @since 28.08.2021
 * @version 3
 */

public class _5_2_OptionalGetAndIsPresent {
    /**
     * Поиск индекса элемента в массиве данных
     * @param data входные данные
     * @param el искомый элемент
     * @return если вернулся пустой Optional, то метод должен вернуть -1,
     *         в противном случае сам индекс.
     */
    public static int get(int[] data, int el) {
        Optional<Integer> optional = indexOf(data, el);
        if (optional.isEmpty()) {
            return - 1;
        }
        return optional.get();
    }

    /**
     * Поиск индекса элемента по значению
     * @param data входные данные
     * @param el искомый элемент
     * @return если индекс элемента не найден, должно вернуться Optional.empty(),
     *         если найден, то Optional из этого индекса.
     */
    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> optional = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                optional = Optional.of(i);
            }
        }
        return optional;
    }
}
