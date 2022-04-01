package ru.begletsov.basic_java.stream.devgenius_io;

public class Customer {
    private Integer id;

    private String name;
    private Integer tier;

    public Customer(Integer id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTier() {
        return tier;
    }
}
