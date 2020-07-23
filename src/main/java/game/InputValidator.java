package game;

import java.util.HashSet;

public class InputValidator {
    public boolean valid(String inputNumber) {
        String number = inputNumber.replaceAll(" ", "");
        char[] inputNumberCharArray = number.toCharArray();
        if(inputNumberCharArray.length == 4) {
            int[] intArry = new int[4];
            for (int i = 0; i < inputNumberCharArray.length; i++) {
                intArry[i] = inputNumberCharArray[i] - '0';
            }
            HashSet<Integer> integerSet = new HashSet<Integer>();
            for(int j: intArry){
                integerSet.add(j);
            }
            if(integerSet.size() == 4){
                return true;
            }
        }
        System.out.println("Wrong Input，Input again");
        return false;
    }
}
