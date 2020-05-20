package domain;

public class Player {
    private final String name;

    public Player(String name) {
        Validator.isValidName(name);
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
