package ru.begletsov.basic_java.stream.annimon_com;

import java.util.List;
import java.util.stream.Stream;

/**
 * 13. Советы и best practices
 * ссылка на статью: https://annimon.com/article/2778
 * @author Sergei Begletsov
 * @since 30.09.2021
 * @version 1
 */

public class _13_BestPractices {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 5, 1, 0, 9, 6, 7);
        //1. Если задачу не получается красиво решить стримами, не решайте её стримами.

        //2. Если задачу не получается красиво решить стримами, не решайте её стримами!

        //3. Если задача уже красиво решена не стримами, всё работает и всех всё устраивает, не перерешивайте её стримами!

        //4. В большинстве случаев нет смысла сохранять стрим в переменную. Используйте цепочку вызовов методов (method chaining).
        // Нечитабельно
        Stream<Integer> stream4_1 = list.stream();
        stream4_1 = stream4_1.filter(x -> x > 2);
        System.out.println("Пример 4.1");
        stream4_1.forEach(System.out::println);
        // Так лучше
        System.out.println("Пример 4.2");
        list.stream()
                .filter(x -> x > 2)
                .forEach(System.out::println);

        //5. Старайтесь сперва отфильтровать стрим от ненужных элементов или ограничить его, а потом выполнять преобразования.
        // Лишние затраты
        System.out.println("Пример 5.1");
        list.stream()
                .sorted()
                .filter(x -> x > 0)
                .forEach(System.out::println);
        // Так лучше
        System.out.println("Пример 5.2");
        list.stream()
                .filter(x -> x > 0)
                .sorted()
                .forEach(System.out::println);

        //6. Не используйте параллельные стримы везде, где только можно. Затраты на разбиение элементов, обработку
        // в другом потоке и последующее их слияние порой больше, чем выполнение в одном потоке. Читайте об этом здесь — When to use parallel streams.

        //7. При использовании параллельных стримов, убедитесь, что нигде нет блокирующих операций или чего-то, что
        // может помешать обработке элементов.
        // list.parallelStream()
        //        .filter(s -> isFileExists(hash(s)))
        //        ...

        //8. Если где-то в модели вы возвращаете копию списка или другой коллекции, то подумайте о замене на стримы. Например:
        // Было:
        // class Model {
        //
        //    private final List<String> data;
        //
        //    public List<String> getData() {
        //        return new ArrayList<>(data);
        //    }
        // }
        //
        // Стало:
        // class Model {
        //
        //    private final List<String> data;
        //
        //    public Stream<String> dataStream() {
        //        return data.stream();
        //    }
        // }
        //Теперь есть возможность получить не только список model.dataStream().collect(toList());, но и множество,
        // любую другую коллекцию, отфильтровать что-то, отсортировать и так далее. Оригинальный List<String> data так
        // и останется нетронутым.
    }
}
