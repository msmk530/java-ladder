package domain;

import java.util.List;
import java.util.Objects;

public class PlayerRepository {
    private final List<Player> players;

    public PlayerRepository(List<Player> players) {
        this.players = players;
    }

    public boolean checkPlayers(List<Player> target) {
        return target.equals(players);
    }

    public int getNumberOfPlayers() {
        return players.size();
    }

}
