package ru.begletsov.job4j_tasks._116_arrays;

import java.util.Arrays;

/**
 * @Задание 45. Разрушение бинарного кода
 * @Описание Представьте, что вы связист на войне. Вы отловили сигнал противника, ваша задача испортить его.
 * Вы решили это сделать следующим образом, заменить первые 5 символов 0, а последние 5 символов 1.
 * Длина исходной последовательности >= 10
 * @author Sergei Begletsov
 * @since 26.04.2021
 * @version 1
 */

public class DestroySequenceBinCode_45 {
    public static char[] destroy(char[] seq) {
        char[] rsl = Arrays.copyOf(seq, seq.length);
        //1. Искажаю первые 5 символов
        for (int i = 0; i < 5; i++) {
            rsl[i] = '0';
        }
        //2. Искажаю последние 5 символов
        for (int i = rsl.length - 1; i > rsl.length - 1 - 5; i--) {
            rsl[i] = '1';
        }
        return rsl;
    }
}
