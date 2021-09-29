package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 9.5. Optional и Stream. Метод stream()
 * @Раздел 1.4.2. Stream API
 * @Описание В классе Optional есть методы, которые помогают работать со стримами. Например, метод stream(),
 * если значение существует, то этот метод создает стрим из этого значения, если нет, то возвращает пустой стрим. *
 * Например, напишем метод, который преобразует к верхнему регистру первую строку, которая начинается с 1.
 * Если в стриме ничего не будет нам вернется пустая строка, как видим это довольно удобно, т.к. позволяет
 * продолжать работать со стримами, не делая проверок через if
 * - List<String> strings = List.of(
 * -     "1. Task",
 * -     "2. Task",
 * -     "3. Task"
 * - );
 * - String result = strings.stream()
 * -          .filter(s -> s.startsWith("1."))
 * -          .findFirst().stream()
 * -          .flatMapToInt(String::chars)
 * -          .mapToObj(c -> String.valueOf(Character.toUpperCase((char)c)))
 * -          .collect(Collectors.joining());
 * - System.out.println(result);
 * Вывод:
 * 1. TASK
 * Ваша задача найти тел. номера пользователя с заданным id, которые начинаются с region.
 * @author Sergei Begletsov
 * @since 23.09.2021
 * @version 1
 */

public class _9_5_OptionalStream {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "1. Task",
                "2. Task",
                "3. Task"
        );
        String result = strings.stream()
                .filter(s -> s.startsWith("1."))
                .findFirst().stream()
                .flatMapToInt(String::chars)
                .mapToObj(c -> String.valueOf(Character.toUpperCase((char)c)))
                .collect(Collectors.joining());
        System.out.println(result);
    }

    public static class PhoneNumber {

        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

    }

    public static class User {

        private int id;

        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
        return  users.stream()
                .filter(user -> user.getId() == id)
                .flatMap(phone -> phone.getNumbers().stream())
                .filter(phoneNumber -> phoneNumber.phone.startsWith(region))
                .collect(Collectors.toList());
    }
}
