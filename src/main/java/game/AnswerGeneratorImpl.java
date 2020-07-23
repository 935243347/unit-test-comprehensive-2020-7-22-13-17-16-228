package game;

public class AnswerGeneratorImpl implements AnswerGenerator{
    @Override
    public int[] generate() {
        int[] answer = new int[4];
        for(int i = 0; i < 4; i++){
            int randomNum = (int) (Math.random() * 10);
            answer[i]=randomNum;
        }
        return answer;
    }
}
