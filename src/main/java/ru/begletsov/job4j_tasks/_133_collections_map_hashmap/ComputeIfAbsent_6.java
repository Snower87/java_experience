package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Задание 6. Вычисление значений в отображении если ключа не существует
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание В интерфейсе Map<K, V> определен особый метод, который позволяет вычислить значение в том случае, если такого
 * ключа в отображении нет или значение ассоциированное с ключом равно null. Посмотрим как определен этот метод:
 * - V computeIfAbsent​(K key, Function<? super K,​? extends V> mappingFunction) - если в отображении заданный ключ key
 * еще не связан со значением (или значение равно null), будет выполнено вычисление значение в соответствии с использова-
 * нием заданной функции mappingFunction и это значение будет введено в отображение.
 * Рассмотрим небольшой пример:
 * - Map<Integer, String> map = new HashMap<>();
 * - map.put(1, "first"); // добавляем пару ключ-значение
 * - map.computeIfAbsent(2, key -> "second" + "_" + key); // вычисляем значение для ключа, которого нет в отображении
 * - System.out.println(map.get(2)); // будет выведено second_2
 * - map.computeIfAbsent(1, key -> "first" + "_" + key); // вычисляем значение для ключа, который есть в отображении
 * - System.out.println(map.get(1)); // будет выведено first, т.е. значение не изменилось
 * Задание: метод принимает отображение в котором содержатся пары ключ(число) - значение(строка), при этом строка - это
 * имя пользователя(в отображении они представлены пустой строкой), ключ - его id. Также в качестве аргумента метод
 * принимает список пользователей. Необходимо реализовать метод, который произведет ассоциацию id и name пользователя
 * в отображении. При этом:
 * 1. Если такой ключ уже есть в отображении - метод должен обновить ассоциацию(используйте computeIfPresent()).
 * 2. Если такого ключа нет - метод должен добавить ассоциацию(используйте computeIfAbsent()).
 * @author Sergei Begletsov
 * @since 15.05.2021
 * @version 1
 */

public class ComputeIfAbsent_6 {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (int index = 0; index < users.size(); index++) {
            int userId = users.get(index).getId();
            String userName = users.get(index).getName();
            if (names.containsKey(userId)) {
                names.computeIfPresent(userId, (key, value) -> value + userName);
            } else {
                names.computeIfAbsent(userId, key -> userName);
            }
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComputeIfAbsent_6.User user = (ComputeIfAbsent_6.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
