package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private static final int START_POINT = 0;

    private final List<Line> ladder;

    public Ladder(List<Line> ladder) {
        this.ladder = ladder;
    }

    public List<Integer> playLadderGame(PlayerRepository playerRepository) {
        List<Integer> resultItemNumbers = new ArrayList<>();

        for (int point = 0; point < playerRepository.getNumberOfPlayers(); point++) {
            int resultAtPoint = goDown(point);
            resultItemNumbers.add(resultAtPoint);
        }

        return resultItemNumbers;
    }

    private int goDown(int point) {
        int itemNumber = point;

        for (int i = 0; i < ladder.size(); i++) {
            itemNumber = updateItemNumber(i, itemNumber);
        }

        return itemNumber;
    }

    private int updateItemNumber(int lineNumber, int itemNumber) {
        int updateNumber = itemNumber;

        if (ladder.get(lineNumber).checkHorizonFlag(updateNumber)) {
            updateNumber++;
            return updateNumber;
        }

        return checkStratPoint(lineNumber, updateNumber);
    }

    private int checkStratPoint(int lineNumber, int updateNumber) {
        if (updateNumber == START_POINT) {
            return updateNumber;
        }

        return checkPreviousPoint(lineNumber, updateNumber);
    }

    private int checkPreviousPoint(int lineNumber, int updateNumber) {
        if (ladder.get(lineNumber).checkHorizonFlag(updateNumber - 1)) {
            updateNumber--;
            return updateNumber;
        }

        return updateNumber;
    }


    public Line getLine(int point) {
        return ladder.get(point);
    }

    public int getHeight() {
        return ladder.size();
    }
}
