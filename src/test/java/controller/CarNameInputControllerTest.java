package controller;

import domain.Car;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    public void 자동차_객체_To_Cars() {
        String carName = "pobi,crong,honux";

        CarNameInputController carNameInputController = new CarNameInputController();

        List<Car> cars = carNameInputController.carsCreate(carName);

        assertThat(cars.get(0).getName()).isEqualTo("pobi");
        assertThat(cars.get(1).getName()).isEqualTo("crong");
        assertThat(cars.get(2).getName()).isEqualTo("honux");
    }

}
