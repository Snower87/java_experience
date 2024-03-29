package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Задание 3. Получить значения отображения по ключу
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание Рассмотрим 2 очень простых, но очень важных метода, которые будут использоваться в Вашей практике очень часто:
 * - V get(K key) - метод возвращает значение объекта, которому соответствует ключ key. Если вдруг окажется, что такого
 * элемента нет - то метод вернет null.
 * - Set<K> keySet() - возвращает набор всех ключей отображения.
 * Важно упомянуть, что отображение не позволяет хранить 2 значения по одинаковому ключу, т.е. ключ для отображения -
 * уникальный идентификатор. При этом в качестве ключа допускается использовать null (допускается не означает, что это
 * хорошая идея). При этом ключ со значением null может быть только один.
 * Задание: Вам необходимо раскомментировать код, заполнить пропуски (обозначены ...) так, чтобы в консоль были выведены
 * все значения отображения. При этом необходимо использовать метод keySet() и get().
 * @author Sergei Begletsov
 * @since 13.05.2021
 * @version 1
 */

public class KeySet_3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (Integer key: map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
