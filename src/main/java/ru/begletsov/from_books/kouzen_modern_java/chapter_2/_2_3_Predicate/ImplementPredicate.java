package ru.begletsov.from_books.kouzen_modern_java.chapter_2._2_3_Predicate;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImplementPredicate {
    public static final Predicate<String> LENGTH_FIVE = s -> s.length() == 5;
    public static final Predicate<String> STARTS_WITH_S = s -> s.startsWith("S");

    //Пример 2.7 Нахождение строк заданной длины
    public String getNamesOfLength(int length, String... names) {
        return Arrays.stream(names)
                .filter(s -> s.length() == length)
                .collect(Collectors.joining(", "));
    }

    //Пример 2.8 Нахождение строк с заданным префиксом
    public String getNamesStartingWith(String str, String... names) {
        return Arrays.stream(names)
                .filter(s -> s.startsWith(str))
                .collect(Collectors.joining(", "));
    }

    //Пример 2.9 Нахождение строк, удовлетворяющих произвольному предикату
    public String getNamesSatisfyingCondition(Predicate<String> condition, String... names) {
        return Arrays.stream(names)
                .filter(condition)
                .collect(Collectors.joining(", "));
        }
}
