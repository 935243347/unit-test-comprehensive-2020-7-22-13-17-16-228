package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InputValidatorTest {
    @Test
    void should_return_true_when_valid_given_input_number_1567() {
        InputValidator inputValidator = new InputValidator();
        boolean valid = inputValidator.valid("1567");
        assertTrue(valid);
    }
}
