package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;

/**
 * @Задание 0.3. Понятие редукции. Метод reduce(). Произведение чисел
 * @Раздел 1.4.2. Stream API
 * @Описание В Stream есть метод reduce(BinaryOperator<T> operator). Этот метод находит первый элемент стрима,
 * он становится результатом, а потом уже начинает применять оператор к последующим элементам.
 * Это поведение, описывает документация:
 *      boolean foundAny = false;
 *      T result = null;
 *      for (T element : this stream) {
 *          if (!foundAny) {
 *              foundAny = true;
 *              result = element;
 *          }
 *          else
 *              result = accumulator.apply(result, element);
 *      }
 *      return foundAny ? Optional.of(result) : Optional.empty();
 * Пример:
 * - Integer sum = List.of(1, 2, 3).stream().reduce((n1, n2) -> n1 + n2).get(); // сумма 6
 * - Integer sum = List.of(1).stream().reduce((n1, n2) -> n1 + n2).get(); // сумма 1, т.к. найдем только один элемент
 * Ваша задача найти произведение чисел, используя данный метод. Размер списка всегда больше 0
 * @author Sergei Begletsov
 * @since 27.09.2021
 * @version 1
 */

public class _0_3_ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream()
                .reduce((acc, element) -> acc * element)
                .get();
    }
}
