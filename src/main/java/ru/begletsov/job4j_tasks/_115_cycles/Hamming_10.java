package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 10. Расстояние Хэмминга
 * @Описание Расстояние Хэмминга - это число позиций в которых соответствующие символы двух слов одинаковой длины различны.
 * Например, сравнивая "101010111" и "111010100" мы должны получить - 3, поскольку не равны символы
 * (отмечены жирным курсивом и подчеркиванием) - "101010111" и "111010100"
 * Метод принимает 2 строки, всегда одинаковой длины. Необходимо определить для строки расстояние Хэмминга.
 * Для этого в цикле последовательно необходимо сравнивать символы в строке.
 * Для извлечения символа из строки используйте метод charAt(int index) класса String.
 * @author Sergei Begletsov
 * @since 14.04.2021
 * @version 1
 */

public class Hamming_10 {
    public static int checkStrings(String left, String right) {
        int hammingDist = 0;
        int lenStr = left.length();
        for (int ind = 0; ind < lenStr; ind++) {
            if (left.charAt(ind) != right.charAt(ind)) {
                hammingDist++;
            }
        }
        return hammingDist;
    }
}
