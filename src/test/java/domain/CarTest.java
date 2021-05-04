package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    public void 자동차_이름_길이_1이상_5이하() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    new Car("abcdef");
                    new Car("");
                });
    }

    @Test
    public void 자동차_전진() {
        Car car = new Car("hong", 6);
        car.move();
        assertThat(car.getForwardNumber()).isEqualTo(7);
    }
}
