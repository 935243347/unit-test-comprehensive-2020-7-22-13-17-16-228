package game;

public class GuessNumber {
    private final int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    //todo function rename
    public String guess(int[] inputGuess) {
        //todo rename countANum to xxxxx
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
        //todo function
        return String.format("%sA%sB", countANum, countBNum);
    }
}
