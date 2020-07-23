package example;

import game.GuessNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        //Given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1,2,3,4};
        int[] inputGuess = {1,2,3,4};

        //When
        String result = guessNumber.guess(answer, inputGuess);

        //Then
        assertEquals("4A0B", result);
    }
    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_input_guess_4321(){
        //Given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1,2,3,4};
        int[] inputGuess = {4,3,2,1};

        //When
        String result = guessNumber.guess(answer, inputGuess);

        //Then
        assertEquals("0A4B", result);
    }
    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678(){
        //Given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1,2,3,4};
        int[] inputGuess = {5,6,7,8};

        //When
        String result = guessNumber.guess(answer, inputGuess);

        //Then
        assertEquals("0A0B", result);
    }
}
