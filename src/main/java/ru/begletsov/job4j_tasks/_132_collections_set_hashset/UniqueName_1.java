package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import java.util.*;

/**
 * @Задание 1. Уникальные имена
 * @Раздел 1.3.2. Коллекция Set, HashSet
 * @Описание Познакомимся с интерфейсом Set и его реализациями. Он расширяет интерфейс Collection и представляет собой
 * набор уникальных элементов, т.е. в наборе значений не могут находиться одинаковые значения. Равенство элементов
 * определяется методами equals() и hashcode(), которые определены в классе Object. Для реализаций своих моделей
 * данных эти методы необходимо переопределять для более корректной работы.
 * Set не добавляет никаких методов по сравнению с Collection, только вносит изменения в унаследованные. Например метод add():
 * - boolean add​(E e) - добавляет новый элемент e в коллекцию. метод возвращает true только в том случае, если такого
 * элемента еще нет в коллекции.
 * - int size() - метод возвращает количество элементов в коллекции.
 * Задание: метод принимает список пользователей, при этом много пользователей могут иметь одинаковое имя. Метод должен
 * определить количество уникальных имен, которые имеют пользователи.
 * @author Sergei Begletsov
 * @since 09.05.2021
 * @version 1
 */

public class UniqueName_1 {
    public static int collectUniqueName(List<User> users) {
        Set<String> listUniqueName = new HashSet<>();
        for (User user: users){
            listUniqueName.add(user.getName());
        }
        return listUniqueName.size();
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }


}
