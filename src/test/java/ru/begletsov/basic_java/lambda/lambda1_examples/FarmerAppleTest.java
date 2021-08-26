package ru.begletsov.basic_java.lambda.lambda1_examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FarmerAppleTest {
    @Test
    public void whenWait2GreenApple() {
        List<Apple> list = Arrays.asList(
                new Apple(Apple.COLOR.RED, 1),
                new Apple(Apple.COLOR.GREEN, 2),
                new Apple(Apple.COLOR.RED, 3),
                new Apple(Apple.COLOR.RED, 4),
                new Apple(Apple.COLOR.GREEN, 5)
        );
        List<Apple> expected = Arrays.asList(
                new Apple(Apple.COLOR.GREEN, 2),
                new Apple(Apple.COLOR.GREEN, 5)
        );
        assertThat(new FarmerApple(list).filterGreenApples(), is(expected));
        assertThat(new FarmerApple(list).filterGreenApples().size(), is(2));
    }

    @Test
    public void whenWait3RedAppleParamColor() {
        List<Apple> list = Arrays.asList(
                new Apple(Apple.COLOR.RED, 1),
                new Apple(Apple.COLOR.GREEN, 2),
                new Apple(Apple.COLOR.RED, 3),
                new Apple(Apple.COLOR.RED, 4),
                new Apple(Apple.COLOR.GREEN, 5)
        );
        List<Apple> expected = Arrays.asList(
                new Apple(Apple.COLOR.RED, 1),
                new Apple(Apple.COLOR.RED, 3),
                new Apple(Apple.COLOR.RED, 4)
        );
        assertThat(new FarmerApple(list).filterGreenApples(Apple.COLOR.RED), is(expected));
    }

    @Test
    public void testGetGreenApples() {
        List<Apple> list = Arrays.asList(
                new Apple(Apple.COLOR.RED, 1),
                new Apple(Apple.COLOR.GREEN, 2),
                new Apple(Apple.COLOR.RED, 3),
                new Apple(Apple.COLOR.RED, 4),
                new Apple(Apple.COLOR.GREEN, 5)
        );
        int sizeGreenApplesExpected = 2;
        assertThat(new FarmerApple(list).getGreenApples(), is(sizeGreenApplesExpected));
    }

    @Test
    public void testGetRedApples() {
        List<Apple> list = Arrays.asList(
                new Apple(Apple.COLOR.RED, 1),
                new Apple(Apple.COLOR.GREEN, 2),
                new Apple(Apple.COLOR.RED, 3),
                new Apple(Apple.COLOR.RED, 4),
                new Apple(Apple.COLOR.GREEN, 5)
        );
        int sizeRedApplesExpected = 3;
        assertThat(new FarmerApple(list).getRedApples(), is(sizeRedApplesExpected));
    }
}