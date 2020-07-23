package game;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        int countA = 0;
        int countB = 0;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == inputGuess[i]){
                countA++;
                continue;
            }
            for(int j = 0; j < inputGuess.length; j++){
                if(answer[i] == inputGuess[j]){
                    countB++;
                    break;
                }
            }
        }
        String result = countA+"A"+countB+"B";
        return result;
    }
}
