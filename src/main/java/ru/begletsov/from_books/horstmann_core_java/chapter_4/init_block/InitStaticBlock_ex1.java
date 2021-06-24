package ru.begletsov.from_books.horstmann_core_java.chapter_4.init_block;

/**
 * @Пример Инициализация пар-ов (статических) в статическом инициализационном блоке
 * Важно! инициализация нестатических полей запрещена в static{...}
 * @author Sergei Begletsov
 * @since 24.06.2021
 * @version 1
 */

public class InitStaticBlock_ex1 {
    private int paramA;
    private static int paramB;

    public InitStaticBlock_ex1() {
        System.out.println("Constructor default");
        paramA = 1;
        paramB = 1;
        System.out.println("paramA = " + paramA);
        System.out.println("paramB = " + paramB);
    }

    static {
        System.out.println("Static block.  BEFORE create OBJECT:");
        paramB = 22;
        System.out.println("paramB = " + paramB);
    }

    public static void main(String[] args) {
        InitStaticBlock_ex1 staticBlock_ex1 = new InitStaticBlock_ex1();
        System.out.println("AFTER CREATE OBJECT:");
        System.out.println("paramA = " + InitStaticBlock_ex1.paramB);
        System.out.println("paramB = " + paramB);
    }
}
