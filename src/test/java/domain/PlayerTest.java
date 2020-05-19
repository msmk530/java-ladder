package domain;

import exception.Player.LengthOfNameException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PlayerTest {
    @Test
    void 생성자_테스트() {
        Player player = new Player("kim");
        assertThat(player).isNotNull();
    }

    @Test
    void 이름_최대길이_예외발생_테스트() {
        assertThatExceptionOfType(LengthOfNameException.class)
                .isThrownBy(() -> new Player("kimminsub"));
    }
}