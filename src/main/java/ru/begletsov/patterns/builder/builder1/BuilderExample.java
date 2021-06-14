package ru.begletsov.patterns.builder.builder1;

/**
 * Строитель (англ. Builder) — порождающий шаблон проектирования предоставляет способ создания составного объекта.
 * Цель: Отделяет конструирование сложного объекта от его представления так, что в результате одного и того же процесса
 * конструирования могут получаться разные представления.
 */

/** A customer ordering a pizza. */
public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza1 = waiter.getPizza();
        System.out.println(pizza1);

        waiter.setPizzaBuilder(new SpicyPizzaBuilder());
        waiter.constructPizza();
        Pizza pizza2 = waiter.getPizza();
        System.out.println(pizza2);
    }
}
