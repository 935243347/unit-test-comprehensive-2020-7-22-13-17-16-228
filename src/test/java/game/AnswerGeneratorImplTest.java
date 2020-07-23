package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerGeneratorImplTest {
    @Test
    void should_answer_length_4_when_generate_given_iscalled() {
        AnswerGenerator answerGenerator = new AnswerGeneratorImpl();
        int[] result = answerGenerator.generate();
        assertEquals(4,result.length);
    }
}
