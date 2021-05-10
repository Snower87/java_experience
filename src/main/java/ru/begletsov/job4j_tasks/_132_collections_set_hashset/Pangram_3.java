package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * @Задание 3. Панграмма
 * @Раздел 1.3.2. Коллекция Set, HashSet
 * @Описание Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
 * Метод принимает строку(на английском языке). Необходимо реализовать его так, чтобы метод определил является ли
 * входящая строка панграммой. Строчные и прописные буквы являются одинаковыми символами, пробелы необходимо игнорировать.
 * Напомню, что в английском алфавите 26 букв.
 * @author Sergei Begletsov
 * @since 09.05.2021
 * @version 1
 */

public class Pangram_3 {
    public static boolean checkString(String s) {
        String strLower = new String(s.toLowerCase());
        String[] words = strLower.split(" ");
        Set setChar = new HashSet();
        for (String word: words) {
            char[] abc = word.toCharArray();
            for (char ch: abc) {
                setChar.add(ch);
            }
        }
        return setChar.size() == 26 ? true : false;
    }
}