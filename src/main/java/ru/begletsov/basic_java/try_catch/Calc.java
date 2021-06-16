package ru.begletsov.basic_java.try_catch;

public class Calc {
    //unchecked Exception (Runtime Exception), без throws в сигнатуре метода
    public static double uncheckCalculate(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b == 0! uncheck");
        }
        return a/b;
    }

    //checked Exception
    public static double checkCalculate(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("b == 0! check");
        }
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("== Start main ==");
        try {
            Calc.checkCalculate(10, 2);
            Calc.checkCalculate(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Calc.uncheckCalculate(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Calc.uncheckCalculate(10, 1);
        System.out.println("== End main ==");
    }
}
