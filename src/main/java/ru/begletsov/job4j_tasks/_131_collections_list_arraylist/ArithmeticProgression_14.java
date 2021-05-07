package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import java.util.List;

/**
 * @Задание 14. Арифметическая прогрессия
 * @Раздел 1.3.1. Коллекция List, ArrayList
 * @Описание Арифметическая прогрессия - это последовательность чисел в которой каждый последующий элемент отличается
 * от предыдущего на одно и то же число. Например:
 * 1, 3, 5, 7, 9, 11 ... т.е. каждый последующий элемент отличается от предыдущего на 2.
 * Для того чтобы определить является ли последовательность чисел арифметической прогрессией необходимо, чтобы выполнилось условие:
 * любой элемент, начиная со второго, равен полусумме предыдущего элемента и следующего элемента. Т.е., например:
 * второй_элемент = (первый_элемент + третий_элемент) / 2
 * Необходимо реализовать метод, который определит является ли список чисел арифметической прогрессией. Если является -
 * то метод должен вернуть сумму всех элементов, иначе - вернуть 0.
 * @author Sergei Begletsov
 * @since 07.05.2021
 * @version 1
 */

public class ArithmeticProgression_14 {
    public static int checkData(List<Integer> data) {
        boolean prProgression = true;
        int sum = 0;
        int firstElem = data.get(0);
        int lastElem = data.get(data.size() - 1);
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i+1) + data.get(i-1)) / 2) {
                prProgression = false;
                break;
            }
            sum += data.get(i);
        }
        if (prProgression == true) {
            return sum + firstElem + lastElem;
        }
        return 0;
    }
}
