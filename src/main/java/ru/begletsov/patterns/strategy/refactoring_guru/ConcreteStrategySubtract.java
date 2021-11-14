package ru.begletsov.patterns.strategy.refactoring_guru;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
