package ru.begletsov.basic_java.bigdecimal;

import java.math.BigDecimal;

public class CalcBig {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("111.222");
        BigDecimal b = BigDecimal.valueOf(222.333);
        System.out.println("Big a = " + a);
        System.out.println("Big b = " + b);
        System.out.println("Big a + b = " + a.add(b));
        System.out.println("Big a = " + a);
        BigDecimal rsl = a.add(b); //a = a.add(b); //можно так сохранять результат
        System.out.println("Big rsl = " + rsl);
        System.out.println("Big a - b = " + a.subtract(b));
        System.out.println("Big a * b = " + a.multiply(BigDecimal.valueOf(3)));
        System.out.println("Big b = " + b);
        System.out.println("Big b / 4 = " + b.divide(BigDecimal.valueOf((long) 4.244, 0)));
    }
}
