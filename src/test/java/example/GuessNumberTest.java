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
        int[] guessNum = {1,2,3,4};
        //When
        String result = guessNumber.guess(answer, guessNum);

        //Then
        assertEquals("4A0B", result);


    }
}
