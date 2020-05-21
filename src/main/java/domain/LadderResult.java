package domain;

import java.util.*;

public class LadderResult {
    private static final int START_POINT = 0;

    private final Map<String, Integer> gameResult;

    public LadderResult(PlayerRepository playerRepository, Ladder ladder) {
        List<Integer> matchedItems = ladder.playLadderGame(playerRepository);

        this.gameResult = matchPlayerToItem(playerRepository, matchedItems);
    }

    private Map<String, Integer> matchPlayerToItem(PlayerRepository playerRepository, List<Integer> matchedItems) {
        int point = START_POINT;
        Map<String, Integer> result = new LinkedHashMap<>();
        List<Player> players = playerRepository.getPlayers();

        for (Player player : players) {
            result = player.matchItem(result, matchedItems, point);
            point++;
        }

        return result;
    }

    public Map<String, Integer> getGameResult() {
        return Collections.unmodifiableMap(gameResult);
    }
}
