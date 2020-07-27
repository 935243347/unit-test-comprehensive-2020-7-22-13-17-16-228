package game;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

//todo inputValidatorTest
public class AnswerGeneratorImplTest {
    @Test
    void should_answer_length_4_when_generate_given_iscalled() {
        AnswerGenerator answerGenerator = new AnswerGeneratorImpl();
        int[] result = answerGenerator.generate();
        assertEquals(4,result.length);
    }
    @Test
    void should_uncontain_repeat_number_when_generate_given_iscalled() {
        AnswerGenerator answerGenerator = new AnswerGeneratorImpl();
        //todo create function
        for(int i = 0; i < 10; i++){
            int[] result = answerGenerator.generate();
            HashSet<Integer> integerSet = new HashSet<>();
            for(int j: result){
                integerSet.add(j);
            }
            assertEquals(4,integerSet.size());
        }
    }
}
