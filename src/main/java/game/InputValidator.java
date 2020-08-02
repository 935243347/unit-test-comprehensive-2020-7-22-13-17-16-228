package game;

import exception.InputNumberInvalidSymbolException;
import exception.InputNumberLengthInvalException;
import exception.InvalidInputNumberException;

import java.util.HashSet;

public class InputValidator {
    private final static int validLength = 4;

    public boolean validNumber(String inputNumber) throws InputNumberLengthInvalException, InputNumberInvalidSymbolException, InvalidInputNumberException {
        String number = inputNumber.replaceAll(" ", "");
        char[] inputNumberCharArray = number.toCharArray();
        validInputNumberLength(inputNumberCharArray);
        int[] intArry = converInputNumberToArray(inputNumberCharArray);
        return isNotIncludeRepeatNumbers(intArry);
    }

    private boolean isNotIncludeRepeatNumbers(int[] intArry) throws InvalidInputNumberException {
        HashSet<Integer> integerSet = new HashSet<>();
        for (int num : intArry) {
            integerSet.add(num);
        }
        if (integerSet.size() == validLength) {
            return true;
        }
        throw new InvalidInputNumberException();
    }

    private void validInputNumberLength(char[] inputNumberCharArray) throws InputNumberLengthInvalException {
        if (inputNumberCharArray.length != validLength) {
            throw new InputNumberLengthInvalException();
        }
    }

    private int[] converInputNumberToArray(char[] inputNumberCharArray) throws InputNumberInvalidSymbolException {
        int[] intArry = new int[validLength];
        validInputNumberIsAllNumberChar(inputNumberCharArray, intArry);
        return intArry;
    }

    private void validInputNumberIsAllNumberChar(char[] inputNumberCharArray, int[] intArry) throws InputNumberInvalidSymbolException {
        for (int index = 0; index < inputNumberCharArray.length; index++) {
            char num = inputNumberCharArray[index];
            if (Character.isDigit(num)) {
                intArry[index] = num - '0';
            } else {
                throw new InputNumberInvalidSymbolException();
            }
        }
    }

}
