package ru.begletsov.codewars_task._6_kyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootTest {
    @Test
    public void Test2() {
        assertEquals( "Nope!" , 2, DRoot.digital_root(2));
    }

    @Test
    public void Test16() {
        assertEquals( "Nope!" , 7, DRoot.digital_root(16));
    }

    @Test
    public void Test456() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }

    @Test
    public void Test942() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(942));
    }

    @Test
    public void Test132189  () {
        assertEquals( "Nope!" , 6, DRoot.digital_root(132189));
    }

    @Test
    public void Test493193() {
        assertEquals( "Nope!" , 2, DRoot.digital_root(493193));
    }
}