package ru.begletsov.inheritance;

/**
 * Супер-Класс SuperClass для других подклассов, практика вызова метода вышестоящего класса
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 16.10.2020
 * @version 1
 */

public class SuperClass {
    SuperClass() {
        System.out.println("1. Constructor in SuperClass");
    }

    void test_method() {
        System.out.println("2. Method test_method() in SuperClass");
    }

    void another_method() {
        System.out.println("9. Method another_method() in SuperClass");
    }
}