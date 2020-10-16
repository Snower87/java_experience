package ru.begletsov.inheritance;

public class SubClassA extends SuperClass {
    SubClassA() {
        System.out.println("3. Constructor in SubClassA");
    }

    void test_method() {
        System.out.println("4. Method test_method() in SubClassA");
        super.test_method();
        super.another_method();
    }
}
