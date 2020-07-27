package game;

public class GuessNumber {
    private final int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        int countANum = 0;
        int countBNum = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == inputGuess[index]) {
                countANum++;
                continue;
            }
            for (int guessNum : inputGuess) {
                if (answer[index] == guessNum) {
                    countBNum++;
                    break;
                }
            }
        }
        return String.format("%sA%sB", countANum, countBNum);
    }
}
