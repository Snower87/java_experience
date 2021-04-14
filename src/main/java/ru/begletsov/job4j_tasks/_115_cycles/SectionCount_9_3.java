package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 9.3. Найти количество отрезков, используя цикл
 * @Описание Даны два целых положительных числа length, section. length это расстояние.
 * Вам нужно не используя операцию деления найти сколько раз отрезок длиной section помещает в length.
 * Нужно использовать цикл while
 * Например,
 * Для length = 2, section = 1 => 2
 * Для length = 3, section = 2 => 1
 * @author Sergei Begletsov
 * @since 14.04.2021
 * @version 1
 */

public class SectionCount_9_3 {
    public static int count(int length, int section) {
        int countLength = 0;
        while (length >= section) {
            section += section;
            countLength++;
        }
        return countLength;
    }
}
