package ru.begletsov.job4j_tasks._141_lambda;

import java.util.function.Function;

/**
 * @Задание 2.3. Function. Рассчитать значение по формуле
 * @Раздел 1.4.1. Lambda
 * @Описание Ниже приведен код. Вам нужно дописать лямбда выражение, которое будет подставлять переданное число в формулу:
 *    num * num + 2 * num + 1
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 1
 */

public class _2_3_FunctionFormula {
    public static double calculate(double y) {
        return calculate(x -> x * x + 2* x + 1, y);
    }

    public static double calculate(Function<Double, Double> func, double y) {
        return func.apply(y);
    }
}
