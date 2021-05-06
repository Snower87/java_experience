package ru.begletsov.basic_java.recursion;

/**
 * Рекурсивные функции java
 * @Описание Рекурсивные функции java. Что это? Описание, разбор алгоритма
 * ссылка на статью javarush: https://javarush.ru/groups/posts/1895-rekursija-v-java
 * Рекурсивные функции в java – это функции, которые вызывают сами себя.
 * 2 важных для понимания рекурсии определения:
 * 1) Базис рекурсии – условие выхода из блока рекурсивных вызовов – базисное решение задачи, при условиях, когда нет
 * необходимости вызывать рекурсию.
 * 2) Шаг рекурсии – вызов функцией самой себя при изменении параметров.
 * @author from Internet
 * @since 06.05.2021
 * @version 1
 */

public class JavaRushExample {
    /**
     * Расчет значения факториала через цикл for
     * @param num число для которого считает факториал
     * @return значение факториала числа
     */
    public static int fact(int num) {
        if (num < 0) {
            System.out.println("Зачем тебе факториал < 0 ?");
        }
        int result = 1;
        if (num == 0) {
            return result;
        }
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Расчет значения факториала через рекурсию
     * @param num число для которого считает факториал
     * @return значение факториала числа
     */
    public static int factRecursion(int num) {
        if (num < 0) {
            System.out.println("Зачем тебе факториал отрицательного числа?");
            return 0;
        }

        int result = 1;
        if (num == 0 || num == 1) {
            return result;
        }
        result = num * factRecursion(num - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Вычисление факториала через метод:");
        System.out.println(JavaRushExample.fact(3));
        System.out.println("Вычисление факториала с помощью рекурсии:");
        System.out.println(JavaRushExample.factRecursion(-1));
        System.out.println(JavaRushExample.factRecursion(0));
        System.out.println(JavaRushExample.factRecursion(1));
        System.out.println(JavaRushExample.factRecursion(2));
        System.out.println(JavaRushExample.factRecursion(3));
        System.out.println(JavaRushExample.factRecursion(4));
    }
}
