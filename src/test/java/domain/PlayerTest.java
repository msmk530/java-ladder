package domain;

import exception.Player.LengthOfNameException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

class PlayerTest {
    Player player;

    @BeforeEach
    void setUp() {
        player = new Player("kim");
    }

    @Test
    void 생성자_테스트() {
        assertThat(player).isNotNull();
    }

    @Test
    void 이름_최대길이_예외발생_테스트() {
        assertThatExceptionOfType(LengthOfNameException.class)
                .isThrownBy(() -> new Player("kimminsub"));
    }

    @Test
    void 플레이어_당첨번호_매칭_테스트() {
        Map<String, Integer> gameResult= new HashMap<>();
        List<Integer> matchedItems = new ArrayList<>();

        matchedItems.add(500);

        Map<String, Integer> result = player.matchItemNumbers(gameResult,matchedItems,0);

        assertThat(result.get("kim")).isEqualTo(500);
    }
}