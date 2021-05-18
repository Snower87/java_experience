package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Задание 8. Объединение значений в Map
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание Если необходимо объединить значение в Map с другим, то для этой задачи можно воспользоваться методом merge():
 * - V merge​(K key, V value, BiFunction<? super V, ​? super V,​ ? extends V> remappingFunction) - метод выполняет
 * связывание ключа key с переданным значением value, если указанный ключ еще не связан со значением, или связан с
 * нулевым значением. В противном случае произойдет замена значения, которое соответствует key, результатами вычисления
 * заданной функции remappingFunction.
 * Для лучшего понимания приведем небольшой пример:
 * - Map<Integer, String> map = new HashMap<>();
 * - map.put(1, "Bill"); // добавляем пару ключ-значение
 * - map.merge(1, "Clinton", (oldV, newV) -> oldV + " " + newV); // заменяем значением новой строки, пары, которая есть в отображении
 * - System.out.println(map.get(1)); // будет выведено Bill Clinton
 * - map.merge(2, "Trump", (oldV, newV) -> oldV + " " + newV); // если такого ключа нет в отображении - пара будет просто создана
 * - System.out.println(map.get(2)); // будет выведено Trump
 * Задание: метод принимает отображение - число(id пользователя) - строка(имя пользователя), а также список пользователей.
 * Возникла проблема - данные в отображении хранились так долго и ранее не было предусмотрено, что помимо имени необходимо
 * хранить еще и фамилию. Необходимо обновить информацию - если такой пользователь уже существует (проверять по ключу) -
 * то необходимо к имени добавить фамилию, если нет - то сначала добавить пользователя - ключ id, значение - имя пользователя,
 * а потом только обновить и добавить фамилию. При решении используйте методы putIfAbsent() и merge().
 * @author Sergei Begletsov
 * @since 18.05.2021
 * @version 1
 */

public class Merge_8 {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (int index = 0; index < users.size(); index++) {
            int userId = users.get(index).getId();
            String userName = users.get(index).getName();
            String userSurname = users.get(index).getSurname();
            if (names.containsKey(userId)) {
                names.merge(userId, userSurname, (oldV, newV) -> oldV + " " + newV);
            } else {
                names.putIfAbsent(userId, userName);
                names.merge(userId, userSurname, (oldV, newV) -> oldV + " " + newV);
            }
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
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
