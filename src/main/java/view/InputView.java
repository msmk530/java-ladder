package view;

import domain.Player;
import domain.PlayerRepository;
import util.ChangeStringToList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.OutputView.printErrorMessage;
import static view.OutputView.printMessage;

public class InputView {
    private static final String DEMAND_NAMES = "참여할 사람 이름을 입력하세요. (이름은 쉼표로 구분해주세요)";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static PlayerRepository inputPlayersName() {
        try {
            printMessage(DEMAND_NAMES);
            List<Player> players = new ArrayList<>();
            List<String> names = ChangeStringToList.changeStringToList(SCANNER.nextLine());

            for (String name : names) {
                players.add(new Player(name));
            }

            return new PlayerRepository(players);
        } catch (Exception e) {
            printErrorMessage(e.getMessage());
            return inputPlayersName();
        }
    }

}
