package ru.begletsov.class_test.modif_access_to_class;

/**
 * Класс ConsoleMain создание объектов с закрытыми/открытыми модификаторами для конструкторов классов
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 16.10.2020
 * @version 1
 */

public class ConsoleMain {
    public static void main(String[] args) {
        //PublicClass publicClass = new PublicClass();
        PrivateClass privateClass = new PrivateClass();
    }
}
