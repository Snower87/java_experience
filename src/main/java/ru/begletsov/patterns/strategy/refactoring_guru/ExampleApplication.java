package ru.begletsov.patterns.strategy.refactoring_guru;

// Конкретная стратегия выбирается на более высоком уровне,
// например, конфигуратором всего приложения. Готовый объект-
// стратегия подаётся в клиентский объект, а затем может быть
// заменён другой стратегией в любой момент на лету.

public class ExampleApplication {
    public static void main(String[] args) {
        // 1. Создать объект контекста.
        Context context = new Context();
        // 2. Получить первое число (n1).
        int n1 = 10;
        // 3. Получить второе число (n2).
        int n2 = 2;
        // 4. Получить желаемую операцию.
        Strategy action;
        ConcreteStrategyAdd addition = new ConcreteStrategyAdd();
        ConcreteStrategySubtract subtraction = new ConcreteStrategySubtract();
        ConcreteStrategyMultiply multiplication = new ConcreteStrategyMultiply();
        action = addition;
        // 5. Затем, выбрать стратегию:
        context.setStrategy(multiplication);

        if (action == addition) {
            context.setStrategy(new ConcreteStrategyAdd());
        }

        if (action == subtraction) {
            context.setStrategy(new ConcreteStrategySubtract());
        }

        if (action == multiplication) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        // 6. Выполнить операцию с помощью стратегии:
        int result = context.executeStrategy(n1, n2);

        // 7. Вывести результат на экран.
        System.out.println(result);
    }
}
