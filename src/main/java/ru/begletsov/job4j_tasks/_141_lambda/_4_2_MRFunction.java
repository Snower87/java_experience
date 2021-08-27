package ru.begletsov.job4j_tasks._141_lambda;

import java.util.function.Function;

/**
 * @Задание 4.2. Method reference и Function
 * @Раздел 1.4.1. Lambda
 * @Описание Ваша задача создать Function через ссылку на метод. В качестве функции нужно использовать Math.sqrt()
 * @author Sergei Begletsov
 * @since 27.08.2021
 * @version 1
 */

public class _4_2_MRFunction {
    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
