package domain;

import exception.Item.CountOfItemsException;
import exception.Item.LengthOfItemException;
import exception.Player.LengthOfNameException;
import org.junit.jupiter.api.Test;
import util.ChangeStringToList;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
    void 참가자_이름_5글자_초과시_예외발생_테스트() {
        assertThatExceptionOfType(LengthOfNameException.class)
                .isThrownBy(() -> Validator.isValidName("kimminsub"));
    }

    @Test
    void 결과항목_개수_예외발생_테스트() {
        assertThatExceptionOfType(CountOfItemsException.class)
                .isThrownBy(() ->
                        Validator.checkResultItems(ChangeStringToList.changeStringToList("one,two,three"), 4));
    }

    @Test
    void 결과항목_이름_최소글자_예외발생_테스트() {
        assertThatExceptionOfType(LengthOfItemException.class)
                .isThrownBy(() ->
                        Validator.checkResultItems(ChangeStringToList.changeStringToList(",two,three"), 3));
    }
}