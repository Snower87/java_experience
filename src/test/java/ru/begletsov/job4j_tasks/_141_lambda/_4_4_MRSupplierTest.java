package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.*;

public class _4_4_MRSupplierTest {
    @Test
    public void test() {
        Supplier<String> supplier = _4_4_MRSupplier.supplier();
        assertEquals("", supplier.get());
    }
}