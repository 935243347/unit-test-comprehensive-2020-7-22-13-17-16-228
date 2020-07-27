package game;



import java.util.HashSet;
import java.util.regex.Pattern;

public class InputValidator {
    public boolean validNumber(String inputNumber) {
        String number = inputNumber.replaceAll(" ", "");
        char[] inputNumberCharArray = number.toCharArray();
        if(inputNumberCharArray.length != 4) {
            System.out.println("Wrong Input，Input again");
            return false;
        }
        int[] intArry = new int[4];
        for (int index = 0; index < inputNumberCharArray.length; index++) {
            char num = inputNumberCharArray[index];
            if(Character.isDigit(num)){
                intArry[index] = num - '0';
            } else {
                System.out.println("Wrong Input，Input again");
                return false;
            }
        }
        HashSet<Integer> integerSet = new HashSet<>();
        for(int num: intArry){
            integerSet.add(num);
        }
        if(integerSet.size() == 4){
            return true;
        }
        System.out.println("Wrong Input，Input again");
        return false;
    }
    public static boolean isInteger(String str) {

        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");

        return pattern.matcher(str).matches();

    }
}
