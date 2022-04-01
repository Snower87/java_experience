package ru.begletsov.basic_java.stream.devgenius_io;

import java.util.Set;

public class Product {
    private Integer id;

    private String name;
    private String category;
    private Double price;

    //private Set<Order> orders;

    public Product(Integer id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }
}
