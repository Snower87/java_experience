package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_6_String_to_stream;

/**
 * @Задание Требуется преобразовать String -> Stream и наоборот
 * @Описание Использовать методы по умолчанию chars и codePoints интерфейса java.lang.
 * CharSequence для преобразования String в IntStream. Для обратного преобразования потока в  строку использовать
 * перегруженный вариант метода collect из интерфейса IntStream, который принимает поставщик Supplier, объект BiConsumer,
 * представляющий аккумулятор, и объект BiConsumer, представляющий комбинатор.
 * @author Sergei Begletsov
 * @since 05.09.2021
 * @version 1
 */

public class StrToStream {
    //Пример 3.36 Проверка на палиндром в Java 7 и более ранних версиях
    public boolean isPalindrome7(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            } }
        String forward = sb.toString().toLowerCase();
        String backward = sb.reverse().toString().toLowerCase();
        return forward.equals(backward);
    }

    //Пример 3.37 Проверка на палиндром с помощью потоков Java 8
    public boolean isPalindrome8(String s) {
        String forward = s.toLowerCase().codePoints()
                .filter(Character::isLetterOrDigit)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        String backward = new StringBuilder(forward).reverse().toString();
        return forward.equals(backward);
    }
}
