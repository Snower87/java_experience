package ru.begletsov.job4j_tasks._141_lambda;

import java.util.function.Function;

/**
 * @Задание 2.1. Function. Возвести число в квадрат
 * @Раздел 1.4.1. Lambda
 * @Описание Ниже приведен код. Вам нужно дописать лямбда выражение, которое возводит переданное число в квадрат (для 2 = 4, для 3 = 9 и тд)
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 1
 */

public class _2_1_FunctionPow {
    public static double calculate(double x) {
        return calculate(y -> Math.pow(y, 2), x);
    }

    public static double calculate(Function<Double, Double> func, double x) {
        return func.apply(x);
    }
}
