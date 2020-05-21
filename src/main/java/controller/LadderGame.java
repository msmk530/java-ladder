package controller;

import domain.*;
import util.RandomBooleanGenerator;
import view.InputView;
import view.OutputView;

public class LadderGame {
    public void run() {
        PlayerRepository playerRepository = InputView.inputPlayersName();
        ResultItems resultItems = InputView.inputResultItems(playerRepository.getNumberOfPlayers());
        int ladderHeight = InputView.inputLadderHeight();

        Ladder ladder = LadderCreator.createLadder(playerRepository, ladderHeight, RandomBooleanGenerator::generate);

        OutputView.printLadder(playerRepository, ladder, resultItems);

        LadderResult ladderResult = new LadderResult(playerRepository, ladder);

    }
}
