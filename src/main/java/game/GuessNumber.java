package game;

public class GuessNumber {
    private final int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    //todo function rename
    public String guess(int[] inputGuess) {
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
        //todo function
        return String.format("%sA%sB", correctPositionAndNumberCount, correctNumberWrongPosition);
    }
}
