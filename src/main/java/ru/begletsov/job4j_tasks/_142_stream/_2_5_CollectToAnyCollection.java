package ru.begletsov.job4j_tasks._142_stream;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Задание 2.5. Сборка элементов. Сборка в произвольную реализацию Collection
 * @Раздел 1.4.2. Stream API
 * @Описание Методы toList(), toSet() формируют нам уже заданную коллекцию. toList() создает ArrayList,
 * toSet() создает HashSet. Если нам нужно использовать заданную нами коллекцию мы можем использовать методы collect()
 * и Collectors.toCollection()
 * Например:
 * - List<Integer> result = List.of(1, 2).stream().collect(Collectors.toCollection(LinkedList::new));
 * В качестве аргумента мы указываем создание пустой коллекции, в которую будут собираться наши значение.
 * В примере выше мы получим реализацию List, но только теперь LinkedList.
 * Ваша задача создать из стрима коллекцию LinkedHashSet
 * @author Sergei Begletsov
 * @since 09.09.2021
 * @version 1
 */

public class _2_5_CollectToAnyCollection {
    public static Set<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
