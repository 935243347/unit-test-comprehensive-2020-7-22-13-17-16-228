package game;

import java.util.HashSet;

public class InputValidator {
    //todo rename
    public boolean validNumber(String inputNumber) {
        String number = inputNumber.replaceAll(" ", "");
        char[] inputNumberCharArray = number.toCharArray();
        if(inputNumberCharArray.length == 4) {
            int[] intArry = new int[4];
            for (int index = 0; index < inputNumberCharArray.length; index++) {
                intArry[index] = inputNumberCharArray[index] - '0';
            }
            HashSet<Integer> integerSet = new HashSet<>();
            for(int num: intArry){
                integerSet.add(num);
            }
            if(integerSet.size() == 4){
                return true;
            }
        }
        System.out.println("Wrong Input，Input again");
        return false;
    }
}
