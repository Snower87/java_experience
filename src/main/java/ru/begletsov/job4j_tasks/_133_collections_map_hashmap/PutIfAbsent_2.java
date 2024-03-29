package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.Map;
import java.util.Objects;

/**
 * @Задание 2. Добавление элемента в отображение без проверки
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание Когда мы добавляем значение в отображение, нам необходимо проверить не содержит ли отображение уже значение
 * по такому ключу. Это не совсем удобно, поскольку приходится выполнять дополнительные проверки из-за того, что мы
 * не хотим потерять данные. Как же быть в такой ситуации? Очень просто - использовать метод putIfAbsent():
 * - V putIfAbsent(K key, V value) - метод помещает в отображение новый объект с ключом key и значением value, если
 * в отображении еще нет элемента с подобным ключом.
 * А как же мы можем проверить содержится ли определенное значение(не путать с ключом) в отображении или нет?
 * Для этого в интерфейсе Map<K, V> определен метод containsValue():
 * - boolean containsValue(V value) - метод возвращает true, если отображение содержит значение value.
 * Задание: вам необходимо реализовать метод boolean addNewElement(User u), который осуществит добавление нового элемента
 * только при условии, что такого ключа в отображении еще нет. При этом метод должен вернуть булево значение -
 * для этого необходимо проверить содержит ли отображение значение u.
 * В отображении ключом является id пользователя, значением - объект типа User.
 * @author Sergei Begletsov
 * @since 12.05.2021
 * @version 1
 */

public class PutIfAbsent_2 {
    private final Map<Integer, User> users;

    public PutIfAbsent_2(Map<Integer, User> users) {
        this.users = users;
    }

    public boolean addNewElement(User u) {
        users.putIfAbsent(u.getId(), u);
        return users.containsValue(u);
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
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}