package ru.begletsov.patterns.strategy.refactoring_guru;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
