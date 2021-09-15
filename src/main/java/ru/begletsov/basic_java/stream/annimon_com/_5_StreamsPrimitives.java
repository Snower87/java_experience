package ru.begletsov.basic_java.stream.annimon_com;

/**
 * 5. Стримы для примитивов
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 15.09.2021
 * @version 1
 */

public class _5_StreamsPrimitives {
    public static void main(String[] args) {
        // Кроме объектных стримов Stream<T>, существуют специальные стримы для примитивных типов:
        // - IntStream для int,
        // - LongStream для long,
        // - DoubleStream для double.
        // Для boolean, byte, short и char специальных стримов не придумали, но вместо них можно использовать IntStream,
        // а затем приводить к нужному типу. Для float тоже придётся воспользоваться DoubleStream.
        // Примитивные стримы полезны, так как не нужно тратить время на боксинг/анбоксинг, к тому же у них есть ряд
        // специальных операторов, упрощающих жизнь.
    }
}
