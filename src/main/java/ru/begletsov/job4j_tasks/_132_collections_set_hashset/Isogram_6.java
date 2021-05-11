package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import java.util.*;

/**
 * @Задание 6. Изограмма
 * @Раздел 1.3.2. Коллекция Set, HashSet
 * @Описание Изограмма - это слово, которое не содержит повторяющихся букв, т.е. все буквы в таком слове уникальные.
 * Метод принимает на входе строку, которая является словом, все буквы написаны в нижнем регистре.
 * Входная строка - не фраза, а одно слово, поэтому ее не нужно делить на слова.
 * Метод должен вернуть булево значение - если слово является изограммой - то метод вернет true, иначе - false.
 * @author Sergei Begletsov
 * @since 11.05.2021
 * @version 1
 */

public class Isogram_6 {
    public static boolean checkString(String s) {
        //Вариант 1
        char[] chars = s.toCharArray();
        boolean isogramm = true;
        Set setChar = new HashSet();
        for (int ind = 0; ind < chars.length; ind++) {
            if (!setChar.contains(chars[ind])) {
                setChar.add(chars[ind]);
            } else {
                isogramm = false;
                break;
            }
        }
        return isogramm;
    }
}
