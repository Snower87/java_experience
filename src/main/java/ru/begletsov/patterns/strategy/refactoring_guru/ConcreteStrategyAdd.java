package ru.begletsov.patterns.strategy.refactoring_guru;

// Каждая конкретная стратегия реализует общий интерфейс своим
// способом.

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
