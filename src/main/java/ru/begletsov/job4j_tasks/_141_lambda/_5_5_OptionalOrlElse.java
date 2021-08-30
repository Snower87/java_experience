package ru.begletsov.job4j_tasks._141_lambda;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @Задание 5.5. Optional. Методы orElse(), orElseGet()
 * @Раздел 1.4.1. Lambda
 * @Описание Часто приходиться делать действия вида: если выполнено условие, то вернуть одно, иначе вернуть другое.
 * По отношению к Optional это могут быть проверки если значение существует вернуть одно, иначе другое.
 * Методы orElse(), orElseGet() позволяют опустить эти проверки. Если значение существует, то вернется значение,
 * иначе то, что мы указали передали в методы. Например,
 * - Optional.empty().orElse(-1); // вернет -1, потому что значения нет
 * - Optional.of(1).orElse(-1); // вернет 1, потому что значение есть
 * orElseGet() отличается тем, что принимает Supplier, в который мы можем поместить более сложную логику формирования
 * выходного значения. Пример:
 * - Supplier<Integer> supplier = () -> (Integer) (int) (1 + 2 * Math.random());
 * - Integer rsl = Optional.of(1).orElseGet(supplier);
 * Ваша задача отрефакторить код с использованием метода orElse()
 * @author Sergei Begletsov
 * @since 30.08.2021
 * @version 1
 */

public class _5_5_OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        /*
        //было
        Integer value = -1;
        if (optional.isPresent()) {
            value = optional.get();
        } */
        //стало
        Supplier<Integer> supplier = () -> (Integer) (int) (-1);
        Integer value = optional.orElseGet(supplier);
        return value;
    }
}
