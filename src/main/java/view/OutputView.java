package view;

import domain.*;

import java.util.List;

public class OutputView {
    private static final String HORIZON_LINE = "-----";
    private static final String VERTICAL_LINE = "|";
    private static final String SPACE = "     ";

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printErrorMessage(String message) {
        System.err.println(message);
    }

    public static void printLadder(PlayerRepository playerRepository, Ladder ladder, ResultItems resultItems) {
        printMessage("사다리 결과");
        printPlayers(playerRepository);
        printLadder(ladder);
        printResultItmes(resultItems);
    }

    private static void printPlayers(PlayerRepository playerRepository) {
        for (Player player : playerRepository.getPlayers()) {
            System.out.printf("%6s", player.getName());
        }

        System.out.println();
    }

    private static void printLadder(Ladder ladder) {
        for (int i = 0; i < ladder.getHeight(); i++) {
            printOneLine(ladder.getLine(i));
            System.out.println();
        }
    }

    private static void printOneLine(Line line) {
        System.out.print(SPACE);

        for (int i = 0; i < line.getLine().size(); i++) {
            System.out.print(VERTICAL_LINE);
            if (!line.getLine().get(i)) {
                System.out.print(SPACE);
            } else {
                System.out.print(HORIZON_LINE);
            }
        }
    }

    private static void printResultItmes(ResultItems resultItems) {
        for (String item : resultItems.getItems()) {
            System.out.printf("%6s", item);
        }

        System.out.println();
    }
}
