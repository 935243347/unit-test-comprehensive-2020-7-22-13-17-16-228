package game;

public class GuessNumber {
    private final int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String countGuessNumber(int[] inputGuess) {
        int correctPositionAndNumberCount = 0;
        int correctNumberWrongPosition = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == inputGuess[index]) {
                correctPositionAndNumberCount++;
                continue;
            }
            for (int guessNum : inputGuess) {
                if (answer[index] == guessNum) {
                    correctNumberWrongPosition++;
                    break;
                }
            }
        }
        return formatResultNumber(correctPositionAndNumberCount, correctNumberWrongPosition);
    }

    private String formatResultNumber(int correctPositionAndNumberCount, int correctNumberWrongPosition) {
        return String.format("%sA%sB", correctPositionAndNumberCount, correctNumberWrongPosition);
    }
}
