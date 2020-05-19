package domain;

import exception.Player.LengthOfNameException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
    void 이름_5글자_초과시_예외발생_테스트() {
        assertThatExceptionOfType(LengthOfNameException.class)
                .isThrownBy(() -> Validator.isValidName("kimminsub"));
    }
}