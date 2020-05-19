package domain;

import exception.Item.LengthOfItemException;
import exception.Player.LengthOfNameException;
import org.junit.jupiter.api.Test;
import util.ChangeStringToList;

import static org.assertj.core.api.Assertions.*;

class ResultItemsTest {
    @Test
    void 생성자_테스트(){
        ResultItems resultItems = new ResultItems(ChangeStringToList.changeStringToList("kim,min,sub"),3);

        assertThat(resultItems).isNotNull();
    }

}