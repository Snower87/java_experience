package ru.begletsov.job4j_tasks._111_first_programm;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CongratulateYourselfForWork_32Test {
    @Test
    public void checkPraise() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CongratulateYourselfForWork_32.main(null);
        assertThat(out.toString(), is("Сегодня я молодец!" + System.lineSeparator()));
    }
}