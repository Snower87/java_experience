package ru.begletsov.exception;

/**
 * Класс IndexOutException перехватывает исключение выхода индекса за допустимый диапазон
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 12.08.2020
 * @version 1
 */

public class IndexOutException {
    public static void main(String[] args) {
        int[] massData = new int[] {0, 1, 2, 3, 4};
        for (int ind = -1; ind < massData.length + 1; ind++) {
            try {
                System.out.println("index = " + ind);
                System.out.println("massData = " + massData[ind]);
            } catch (IndexOutOfBoundsException iob) {
                System.out.println("Inside block catch, EXCEPTION!");
            } finally {
                System.out.println("Inside block finally");
            }
            System.out.println("--------------------");
        }
    }
}
