package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Задание 7. Найти символ который используется в строке наибольшее количество раз
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание Метод принимает строку, которая может содержать несколько пробелов, однако в ней отсутствуют знаки препинания.
 * Необходимо реализовать метод, который вернет символ в строке, который употребляется наибольшее количество раз. Если
 * окажется что таких символов несколько - необходимо вернуть первый из символов. Чтобы обеспечить сортировку символов -
 * собирайте исходную строку в TreeMap(), в которой ключ - это символ, значение - количество. Перед тем как собирать строку
 * ее нужно привести к нижнему регистру, удалить пробелы.
 * Для того, чтобы собрать строку в отображение используйте методы computeIfPresent() и putIfAbsent() - первый обновит
 * значение частотности употребления символа, второй - вставит пару ключ(символ) значение(1) - если такого символа в отображении еще нет.
 * @author Sergei Begletsov
 * @since 17.05.2021
 * @version 1
 */

public class MostUsedCharacter_7 {
    public static Character getKeyMaxValue(Map<Character, Integer> map) {
        int maxValue = 0;
        Character ch = ' ';
        for (Character key:
                map.keySet()) {
            if (maxValue < map.get(key)) {
                ch = key;
                maxValue = map.get(key);
            }
        }
        return ch;
    }

    public static char getMaxCount(String str) {
        char[] strChar = str.toLowerCase().replace(" ", "").toCharArray();
        Map<Character, Integer> mapChar = new HashMap<>();
        for (int ind = 0; ind < strChar.length; ind++) {
            if (mapChar.containsKey(strChar[ind])) {
                mapChar.computeIfPresent(strChar[ind], (key, value) -> ++value);
            } else {
                mapChar.putIfAbsent(strChar[ind], 1);
            }
        }
        char rsl = getKeyMaxValue(mapChar);
        return rsl;
    }
}
