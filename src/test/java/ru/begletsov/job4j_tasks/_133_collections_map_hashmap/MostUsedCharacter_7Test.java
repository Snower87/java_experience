package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MostUsedCharacter_7Test {
    @Test
    public void getMaxCount() {
        String str = "Мама мыла раму";
        char rsl = MostUsedCharacter_7.getMaxCount(str);
        char expected = 'а';
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxCount1() {
        String ln = System.lineSeparator();
        String str = "Мой дядя самых честных правил "
                + "Когда не в шутку занемог "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог "
                + "Его пример другим наука "
                + "Но боже мой какая скука "
                + "С больным сидеть и день и ночь "
                + "Не отходя ни шагу прочь "
                + "Какое низкое коварство "
                + "Полуживого забавлять "
                + "Ему подушки поправлять "
                + "Печально подносить лекарство "
                + "Вздыхать и думать про себя "
                + "Когда же черт возьмет тебя";
        char rsl = MostUsedCharacter_7.getMaxCount(str);
        char expected = 'о';
        assertThat(rsl, is(expected));
    }
}