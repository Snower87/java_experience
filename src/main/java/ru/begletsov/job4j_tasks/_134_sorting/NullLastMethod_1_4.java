package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Comparator;

/**
 * @Задание 1.4. Вызов компаратора. Метод nullsLast()
 * @Раздел 1.3.4. Сортировка
 * @Описание Если мы хотим, что бы null-элементы скопились в конце мы можем использовать компаратор созданный с помощью
 * метода Comparator.nullsLast(). Он аналогичен nullsFirst() за исключением, что null элементы при его применении скопятся
 * в конце. Например,
 * - Comparator<Integer> comparator = Comparator.nullsLast(Comparator.naturalOrder());
 * Сначала создастся компаратор, у которого будет использован метод compare(), а только потом компаратор, который учитывает null.
 * Ваша задача вызвать null-frendly компаратор для строки.
 * @author Sergei Begletsov
 * @since 26.05.2021
 * @version 1
 */

public class NullLastMethod_1_4 {
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
