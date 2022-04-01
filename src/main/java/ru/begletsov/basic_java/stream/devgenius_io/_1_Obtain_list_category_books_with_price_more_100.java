package ru.begletsov.basic_java.stream.devgenius_io;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise 1 — Obtain a list of products contains to category “Books” with price > 100
 * This is obviously a filtering logic, the output should fulfill the two filtering requirements. So, you can apply 2 filter() operations to obtain the result.
 * ссылка на статью: https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82
 * @author Sergei Begletsov
 * @since 31.03.2022
 * @version 1
 */

public class _1_Obtain_list_category_books_with_price_more_100 {
    public static void main(String[] args) {
        Customer PetyaSidorov = new Customer(1, "Petya Sidorov", 3);
        Customer VovaPetrov = new Customer(2, "Vova Petrov", 2);
        Customer SergBespalov = new Customer(3, "Serg Bespalov", 1);

        List<Product> productList = List.of(
                new Product(1, "voina i mir", "book", 95.0),
                new Product(2, "prestuplemie i nakazanie", "book", 120.0),
                new Product(3, "best books", "book", 80.0),
                new Product(4, "best books (ep.2)", "book", 110.0),
                new Product(5, "iPhone 5 S", "telephone", 1250.0),
                new Product(6, "Samsung Galaxy 03A 2/32", "telephone", 1250.0),
                new Product(7, "i5 10400f", "processor", 2200.0)
        );

        List<Product> result = productList.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("book"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());

        System.out.println(result.stream().map(product -> product.getName()).collect(Collectors.toList()));
        System.out.println(result.stream().map(product -> product.getName()).collect(Collectors.joining(", ")));
    }
}
