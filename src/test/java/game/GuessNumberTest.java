package game;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        //Given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {1,2,3,4};

        //When
        String result = guessNumber.countGuessNumber(inputGuess);

        //Then
        assertEquals("4A0B", result);
    }
    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_input_guess_4321(){
        //Given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {4,3,2,1};

        //When
        String result = guessNumber.countGuessNumber(inputGuess);

        //Then
        assertEquals("0A4B", result);
    }
    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678(){
        //Given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {5,6,7,8};

        //When
        String result = guessNumber.countGuessNumber(inputGuess);

        //Then
        assertEquals("0A0B", result);
    }
    @Test
    void should_return_0A2B_when_guess_given_answer_1234_and_input_guess_3456(){
        //Given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {3,4,5,6};

        //When
        String result = guessNumber.countGuessNumber(inputGuess);

        //Then
        assertEquals("0A2B", result);
    }
    @Test
    void should_return_2A2B_when_guess_given_answer_1234_and_input_guess_4231(){
        //Given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {4,2,3,1};

        //When
        String result = guessNumber.countGuessNumber(inputGuess);

        //Then
        assertEquals("2A2B", result);
    }
    @Test
    void should_return_2A1B_when_guess_given_answer_1234_and_input_guess_1245(){
        //Given
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {1,2,4,5};

        //When
        String result = guessNumber.countGuessNumber(inputGuess);

        //Then
        assertEquals("2A1B", result);
    }
}
