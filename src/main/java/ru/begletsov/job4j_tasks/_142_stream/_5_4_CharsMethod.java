package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 5.4. Промежуточные операции. Метод mapToObj(). Стрим из символов строки
 * @Раздел 1.4.2. Stream API
 * @Описание map() возвращает стрим, того же типа (в смысле стрим объектов или стрим примитивов). Если мы вызовем map()
 * для стрима объектов, мы получим стрим из объектов. Если мы вызовем map() для стрима примитивов IntStream, мы получим стрим IntStream.
 * Если нам нужно преобразовать стрим примитивов в стрим объектов, мы можем использовать метод mapToObj(),
 * работает он так же как и map().
 * Из символов строки можно получим стрим, используя метод chars() в классе String. Но этот стрим возвращает нам IntStream.
 * Ваша задача преобразовать стрим, который вернет chars(), в стрим Character и собрать в список.
 * IntStream будет содержать коды символы. Чтобы получить символ мы можем сделать так:
 * Character c = (char) 91;
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _5_4_CharsMethod {
    public static List<Character> symbols(String string) {
        return string.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList());
    }
}
