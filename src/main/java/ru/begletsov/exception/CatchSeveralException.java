package ru.begletsov.exception;

/**
 * Класс CatchSeveralException с обработчиком нескольких исключений
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 12.08.2020
 * @version 1
 */

public class CatchSeveralException {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            numbers[6] = Integer.parseInt("afdgs");
            throw new Exception();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива");
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка преобразования из строки -> в число");
        } catch (Exception e) {
            System.out.println("Все остальные ошибки");
        }
    }
}
