package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Comparator;

/**
 * @Задание 1.3. Вызов компаратора. Метод nullsFirst()
 * @Раздел 1.3.4. Сортировка
 * @Описание Если среди элементов есть null, то методы naturalOrder(), reverseOrder() выкинут NullPointerException.
 * Для избежания этой ситуации используется null-friendly компаратор, который проверяет сначала элементы на null.
 * Если мы хотим, чтобы наши null элементы скопились в начале, то мы можем использовать метод nullsFirst().
 * В отличие от методов naturalOrder(), reverseOrder(), этот использует метод compare в Compator для сравнения элементов,
 * поэтому принимает в качестве аргумента компаратор.
 * Например,
 * - Comparator<Integer> comparator = Comparator.nullsFirst(Comparator.naturalOrder());
 * Сначала создастся компаратор, у которого будет использован метод compare(), а только потом компаратор,
 * который учитывает null. Ваша задача вызвать null-frendly компаратор для строки.
 * @author Sergei Begletsov
 * @since 26.05.2021
 * @version 1
 */

public class NullFirstMethod_1_3 {
    public static Comparator<String> nullFirst() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
