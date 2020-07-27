package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InputValidatorTest {
    @Test
    void should_return_true_when_valid_given_input_number_1567() {
        InputValidator inputValidator = new InputValidator();
        boolean valid = inputValidator.validNumber("1 5 6 7");
        assertTrue(valid);
    }
    @Test
    void should_return_true_when_valid_given_input_number_1566() {
        InputValidator inputValidator = new InputValidator();
        boolean valid = inputValidator.validNumber("1 5 6 6");
        assertFalse(valid);
    }
    @Test
    void should_return_true_when_valid_given_input_number_15676() {
        InputValidator inputValidator = new InputValidator();
        boolean valid = inputValidator.validNumber("1 5 6 7 6");
        assertFalse(valid);
    }
    @Test
    void should_return_true_when_valid_given_input_number_1567a() {
        InputValidator inputValidator = new InputValidator();
        boolean valid = inputValidator.validNumber("1 5 6 7 a");
        assertFalse(valid);
    }
    //todo: -1   10  null
}
