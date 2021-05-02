package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarTest {

    @Test
    public void 자동차_이름_길이_1이상_5이하() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    new Car("abcdef");
                    new Car("");
                });
    }
}
