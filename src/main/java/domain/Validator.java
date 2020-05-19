package domain;

import exception.Player.LengthOfNameException;

public class Validator {
    private static final int MAX_LENGTH_OF_NAME = 5;
    private static final int MIN_LENGTH_OF_NAME = 1;

    private Validator() {
        throw new AssertionError();
    }

    public static void isValidName(String name) {
        if (name.length() > MAX_LENGTH_OF_NAME || name.length() < MIN_LENGTH_OF_NAME) {
            throw new LengthOfNameException();
        }
    }
}
