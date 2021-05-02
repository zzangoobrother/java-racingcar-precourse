package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    public void 자동차_이름_공백() {
        Car car = new Car("");
        assertThat(car.getName().isEmpty()).isTrue();
    }
}
