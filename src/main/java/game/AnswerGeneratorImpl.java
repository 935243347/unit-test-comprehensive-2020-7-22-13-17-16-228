package game;

import java.util.*;

public class AnswerGeneratorImpl implements AnswerGenerator {
    @Override
    public int[] generate() {
        int[] answer = new int[4];
        List<Integer> numberList = new ArrayList<>();
        for (int num = 0; num < 10; num++) {
            numberList.add(num);
        }
        Collections.shuffle(numberList);
        for(int index = 0; index < 4; index++){
            answer[index] = numberList.get(index);
        }
        return answer;
    }
}
