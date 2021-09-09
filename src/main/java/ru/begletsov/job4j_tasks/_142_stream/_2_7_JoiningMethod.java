package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 2.7. Сборка элементов. Сборка в строку
 * @Раздел 1.4.2. Stream API
 * @Описание Для сборки текста мы использовали StringJoiner, или StringBuilder. Стримы также позволяют сложить элементы,
 * если они являются строками, в единый текст. Для этого используется метод collect() и Collectors.joining().
 * Метод joining() принимает те же аргументы, что и StringJoiner
 * Пример:
 * - List.of("A", "B", "C").stream().collect(Collectors.joining(System.lineSeparator()));
 * Получим:
 * A
 * B
 * C
 * Ваша задача собрать строки списка в текст и добавить префикс "Prefix", и суффикc "Suffix"(т.е. нужно использовать
 * перегруженный вариант joining()). Разделителем должен быть System.lineSeparator()
 * @author Sergei Begletsov
 * @since 09.09.2021
 * @version 1
 */

public class _2_7_JoiningMethod {
    public static String join(List<String> strings) {
        return strings.stream().collect(Collectors.joining(System.lineSeparator(), "Prefix", "Suffix"));
    }
}
