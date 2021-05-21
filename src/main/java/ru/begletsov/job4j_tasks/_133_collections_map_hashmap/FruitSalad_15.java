package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Задание 15. Фруктовый салат. 1 ключу соответствует N-значений
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание В данном задании необходимо организовтаь словарь (ключ-значение) таким образом, чтобы одному ключу
 * соответствовало сразу несколько значений.
 * Пример:
 *  Key       value
 * -----      ------
 * car         toyota
 * car         bmw
 * car         honda
 *
 * fruit       apple
 * fruit       banana
 *
 * computer    acer
 * computer    asus
 * computer    ibm
 * @author Sergei Begletsov
 * @since 21.05.2021
 * @version 1
 */

public class FruitSalad_15 {
    public static Map<String, List<String>> collectData(String[] strings){
        Map<String, List<String>> rsl = new HashMap();
        for (String string:
             strings){
            //String key string.
            String[] words = string.split(" ");
            String key = words[0];
            String value = words[1];
            if (!rsl.containsKey(key)) {
                rsl.put(key, new LinkedList<>());
            }
            rsl.get(key).add(value);
        }
        return rsl;
    }
}
