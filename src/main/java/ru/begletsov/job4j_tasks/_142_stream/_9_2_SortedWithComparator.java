package ru.begletsov.job4j_tasks._142_stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 9.2. Промежуточные операции. Метод sorted() с компаратором
 * @Раздел 1.4.2. Stream API
 * @Описание Метод sorted() может принимать также Comparator.
 * Ваша задача отсортировать строки по убыванию. Нужно использовать Comparator.reverseOrder() для получения компаратора
 * @author Sergei Begletsov
 * @since 16.09.2021
 * @version 1
 */

public class _9_2_SortedWithComparator {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                //Вариант 1
                .sorted(Comparator.reverseOrder())
                //Вариант 2
                //.sorted(new Comparator<String>() {
                //    @Override
                //    public int compare(String str1, String str2) {
                //        return str2.compareTo(str1);
                //    }
                //})
                //Вариант 3
                //.sorted((s1, s2) -> s2.compareTo(s1))
                //Вариант 4
                //.sorted(Comparator.comparing(String::toString))
                //Вариант 5
                //.sorted(Comparator.comparing((String x) -> x))
                .collect(Collectors.toList());
    }
}
