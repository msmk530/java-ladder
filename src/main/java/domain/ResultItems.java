package domain;

import java.util.List;

public class ResultItems {
    private final List<String> items;

    public ResultItems(List<String> items, int numberOfPlayers) {
        Validator.checkResultItems(items, numberOfPlayers);

        this.items = items;
    }
}