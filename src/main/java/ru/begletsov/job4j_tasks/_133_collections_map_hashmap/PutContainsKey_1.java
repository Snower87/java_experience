package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Задание 1. Вставка новых элементов
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание Начнем знакомиться с методами, которые определены в интерфейсе Map<K, V>, который представляет собой отображение,
 * в котором каждому значению K (ключ) соответствует значение V(value). Map используется очень часто, поэтому тему нужно освоить очень хорошо.
 * Начнем с методов, которые позволяют добавить новый элемент в коллекцию, а также проверить существует ли уже такой ключ в Map:
 * - V put(K key, V value) - помещает в коллекцию новый объект с ключом key и значением value. Если в коллекции уже есть
 * объект с подобным ключом, то он перезаписывается. Если ключа еще не было в коллекции, то метод возвращает null,
 * иначе - предыдущее значение которое соответствовало ключу key.
 * - boolean containsKey(K key) - возвращает true, если Map уже содержит ключ key.
 * При этом, сравнение производится с помощью equals() и hashcode(), поэтому если Вы используете свои реализации
 * моделей данных - эти методы будет необходимо переопределить.
 * Задание: в классе определенно 2 метода, оба принимают список пользователей.
 * 1. Выполняет вставку значений в отображение без проверки содержится ли такой ключ уже в отображении.
 * 2. Выполняет вставку значений в отображение с проверкой содержится ли такой ключ уже в отображении.
 * Необходимо перебрать весь список и добавить пользователей в отображение, при этом в качестве ключа использовать id
 * пользователя, значения - объект типа User. В задании необходимо использовать методы, описанные в выше.
 * @author Sergei Begletsov
 * @since 12.05.2021
 * @version 1
 */

public class PutContainsKey_1 {
    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User user: list) {
            rsl.put(user.getId(), user);
        }
        return rsl;
    }

    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User user: list) {
            //Вариант 1
            if (!rsl.containsKey(user.getId())) {
                rsl.put(user.getId(), user);
            }
            //Вариант 2 через putIfAbsent
            //rsl.putIfAbsent(user.getId(), user);
        }
        return rsl;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
