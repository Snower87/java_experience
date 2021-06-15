package ru.begletsov.patterns.singleton.single1;

/**
 * Одиночка (англ. Singleton) — порождающий шаблон проектирования, гарантирующий, что в однопоточном приложении будет
 * единственный экземпляр некоторого класса, и предоставляющий глобальную точку доступа к этому экземпляру.
 * Цель: У класса есть только один экземпляр, и он предоставляет к нему глобальную точку доступа. При попытке создания
 * данного объекта он создаётся только в том случае, если ещё не существует, в противном случае возвращается ссылка
 * на уже существующий экземпляр и нового выделения памяти не происходит.
 * Пример на языке Java 1.6: без внутренних классов (ленивая несинхронизированная реализация)
 */

public class AppSingleton1 {
    public static void createObjSingleton() {
        System.out.println("<< Method createObjSingleton(): >>");
        Singleton1 singleton1 = new Singleton1();
        if (singleton1 == null) {
            System.out.println("Obj singleton1 is null!");
        } else {
            System.out.println(singleton1);
            System.out.println(Singleton1.getInstance());
        }

        System.out.println("Integer number");
        Integer number = 10;
        System.out.println(number);
        number = 20;
        System.out.println(number);

        System.out.println("String string");
        String string = new String("stroka");
        System.out.println(string);
        string = new String("aaa");
        System.out.println(string);
        System.out.println();
    }

    public static void alreadyExistObjSingleton() {
        System.out.println("<< Method alreadyExistObjSingleton(): >>");
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton1);
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton2);
    }

    public static void main(String[] args) {
        createObjSingleton();
        alreadyExistObjSingleton();
    }
}
