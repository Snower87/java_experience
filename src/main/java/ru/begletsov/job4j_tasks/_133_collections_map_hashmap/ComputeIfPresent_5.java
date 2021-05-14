package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.Map;

/**
 * @Задание 5. Изменение уже существующей записи в отображении
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание В Java 8 в интерфейс Map<K, V> были добавлены особые методы, которые позволяют изменять записи в отображении
 * с помощь лямбда-выражений. Рассмотрим следующий метод:
 * - V computeIfPresent​(K key, BiFunction<? super K,​ ? super V,​? extends V> remappingFunction) - если отображение
 * содержит значение для указанного ключа и не равно null, выполняется вычисление нового сопоставления ключ - значение
 * с учетом исходного ключа и текущего сопоставленного значения.
 * Чтобы немного уяснить рассмотрим небольшой пример:
 * - Map<Integer, String> map = new HashMap<>();
 * - map.put(1, "root"); // добавляем значение пару ключ-значение в отображение
 * - System.out.println(map.get(1)); // в консоль будет выведена строка root
 * - map.computeIfPresent(1, (key, value) -> value + "@root"); // изменяем значение которое ЕСТЬ в отображении
 * - System.out.println(map.get(1)); // в консоль будет выведена строка root@root
 * т.е. с помощью лямбда выражения мы получаем доступ к текущему значению, который сопоставлен с ключом, который мы
 * передали в метод (вычисление производит функциональный интерфейс BiFunction).
 * Задание: метод принимает два отображения, которые имеют одинаковый размер:
 * 1. Ключ - тип Integer, значение - тип String. При этом значение - это Имя, ключ - возрастающая последовательность, начиная с 1
 * 2. Ключ - тип Integer, значение - тип String. При этом значение - это Фамилия, ключ - возрастающая последовательность, начиная с 1
 * Необходимо пройтись по первому отображению и к значению имени добавить значение фамилии, чтобы на выходе получилось
 * отображение - ключ(число) - значение(строка - имя + фамилия).
 * @author Sergei Begletsov
 * @since 14.05.2021
 * @version 1
 */

public class ComputeIfPresent_5 {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (int ind = 1; ind <= name.size(); ind++) {
            String bbb = surname.get(ind);
            if (bbb != null) {
                name.computeIfPresent(ind, (key, value) -> value + " " + bbb);
            }

        }
        return name;
    }
}