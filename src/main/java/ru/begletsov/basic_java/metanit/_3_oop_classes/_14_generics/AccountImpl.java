package ru.begletsov.basic_java.metanit._3_oop_classes._14_generics;

public class AccountImpl implements Accountable<String> {
    private String id;
    private int sum;

    public AccountImpl(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }


    @Override
    public String getId() {
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
