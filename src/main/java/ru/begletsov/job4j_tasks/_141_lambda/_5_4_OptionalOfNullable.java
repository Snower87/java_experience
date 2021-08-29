package ru.begletsov.job4j_tasks._141_lambda;

import java.util.List;
import java.util.Optional;

/**
 * @Задание 5.4. Optional. Метод ofNullable()
 * @Раздел 1.4.1. Lambda
 * @Описание Стоит обратить внимание, что метод of() не принимает null элементы:
 *     public static <T> Optional<T> of(T value) {
 *         return new Optional<>(Objects.requireNonNull(value));
 *     }
 * Чтобы создать Optional в случае если есть null элементы можно использовать метод Optional.ofNullable(). Этот метод
 * возвращает пустой Optional если передано null значение и Optional из переданного значения, если оно не null. Например,
 * - Optional.ofNullable(1).ifPresent(System.out::println); // выведет 1
 * - Optional.ofNullable(null).ifPresent(System.out::println); // ничего не выведется, потому что мы получили пустой Optional
 * Ваша задача, написать метод поиск строки среди списка. В списке могут быть null элементы. Чтобы обернуть найденное
 * значение нужно использовать Optional.ofNullable(). Для безопасной проверки можно использовать Objects.equals().
 * Если что-то найдено, нужно вернуть Optional из этого значения, в противном случае пустой Optional
 * @author Sergei Begletsov
 * @since 29.08.2021
 * @version 1
 */

public class _5_4_OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> optional = Optional.empty();
        for (String string: strings) {
            Optional<String> elemStr = Optional.ofNullable(string);
            if (elemStr.isPresent() && elemStr.get().equals(value)) {
                optional = Optional.of(value);
                break;
            }
        }
        return optional;
    }
}
