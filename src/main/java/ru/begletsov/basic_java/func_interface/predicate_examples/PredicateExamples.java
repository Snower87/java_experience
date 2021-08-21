package ru.begletsov.basic_java.func_interface.predicate_examples;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @Задание 3. Примеры реализации функц. интерф. Predicate (утверждение / тест)
 * @Раздел 1.2 Функциональный интерфейс
 * @author Sergei Begletsov
 * @since 21.08.2021
 * @version 1
 */

public class PredicateExamples {
    public static void main(String[] args) {
        //3. Примеры реализации функц. интерф. Predicate (Утверждение)
        Predicate<String> pred30 = s -> s.isEmpty();
        System.out.println("Example 30. Predicate, пустая строка: " + pred30.test(""));
        System.out.println("Example 30. Predicate, пустая строка: " + pred30.test("test1"));
        System.out.println();

        BiPredicate<String, Integer> pred31 = (s, i) -> s.contains(i.toString());
        System.out.println("Example 31. BiPredicate, строка сод. подстроку: " + pred31.test("Name123", 123));
        System.out.println("Example 31. BiPredicate, строка сод. подстроку: " + pred31.test("Name", 123));
        System.out.println();
    }
}
