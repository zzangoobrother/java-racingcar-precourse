package controller;

import domain.Attemp;
import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingControllerTest {

    @Test
    public void 많이_전진한값() {
        RacingController racingController = new RacingController();
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("pobi", 5));
        carList.add(new Car("crong", 7));
        carList.add(new Car("honux", 4));

        assertThat(racingController.getMaxForward(carList)).isEqualTo(7);
    }

}
