package ru.begletsov.codewars_task._8_kyu;

import java.util.Set;

/**
 * @task Password Generator (8 kyu)
 *
 * @author Sergei Begletsov
 * @since 22.01.2022
 * @version 1
 */

public class PasswordGenerator {
    private String string;
    private Set<Character> setChar;
    private int numChars;

    public PasswordGenerator(Set<Character> setChar) {
        this.setChar = setChar;
        this.numChars = setChar.size();
    }

    public PasswordGenerator(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Set<Character> getSetChar() {
        return setChar;
    }

    public void setSetChar(Set<Character> setChar) {
        this.setChar = setChar;
    }

    public boolean passwordWrong(String testedString, Set<Character> testedSet) {
        return false;
    }

    public String generatePassword(Set<Character> genSet) {
        return null;
    }
}
