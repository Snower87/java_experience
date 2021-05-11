package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Задание 5. Джекпот в казино
 * @Раздел 1.3.2. Коллекция Set, HashSet
 * @Описание Выигрышной комбинацией для джекпота в казино считается такая, в которой все элементы одинаковые.
 * Метод принимает массив строк, который содержит последовательность элементов игровой комбинации. Метод должен вернуть
 * true - если комбинация является выигрышной.
 * Напомню, что коллекция Set не допускает наличие дубликатов. Поэтому если все элементы массива добавить в коллекцию
 * типа Set, то размер коллекции будет равен 1 при условии, что комбинация выигрышная.
 * @author Sergei Begletsov
 * @since 11.05.2021
 * @version 1
 */

public class Jackpot_5 {
    public static boolean checkYourWin(String[] combination) {
        Set<String> cards = new HashSet<>();
        //Вариант 1
        for (String element: combination) {
            cards.add(element);
        }
        //Вариант 2
        //cards.addAll(Arrays.asList(combination));
        return cards.size() == 1;
    }
}
