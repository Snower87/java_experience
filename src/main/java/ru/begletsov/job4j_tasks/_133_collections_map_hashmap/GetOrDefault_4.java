package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Задание 4. Возврат отличных от null значений по умолчанию
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание В интерфейсе Map<K, V> определен особый метод getOrDefault() который позволяет избежать того, что по-умолчанию
 * метод get() возвращает null. Этот метод полезен тем, что мы можем задать иное поведение при получении значения из отображения.
 * Особенно полезным этот метод будет, когда значение в отображении представляет собой коллекцию объектов - List, Set и т.д.
 * - V getOrDefault(K k, V defaultValue) - метод возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется,
 * то будет возвращено значение defaultValue.
 * Задание: необходимо реализовать метод, который позволит добавить элемент list(значение) с ключом index в хранилище store
 * только в том случае, если такого ключа пока еще нет в хранилище. Метод getValue() должен вернуть значение, которое
 * соответствует ключу index, если такого ключа нет - необходимо вернуть пустой список.
 * @author Sergei Begletsov
 * @since 13.05.2021
 * @version 1
 */

public class GetOrDefault_4 {
    private Map<Integer, List<String>> store = new HashMap<>();

    public void addValue(int index, List<String> list) {
        store.putIfAbsent(index, list);
    }

    public List<String> getValue(int index) {
        return store.getOrDefault(index, new ArrayList<>());
    }
}
