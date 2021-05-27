package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Comparator;
import java.util.Objects;

/**
 * @Задание 1.5. Получение компаратора. Метод thenComparing()
 * @Раздел 1.3.4. Сортировка
 * @Описание Иногда бывает так, что необходимо задать приоритет порядку следования элементов. Например, сначала нам нужно
 * отсортировать элементы по одному признаку, но если признаки равны, то сортировать по другому признаку. Для этой задачи
 * существует метод thenComparing().
 * Например, если нам нужно, чтобы строки сначала шли по возрастанию лексикографически, но по убыванию длины, если равны
 * лексикограчески, то мы можем совместить два компаратора так.
 * Comparator<String> comparator = Comparator.naturalOrder();
 * Comparator<String> descByLength = new Comparator<String>() {
 *      @Override
 *      public int compare(String o1, String o2) {
 *          return Integer.compare(o2.length(), o1.length());
 *      }
 * };
 * Comparator<String> merged = comparator.thenComparing(descByLength);
 *
 * Запомните, что второй компаратор отработает только если первый вернул 0!
 * Ваша задача написать компаратор, который будет упорядочевать пользователей сначала по возрастанию по имени, а потом
 * по убыванию по возрасту.
 * @author Sergei Begletsov
 * @since 27.05.2021
 * @version 1
 */

public class ThenComparingMethod_1_5 {
    public static class User implements Comparable<User> {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(User o) {
            return name.compareTo(o.name);
        }
    }

    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(ThenComparingMethod_1_5.descByAge());
    }

    public static Comparator<User> ascByName() {
        return Comparator.naturalOrder();
    }

    public static Comparator<User> descByAge() {
        return Comparator.reverseOrder();
    }
}
