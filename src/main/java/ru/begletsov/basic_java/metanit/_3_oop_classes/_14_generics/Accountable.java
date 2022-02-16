package ru.begletsov.basic_java.metanit._3_oop_classes._14_generics;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
