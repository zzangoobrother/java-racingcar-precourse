package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarsTest {

    List<Car> cars = new ArrayList<>();

    @BeforeEach
    void befor() {
        cars.add(new Car("kim"));
        cars.add(new Car("choi"));
        cars.add(new Car("park"));
    }

    @Test
    void 중복된_이름_존재() {
        cars.add(new Car("kim"));

        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    new Cars(cars);
                });
    }

    @Test
    void 중복된_이름_미존재() {
        cars.add(new Car("lee"));
        cars.add(new Car("hong"));

        assertThat(new Cars(cars)).isNotNull();
    }
}
