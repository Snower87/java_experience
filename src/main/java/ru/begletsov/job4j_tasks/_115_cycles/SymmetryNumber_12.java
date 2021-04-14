package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 12. Симметричное число
 * @Описание Метод принимает целочисленное значение. Необходимо проверить является ли оно симметричным или нет.
 * Симметричным считается число которое в котором числа идущие по порядку в прямом и обратном порядке равны друг другу.
 * Для решения можете преобразовать число в строку. Проходите по полученной строке в цикле, до середины и сравниваете
 * символ который стоит на первой позиции  с символом на последней, второй позиции с символом на предпоследней и т.д.
 * Для извлечения символов используйте метод charAt().
 * Метод должен вернуть true, если число симметричное.
 * @author Sergei Begletsov
 * @since 14.04.2021
 * @version 1
 */

public class SymmetryNumber_12 {
    public static boolean check(int i) {
        String strNum = Integer.toString(i);
        for (int j = 0; j < strNum.length(); j++) {
            int indEndStr = strNum.length() - 1 - j;
            if (strNum.charAt(j) != strNum.charAt(indEndStr)) {
                return false;
            }
        }
        return true;
    }
}
