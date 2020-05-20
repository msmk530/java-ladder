package controller;

import domain.*;
import view.InputView;
import view.OutputView;

public class LadderGame {
    public void run() {
        PlayerRepository playerRepository = InputView.inputPlayersName();
        ResultItems resultItems = InputView.inputResultItems(playerRepository.getNumberOfPlayers());
        int ladderHeight = InputView.inputLadderHeight();

        Ladder ladder = LadderCreator.createLadder(playerRepository, ladderHeight);

        OutputView.printLadder(playerRepository, ladder, resultItems);

        LadderResult ladderResult = new LadderResult(playerRepository, ladder);

    }
}
