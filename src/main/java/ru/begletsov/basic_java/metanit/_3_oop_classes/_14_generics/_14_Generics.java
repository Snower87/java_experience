package ru.begletsov.basic_java.metanit._3_oop_classes._14_generics;

public class _14_Generics {
    public static void main(String[] args) {
        Account<Integer> acc1 = new Account<>(2334, 5000); //id - число
        Integer acc1Id = acc1.getId();
        System.out.println(acc1Id);

        //получим ошибку java.lang.ClassCastException
        Account<String> acc2 = new Account<String>("sid5523", 5000); //id - строка
        String acc2Id = acc2.getId();
        System.out.println(acc2Id);

        Accountable<String> acc3 = new AccountImpl("123sre", 3500);
        AccountImpl acc4 = new AccountImpl("345www", 2333);
        System.out.println(acc3.getId());
        System.out.println(acc4.getId());

        Accountable<String> acc5 = new AccountImpl2<>("xaxaxa", 1);
        AccountImpl2 acc6 = new AccountImpl2("333", 333);
        System.out.println(acc5.getId());
        System.out.println(acc6.getId());
    }
}

class Account<T> {
    private T id;  //id - уникальный идентификатор счета
    private int sum; //sum - сумма на счете

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}