package ru.begletsov.inheritance;

public class ConsClass {
    public static void main(String[] args) {
        System.out.println("SubClassA:");
        SubClassA subClassA = new SubClassA();
        subClassA.test_method();
        System.out.println();


        System.out.println("SubClassB:");
        SubClassB subClassB = new SubClassB();
        subClassB.method_SubClassB();
        subClassB.test_method();
    }
}
