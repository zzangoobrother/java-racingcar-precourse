package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AttemptTest {

    @Test
    public void 시도횟수_정수이외_문자_입력() {
        assertThatThrownBy(() -> new Attemp("a"))
                .isInstanceOf(NumberFormatException.class)
                .hasStackTraceContaining("NumberFormatException");
    }
}
