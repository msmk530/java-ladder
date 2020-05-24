package domain;

import util.RandomBooleanGenerator;

public class RandomBooleanStrategy implements LadderCreatorStrategy {
    @Override
    public boolean generate() {
        return RandomBooleanGenerator.generate();
    }
}
