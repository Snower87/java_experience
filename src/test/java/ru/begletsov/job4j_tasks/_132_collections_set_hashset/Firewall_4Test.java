package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Firewall_4Test {
    @Test
    public void checkName() {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Создание многомодульного Gradle проекта SpringBoot + Angular в IDEA";
        String rsl = Firewall_4.checkName(s, words);
        assertThat(rsl, is("Вы сделали правильный выбор!"));
    }

    @Test
    public void checkNameFalse() {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Криштиану Роналду опубликовал новую фотографию с детьми в instagram";
        String rsl = Firewall_4.checkName(s, words);
        assertThat(rsl, is("Выберите другую статью..."));
    }
}