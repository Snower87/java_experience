package ru.begletsov.config;

/**
 * Класс JavaProjectConfig для констант, используемых в проекте
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 24.07.2020
 * @version 1
 */

public class JavaProjectConfig {
    // общедоступное статическое неизменяемое строковое поле
    public static final String PROJECT_PATH = "/home/example.ru";

    // общедоступное статическое неизменяемое строковое поле
    public static final double PROJECT_COST  = 125250.50;
    public static final int PROJECT_VERSION = 0x010;

    public static void showAllConst() {
        System.out.println("PROJECT_COST " + PROJECT_COST);
        System.out.println("JavaProjectConfig.PROJECT_COST: " + JavaProjectConfig.PROJECT_COST);
        System.out.println("JavaProjectConfig.PROJECT_PATH: " + JavaProjectConfig.PROJECT_PATH);
        System.out.println("JavaProjectConfig.PROJECT_VERSION: " + JavaProjectConfig.PROJECT_VERSION);
    }

    public static void main(String[] args) {
        JavaProjectConfig.showAllConst();
    }
}
