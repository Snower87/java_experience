package ru.begletsov.job4j_tasks._141_lambda;

import java.util.function.Predicate;

/**
 * @Задание 4.3. Method reference и Predicate
 * @Раздел 1.4.1. Lambda
 * @Описание Ваша задача создать предикат Predicate, который проверяет, что строка пустая, для этого нужно использовать
 * метод isEmpty() в классе String
 * @author Sergei Begletsov
 * @since 27.08.2021
 * @version 1
 */

public class _4_3_MRPredicate {
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}
