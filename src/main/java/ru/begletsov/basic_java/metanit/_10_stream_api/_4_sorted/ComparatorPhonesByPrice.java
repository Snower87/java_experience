package ru.begletsov.basic_java.metanit._10_stream_api._4_sorted;

import ru.begletsov.basic_java.metanit._10_stream_api.Phone;

import java.util.Comparator;

public class ComparatorPhonesByPrice implements Comparator<Phone> {

    @Override
    public int compare(Phone phone1, Phone phone2) {
        return phone1.getPrice() - phone2.getPrice();
    }
}
