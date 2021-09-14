package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 6.3. Промежуточные операции. Метод filter(). Фильтрация объектов
 * @Раздел 1.4.2. Stream API
 * @Описание Дан список пользователей. Вам нужно оставить только пользователей, у которых имя начинается с буквы "B", а возраст > 18.
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _6_3_FilterObject {
    public static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> filter(List<User> users) {
        return users.stream()
                .filter(user -> user.getName().startsWith("B"))
                .filter(user -> user.getAge() > 18)
                .collect(Collectors.toList());
    }
}
