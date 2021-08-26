package ru.begletsov.job4j_tasks._141_lambda;

import java.util.function.Function;

/**
 * @Задание 2.2. Function. Получить корень квадратный из числа
 * @Раздел 1.4.1. Lambda
 * @Описание Ниже приведен код. Вам нужно дописать лямбда выражение, которое извлекает корень квадратный из числа
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 1
 */

public class _2_2_FunctionSqrt {
    public static double calculate(double x) {
        return calculate(y -> Math.sqrt(y), x);
    }

    public static double calculate(Function<Double, Double> func, double x) {
        return func.apply(x);
    }
}
