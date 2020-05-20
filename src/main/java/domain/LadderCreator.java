package domain;

import util.RandomBooleanGenerator;

import java.util.ArrayList;
import java.util.List;

public class LadderCreator {


    public static Ladder createLadder(PlayerRepository playerRepository, int ladderHeight) {
        List<Line> ladder = new ArrayList<>();

        for (int i = 0; i < ladderHeight; i++) {
            ladder.add(new Line(createOneLine(playerRepository.getNumberOfPlayers())));
        }

        return new Ladder(ladder);
    }

    private static List<Boolean> createOneLine(int numberOfPlayer) {
        List<Boolean> points = new ArrayList<>();
        boolean horizonFlag = false;

        for (int i = 0; i < numberOfPlayer; i++) {
            horizonFlag = createHorizonFlag(i, numberOfPlayer, horizonFlag);
            points.add(horizonFlag);
        }

        return points;
    }

    private static boolean createHorizonFlag(int targetPoint, int numberOfPlayer, boolean prevHorizonFlag) {
        if (prevHorizonFlag || targetPoint == numberOfPlayer - 1) {
            return false;
        }

        return RandomBooleanGenerator.generate();
    }
}
