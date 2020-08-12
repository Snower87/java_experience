package ru.begletsov.exception;

/**
 * Класс DogIsNotReadyException свобственный перехватчик исключений
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 12.08.2020
 * @version 1
 */

public class DogIsNotReadyException extends Exception {
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
