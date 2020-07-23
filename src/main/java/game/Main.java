package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnswerGeneratorImpl answerGenerator = new AnswerGeneratorImpl();
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        InputValidator inputValidator = new InputValidator();
        for(int i = 0; i < 6; i++) {
            Scanner sc = new Scanner(System.in);
            String inputNumberString = sc.nextLine();
            boolean valid = inputValidator.valid(inputNumberString);
            if (valid) {
                String number = inputNumberString.replaceAll(" ", "");
                char[] inputNumberCharArray = number.toCharArray();
                int[] inputNumber = new int[4];
                for (int j = 0; j < inputNumberCharArray.length; j++) {
                    inputNumber[j] = inputNumberCharArray[j] - '0';
                }
                System.out.println(guessNumber.guess(inputNumber));
            }
        }
    }
}
