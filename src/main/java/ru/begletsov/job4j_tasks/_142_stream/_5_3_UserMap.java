package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 5.3. Промежуточные операции. Метод map(). Map с объектами
 * @Раздел 1.4.2. Stream API
 * @Описание Дан список возрастов. Вам нужно создать список пользователей с такими возрастами
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _5_3_UserMap {
    public static class User {

        private int age;

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> map(List<Integer> ages) {
        return ages.stream().map(age -> new User(age)).collect(Collectors.toList());
    }
}
