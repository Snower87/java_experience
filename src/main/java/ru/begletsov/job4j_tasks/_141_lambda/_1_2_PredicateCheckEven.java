package ru.begletsov.job4j_tasks._141_lambda;

import java.util.function.Predicate;

/**
 * @Задание 1.2. Predicate. Проверить, что число четное
 * @Раздел 1.4.1. Lambda
 * @Описание Ниже приведен код. Вам нужно дописать лямбда выражение, которое проверяет, что число четное
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 1
 */

public class _1_2_PredicateCheckEven {
    public static boolean check(int num) {
        return check(x -> x % 2 == 0, num);
    }

    public static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
