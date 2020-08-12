package ru.begletsov.exception;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Класс StringException перехватывает исключение нулевой строки (NullPointerException)
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 12.08.2020
 * @version 1
 */

public class StringException {
    public void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: 'str' is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        StringException strException = new StringException();
        List<String> list = Arrays.asList("First str", null, "Third str");

        for (String s: list) {
            try {
                strException.print(s);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was caught");
            } finally {
                System.out.println("Inside block finally");
            }
            //System.out.println(s.length());
            System.out.println("Go programm...");
            System.out.println("---------------------");
        }
    }
}
