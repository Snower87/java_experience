package ru.begletsov.basic_java.metanit._3_oop_classes._15_generics_limits;

public class _15_Limit_Generics_2 {
    public static void main(String[] args) {
        Account acc1 = new Account("1235rwr", 5000);
        Account acc2 = new Account("2373", 4300);
        Transaction<Account> tran1 = new Transaction<Account>(acc1, acc2, 1560);
        tran1.execute();
    }
}

interface Accountable{
    String getId();
    int getSum();
    void setSum(int sum);
}

class AccountImpl implements Accountable {
    private String id;
    private int sum;

    public AccountImpl(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

class TransactionExt<T extends Accountable> {
    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода

    public TransactionExt(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        } else {
            System.out.println("Invalid operation");
        }
    }
}