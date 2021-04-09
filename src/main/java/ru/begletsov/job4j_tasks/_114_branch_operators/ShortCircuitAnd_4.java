package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 4. Операторы & и &&. Операторы | и ||
 * @Описание Операторы & и && - очень похожи, также как и операторы | и ||. Так в чем же разница?
 * & и | это побитовые операции. Бинарное умножение и сумма соответственно. Сколько операндов нужно для умножение и сложения? Два, а их еще нужно рассчитать.
 * Поэтому если писать так, то оба выражения будут рассчитываться всегда.
 *      if (showA() & showB()) {
 *
 *      }
 * Методы
 * public static boolean showA() {
 *     System.out.println("A");
 *     return false;
 * }
 * public static boolean showB() {
 *     System.out.println("B");
 *     return false;
 * }
 * Обратите внимание методы возвращают false. Не смотря на это всегда будет выведено "AB".
 * Если написать &&, то будет выведено только "A", потому что первое выражение вернуло false. Дело в том, что компилятор оптимизирует выражения. Если вернулось false, то уже не имеет смысла проверять дальше. Аналогично true для ||
 * !!! Запомните, всегда пишите && и || в логических выражениях
 * Ниже приведен код. Его нужно поправить
 * @author Sergei Begletsov
 * @since 09.04.2021
 * @version 1
 */

public class ShortCircuitAnd_4 {
    public static boolean showA() {
        System.out.println("A");
        return false;
    }

    public static boolean showB() {
        System.out.println("B");
        return false;
    }

    public static void main(String[] args) {
        if (showA() && showB()) {

        }
    }
}
