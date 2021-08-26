package ru.begletsov.basic_java.lambda.lambda1_examples;

import java.util.ArrayList;
import java.util.List;

/** FarmerApple - класс-сервис
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 1
 */

public class FarmerApple {
    private List<Apple> apples;

    public FarmerApple(List<Apple> apples) {
        this.apples = apples;
    }

    public int getCountApples() {
        return apples.size();
    }

    public List<Apple> filterGreenApples() {
        List<Apple>rsl = new ArrayList<>();
        for (Apple apple: apples) {
            if (apple.getColor().equals(Apple.COLOR.GREEN)) {
                rsl.add(apple);
            }
        }
        return rsl;
    }
}
