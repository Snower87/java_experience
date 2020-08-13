package ru.begletsov.exception;

/**
 * Класс FactorialThrows обрабатывает исключения, которые возникают в методах
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 13.08.2020
 * @version 1
 */

public class FactorialThrows {

    /**
     * Получение факториала для числа
     * Метод getFactorial исключение Exception не обрабатывает с помощью try..catch, поэтому в определении метода используется выражение throws Exception.
     * Поэтому при вызове этого метода нам обязательно надо обработать выбрасываемое исключение.
     * @param number число
     * @return факториал или ошибка
     */
    public static int getFactorial(int number) throws Exception{
        if (number < 1) throw new Exception("The number less than 1");
        int rsl = 1;
        for (int i = 1; i < number; i++) {
            rsl *= i;
        }
        return rsl;
    }

    /**
     * Получение факториала для числа (альтернативный метод)
     * Метод getFactorialAlternative обрабатывает исключение Exception самостоятельно с помощью try..catch, поэтому в определении метода НЕ используется выражение throws Exception.
     * И при вызове этого метода НЕ обязательно обработывать выбрасываемое исключение.
     * @param number число
     * @return факториал или ошибка
     */
    public static int getFactorialAlternative(int number){
        int rsl = 1;
        try {
            if (number < 1) throw new Exception("The number less than 1");
            for (int i = 1; i < number; i++) {
                rsl *= i;
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
            System.out.println(", * <- from method getFactorialAlternative()");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            int result11 = getFactorialAlternative(6);
            System.out.println(result11);
            int result12 = getFactorialAlternative(-6);
            System.out.println(result12);

            int result = getFactorial(6);
            System.out.println(result);
            int result2 = getFactorial(-6);
            System.out.println(result2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}
