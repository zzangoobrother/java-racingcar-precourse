package controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarNameInputControllerTest {

    @Test
    public void 자동차_이름_쉼표_구분() {
        String carName = "pobi,crong,honux";

        CarNameInputController carNameInputController = new CarNameInputController();

        String[] divideName = carNameInputController.divideName(carName);

        assertThat(divideName[0]).isEqualTo("pobi");
        assertThat(divideName[1]).isEqualTo("crong");
        assertThat(divideName[2]).isEqualTo("honux");
    }

}
