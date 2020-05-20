package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class LineTest {
    private Line line;
    private List<Boolean> lineMembers;

    @BeforeEach
    void setUp() {
        lineMembers = new ArrayList<>();

        lineMembers.add(true);
        lineMembers.add(false);

        line = new Line(lineMembers);
    }

    @Test
    void 생성자_테스트() {
        assertThat(line.getLine().containsAll(lineMembers)).isTrue();
    }

    @Test
    void 해당_포인트에서_수평선_있는경우() {
        //given
        int point = 0;
        //when
        assertThat(line.checkHorizonFlag(point)).isTrue();
        //then
    }

    @Test
    void 해당_포인트에서_수평선_없는경우() {
        //given
        int point = 1;
        //when
        assertThat(line.checkHorizonFlag(point)).isFalse();
        //then
    }
}