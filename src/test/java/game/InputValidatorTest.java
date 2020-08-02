package game;

import exception.InputNumberInvalidSymbolException;
import exception.InputNumberLengthInvalException;
import exception.InvalidRepeatInputNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputValidatorTest {
    @Test
    void should_return_true_when_valid_given_input_number_1567() throws InvalidRepeatInputNumberException, InputNumberLengthInvalException, InputNumberInvalidSymbolException {
        InputValidator inputValidator = new InputValidator();
        inputValidator.validNumber("1 5 6 7");
    }
    @Test
    void should_return_false_when_valid_given_input_number_1566(){
        InputValidator inputValidator = new InputValidator();
        assertThrows(InvalidRepeatInputNumberException.class, () -> inputValidator.validNumber("1 5 6 6"));
    }
    @Test
    void should_return_false_when_valid_given_input_number_15676(){
        InputValidator inputValidator = new InputValidator();
        assertThrows(InputNumberLengthInvalException.class, () -> inputValidator.validNumber("1 5 6 7 6"));
    }
    @Test
    void should_return_false_when_valid_given_input_number_1567a(){
        InputValidator inputValidator = new InputValidator();
        assertThrows(InputNumberLengthInvalException.class, () -> inputValidator.validNumber("1 5 6 7 a"));
    }
    @Test
    void should_return_false_when_valid_given_input_number_156a(){
        InputValidator inputValidator = new InputValidator();
        assertThrows(InputNumberInvalidSymbolException.class, () -> inputValidator.validNumber("1 5 6 a"));
    }
    @Test
    void should_return_false_when_valid_given_input_number_negative_1567(){
        InputValidator inputValidator = new InputValidator();
        assertThrows(InputNumberLengthInvalException.class, () -> inputValidator.validNumber("-1 5 6 7"));
    }
    @Test
    void should_return_false_when_valid_given_input_number_56710(){
        InputValidator inputValidator = new InputValidator();
        assertThrows(InputNumberLengthInvalException.class, () -> inputValidator.validNumber("5 6 7 10"));
    }
    @Test
    void should_return_false_when_valid_given_input_number_567null(){
        InputValidator inputValidator = new InputValidator();
        assertThrows(InputNumberLengthInvalException.class, () -> inputValidator.validNumber("5 6 7 null"));
    }
    @Test
    void should_return_false_when_valid_given_input_number_negative_157(){
        InputValidator inputValidator = new InputValidator();
        assertThrows(InputNumberInvalidSymbolException.class, () -> inputValidator.validNumber("-1 5 7"));
    }
}
