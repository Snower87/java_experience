package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;

/**
 * @Задание 5.5. Промежуточные операции. Метод mapToInt(). Сумма кодов символов
 * @Раздел 1.4.2. Stream API
 * @Описание Стримы примитивов содержат некоторые полезные терминальные операции. Иногда может потребоваться вызвать
 * один из методов. Но что делать, если у нас стрим объектов? Мы можем преобразовать стрим объектов в стрим примитивов,
 * используя методы mapToInt(), mapToDouble(), mapToLong(). Соответственно, в IntStream, DoubleStream, LongStream.
 * Работают эти методы аналогично map()
 * Ваша задача преобразовать стрим Character в IntStream, т.е. в стрим кодов символов, и получить сумму этих кодов.
 * Код символа можно получить так:
 * int code = (int) 'a';
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _5_5_MapToIntMethod {
    public static long sum(List<Character> characters) {
        return characters.stream()
                .mapToLong(Character::charValue).sum();
    }
}
