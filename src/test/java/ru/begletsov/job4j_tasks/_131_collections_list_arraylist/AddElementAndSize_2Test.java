package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddElementAndSize_2Test {
    @Test
    public void addNewElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = AddElementAndSize_2.addNewElement(list, "fourth");
        assertThat(result, is(true));
    }
}