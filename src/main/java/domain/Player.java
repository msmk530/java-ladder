package domain;

import java.util.List;
import java.util.Map;

public class Player {
    private final String name;

    public Player(String name) {
        Validator.isValidName(name);
        this.name = name;
    }

    public Map<String, Integer> matchItem(Map<String, Integer> result, List<Integer> matchedItems ,int point) {
        result.put(name,matchedItems.get(point));
        return result;
    }

    public String getName(){
        return name;
    }
}
