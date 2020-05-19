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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerRepository that = (PlayerRepository) o;
        return Objects.equals(players, that.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(players);
    }
}
