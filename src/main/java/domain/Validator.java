package domain;

import exception.Item.CountOfItemsException;
import exception.Item.LengthOfItemException;
import exception.Ladder.LengthOfHeightException;
import exception.Player.DuplicateNameOfPlayerException;
import exception.Player.LengthOfNameException;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private static final int MAX_LENGTH_OF_NAME = 5;
    private static final int MIN_LENGTH_OF_NAME = 1;
    private static final int MIN_LENGTH_OF_ITEM = 1;

    private Validator() {
        throw new AssertionError();
    }

    public static void isValidName(String name, List<Player> players) {
        List<String> playersName = new ArrayList<>();

        for (Player player : players) {
            playersName.add(player.getName());
        }

        if (name.length() > MAX_LENGTH_OF_NAME || name.length() < MIN_LENGTH_OF_NAME) {
            throw new LengthOfNameException();
        }

        if (playersName.contains(name)) {
            throw new DuplicateNameOfPlayerException();
        }
    }

    public static void checkResultItems(List<String> items, int numberOfPlayers) {
        if (items.size() != numberOfPlayers) {
            throw new CountOfItemsException();
        }

        for (String item : items) {
            checkItemLength(item);
        }
    }

    private static void checkItemLength(String item) {
        if (item.length() < MIN_LENGTH_OF_ITEM) {
            throw new LengthOfItemException();
        }
    }

    public static void isValidHeight(int height) {
        if (height < 1) {
            throw new LengthOfHeightException();
        }
    }
}
