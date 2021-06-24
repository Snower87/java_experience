package ru.begletsov.from_books.horstmann_core_java.chapter_4.init_block;

/**
 * @Пример Инициализация пар-ов (статических и нестатических) в нестатическом инициализационном блоке
 * Важно! в {...} возможно инициализация как статических, так и нестатических полей
 * @author Sergei Begletsov
 * @since 24.06.2021
 * @version 1
 */

public class InitNonStaticBlock_ex2 {
    private int paramA;
    private static int paramB;

    public InitNonStaticBlock_ex2() {
        System.out.println("Constructor default");
        paramA = 1;
        paramB = 1;
        System.out.println("paramA = " + paramA);
        System.out.println("paramB = " + paramB);
    }

    {
        System.out.println("NonStatic block. BEFORE create OBJECT:");
        paramA = 22;
        paramB = 22;
        System.out.println("paramA = " + paramA);
        System.out.println("paramB = " + paramB);
    }

    public static void main(String[] args) {
        InitNonStaticBlock_ex2 initNonStaticBlock_ex2 = new InitNonStaticBlock_ex2();
        System.out.println("AFTER CREATE OBJECT:");
        System.out.println("paramA = " + initNonStaticBlock_ex2.paramB);
        System.out.println("paramB = " + paramB);
    }
}
