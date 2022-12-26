import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAdderCalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @DisplayName("빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.")
    @ValueSource(strings = {"", "  "})
    public void empty(String input) {
        assertThat(calculator.calculate(input)).isEqualTo(0);
    }

    @ParameterizedTest
    @DisplayName(" 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.")
    @ValueSource(strings = {"1", "24"})
    public void singleInteger(String input) {
        assertThat(calculator.calculate(input)).isEqualTo(Integer.parseInt(input));
    }

    
}

