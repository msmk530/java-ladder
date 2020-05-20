package controller;

import domain.Ladder;
import domain.LadderCreator;
import domain.PlayerRepository;
import domain.ResultItems;
import view.InputView;

public class LadderGame {
    public void run() {
        PlayerRepository playerRepository = InputView.inputPlayersName();
        ResultItems resultItems = InputView.inputResultItems(playerRepository.getNumberOfPlayers());
        int ladderHeight = InputView.inputLadderHeight();

        Ladder ladder = LadderCreator.createLadder(playerRepository, ladderHeight);

    }
}
