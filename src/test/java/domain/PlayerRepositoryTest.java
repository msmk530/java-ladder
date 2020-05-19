package domain;

import org.junit.jupiter.api.Test;
import util.ChangeStringToList;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class PlayerRepositoryTest {
    @Test
    void 생성자_테스트() {
        String names = "kim,min,sub";
        List<String> playersName = ChangeStringToList.changeStringToList(names);
        List<Player> players = new ArrayList<>();

        for (String player : playersName) {
            players.add(new Player(player));
        }

        PlayerRepository playerRepository = new PlayerRepository(players);
        assertThat(playerRepository.checkPlayers(players)).isTrue();
    }

}