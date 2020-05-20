package controller;

import domain.PlayerRepository;
import domain.ResultItems;
import view.InputView;

public class LadderGame {
    public void run() {
        PlayerRepository playerRepository = InputView.inputPlayersName();
        ResultItems resultItems = InputView.inputResultItems(playerRepository.getNumberOfPlayers());
        int ladderHeight = InputView.inputLadderHeight();

    }
}
