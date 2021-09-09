package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_8_Summary_statistics;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @Задание Требуется найти количество, сумму, минимум, максимум и среднее значение потока числовых элементов.
 * @Описание Использовать метод summaryStatistics, имеющийся в  интерфейсах  IntStream, DoubleStream и LongStream.
 * @author Sergei Begletsov
 * @since 09.09.2021
 * @version 1
 */

public class SummaryStatistics {
    public static void main(String[] args) {
        //Пример 3.42 Сводные статистики
        System.out.println("Example 3.42: ");
        DoubleSummaryStatistics stats = DoubleStream.generate(Math::random)
                .limit(1_000_000)
                .summaryStatistics();
        System.out.println(stats); //count=1000000, sum=499530,968592, min=0,000003, average=0,499531, max=1,000000
        System.out.println("count: " + stats.getCount());
        System.out.println("min : " + stats.getMin());
        System.out.println("max : " + stats.getMax());
        System.out.println("sum : " + stats.getSum());
        System.out.println("ave : " + stats.getAverage());

        //Пример 3.44 Метод collect с поставщиком, аккумулятором и комбинатором
        /*
        DoubleSummaryStatistics teamStats = teams.stream()
                .mapToDouble(Team::getSalary)
                .collect(DoubleSummaryStatistics::new,
                        DoubleSummaryStatistics::accept,
                        DoubleSummaryStatistics::combine);
        */
    }
}
