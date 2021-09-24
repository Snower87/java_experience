package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static ru.begletsov.job4j_tasks._142_stream._9_7_OptionalFilter.Child;
import static ru.begletsov.job4j_tasks._142_stream._9_7_OptionalFilter.Worker;

public class _9_7_OptionalFilterTest {
    @Test
    public void notExistAndNeedChild() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 18);
        Child c3 = new Child("c1", 11);
        Child c4 = new Child("c2", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2));
        Worker worker2 = new Worker("456", List.of(c3, c4));
        assertEquals(List.of(), _9_7_OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void notExistAndChildrenOld() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 18);
        Child c3 = new Child("c1", 20);
        Child c4 = new Child("c2", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2, c3));
        Worker worker2 = new Worker("456", List.of(c4));
        assertEquals(List.of(), _9_7_OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void whenExists() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 13);
        Child c3 = new Child("c1", 10);
        Child c4 = new Child("c2", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2, c3));
        Worker worker2 = new Worker("456", List.of(c4));
        assertEquals(2, _9_7_OptionalFilter.defineChildren(List.of(worker1, worker2), "123").size());
    }
}