package ru.begletsov.job4j_tasks._141_lambda;

import java.util.function.Predicate;

/**
 * @Задание 1.3. Predicate. Проверить, что число положительное и четное
 * @Раздел 1.4.1. Lambda
 * @Описание Ниже приведен код. Вам нужно дописать лямбда выражение, которое проверяет, что число четное и положительное
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 1
 */

public class _1_3_PredicateCheckEvenAndPositive {
    public static boolean check(int num) {
        return check(x -> (x % 2 == 0) && (x > 0), num);
    }

    public static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
