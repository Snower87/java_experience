package ru.begletsov.job4j_tasks._134_sorting;

/**
 * @Задание 1.0. Получение компаратора. Метод compare()
 * @Раздел 1.3.4. Сортировка
 * @Описание Базовым методом для создания компаратора является метод Comparator.compare(). Он принимает два объекта
 * которые нужно сравнить. Этот метод, как и метод compareTo() у интерфейса Comparable, возвращает число типа int.
 * Почему именно число? Что его значение значит?
 * Возвращает именно число, потому что с помощью него можно легко представить три состояния: "меньше", "больше", "равно",
 * соответственно, для отрицательного, положительного чисел, а также 0.
 * По числу мы можем определить порядок элементов. Именно порядок, порядок важен потому что компараторы используются
 * при сортировках, в которых важно знать, какой порядок мы хотим получить.
 * Рассмотрим метод Integer.compare(число1, число2):
 * - если результат отрицательный, то это значит, число1 идет раньше чем число2. Например, Integer.compare(1, 2) = -1.
 * - если результат равен 0, то это значит, что порядок не важен. Например, Integer.compare(1, 1) = 0
 * - если результат положительный, то это значит, что число1 идет после числа2. Например, Integer.compare(2, 1) = 1
 * Ваша задача написать два метода которые сравнивают два числа, первый сравнивает в прямом порядке, второй в обратном
 * порядке. Т.е. первый должен быть аналогичен Integer.compare(), а второй должен возвращать обратным ему результат.
 * @author Sergei Begletsov
 * @since 24.05.2021
 * @version 1
 */

public class CompareMethod_1_0 {
    public static int ascendingCompare(int first, int second) {
        boolean compare = first == second ? true : false;
        if (compare) {
            return 0;
        }
        return first > second ? 1 : -1;
    }

    public static int descendingCompare(int first, int second) {
        boolean compare = first == second ? true : false;
        if (compare) {
            return 0;
        }
        return first > second ? -1 : 1;
    }
}
