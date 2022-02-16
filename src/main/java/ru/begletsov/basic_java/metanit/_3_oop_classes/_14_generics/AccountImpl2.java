package ru.begletsov.basic_java.metanit._3_oop_classes._14_generics;

public class AccountImpl2<T> implements Accountable<T> {
    private T id;
    private int sum;

    public AccountImpl2(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
}
