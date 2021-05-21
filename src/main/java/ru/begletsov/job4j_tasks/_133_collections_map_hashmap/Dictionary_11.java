package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Задание 11. Реализовать словарь
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание В данном задании необходимо реализовать словарь. Метод принимает массив строк. Необходимо перебрать массив
 * и добавить строки в карту таким образом, чтобы ключом был первый символ строки, а значением - список строк, которые
 * начинаются на первый символ строки.
 * @author Sergei Begletsov
 * @since 21.05.2021
 * @version 1
 */

public class Dictionary_11 {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string :
                strings) {
            //String key = Character.toString(string.charAt(0));
            //String key = String.valueOf(string.charAt(0));
            String key = "" + string.charAt(0);
            if (!rsl.containsKey(key)) {
                rsl.put(key, new LinkedList<String>());
            }
            rsl.get(key).add(string);
        }
        return rsl;
    }
}
