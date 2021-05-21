package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Задание 12. Индексы символов
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание Метод принимает строку, при этом слова могут содержать как строчные символы, так и прописные. При реализации
 * необходимо игнорировать пробелы во входной строке.
 * Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из строки, а значением - список
 * индексов, под которыми этот символ (если таких символов несколько) входит в исходную строку. Важно: строчные и прописные
 * символы считаются разными символами.
 * @author Sergei Begletsov
 * @since 21.05.2021
 * @version 1
 */

public class Concordance_12 {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        char[] chars = s.replace(" ","").toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char key = chars[i];
            int value = i;
            if (!rsl.containsKey(key)) {
                rsl.put(key, new LinkedList<Integer>());
            }
            rsl.get(key).add(value);
        }
        return rsl;
    }
}
