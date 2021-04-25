package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Initials_40Test {
    @Test
    public void testFIOIvanov() {
        assertEquals("Иванов И.И.", Initials_40.convert(new String[] {"Иванов", "Иван", "Иваныч"}));
    }

    @Test
    public void testFIOGrigoriev() {
        assertEquals("Григорьев И.Н.", Initials_40.convert(new String[] {"Григорьев", "Игорь", "Николаевич"}));
    }
}