package ru.begletsov.patterns.builder.builder1;

/** "ConcreteBuilder" */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough()   { pizza.setDough("cross"); }
    public void buildSauce()   { pizza.setSauce("mild"); }
    public void buildTopping() { pizza.setTopping("ham+pineapple"); }
}
