package game;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        int countANum = 0;
        int countBNum = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == inputGuess[i]) {
                countANum++;
                continue;
            }
            for (int guessNum : inputGuess) {
                if (answer[i] == guessNum) {
                    countBNum++;
                    break;
                }
            }
        }
        return String.format("%sA%sB", countANum, countBNum);
    }
}
