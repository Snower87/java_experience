package ru.begletsov.inheritance;

public class SubClassB extends SubClassA {
    SubClassB() {
        System.out.println("3. Constructor in SubClassA");
    }

    void method_SubClassB() {
        super.another_method();
    }
}
