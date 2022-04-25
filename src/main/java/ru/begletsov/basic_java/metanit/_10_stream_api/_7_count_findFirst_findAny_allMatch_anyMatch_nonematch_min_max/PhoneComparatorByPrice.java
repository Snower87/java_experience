package ru.begletsov.basic_java.metanit._10_stream_api._7_count_findFirst_findAny_allMatch_anyMatch_nonematch_min_max;

import ru.begletsov.basic_java.metanit._10_stream_api.Phone;

import java.util.Comparator;

public class PhoneComparatorByPrice implements Comparator<Phone> {

    @Override
    public int compare(Phone phone1, Phone phone2) {
        //Вариант 1:
        //return phone1.getPrice() - phone2.getPrice();

        //Вариант 2:
        if (phone1.getPrice() > phone2.getPrice()) {
            return 1;
        }
        return -1;
    }
}
