package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Задание 10. Массив строк с повторяющимися значениями
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание Метод принимает массив строк, в котором строки могут повторяться. Необходимо перебрать массив строк и сложить
 * их в карту. При этом должны выполниться следующие условия:
 * 1. Ключом является строка.
 * 2. Значением будет булево переменная.
 * 3. Если строка встречается в массиве 2 и более раз, то булево значение должно быть true. В ином случае - должно принимать
 * значение false.
 * @author Sergei Begletsov
 * @since 19.05.2021
 * @version 1
 */

public class NonUniqueString_10 {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str :
                strings) {
            if (map.containsKey(str)) {
                map.put(str, true);
            } else {
                map.computeIfAbsent(str, key -> false);
            }
        }
        return map;
    }
}
