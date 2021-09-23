package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.Optional;

/**
 * @Задание 9.6. Optional и Stream. Метод flatMap()
 * @Раздел 1.4.2. Stream API
 * @Описание Иногда может возникнуть такая ситуация. У вас есть метод поиска пользователя, который возвращает Optional из User.
 * Вам нужно получить только счета пользователя, которые хранятся его в учетной записи (у пользователя одна учетная запись,
 * а в ней есть список счетов). Если вам нужно как-то обработать счета пользователя, то можно сделать преобразование
 * из одного Optional в другой Optional методом flatMap, который есть в Optional. Данный метод производит преобразование
 * только если существует значение в Optional, иначе возвращает пустой Optional. В нашем случае можно поступить так:
 * - findUserById(id) // находим пользователя
 * - .flatMap(u -> Optional.of(u.getAccount())) // получаем его учетную запись
 * - .stream().flatMap(a -> a.getBillings().stream) // получаем стрим из записи и берем ее счета
 * - .collect(Collectors.toList()); // собираем в список
 * Как видим описываемый метод позволяет нам работать в стриме непрерывно, т.е. не прописывать отдельные условия
 * Ваша задача найти первую строку, которая кончается на ".java" и вернуть Optional из длины этой строки
 * @author Sergei Begletsov
 * @since 24.09.2021
 * @version 1
 */

public class _9_6_OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(s -> s.endsWith(".java"))
                .findFirst()
                .flatMap(str -> Optional.of(str.length()));
    }
}
