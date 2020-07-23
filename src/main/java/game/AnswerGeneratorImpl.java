package game;

import java.util.HashSet;

public class AnswerGeneratorImpl implements AnswerGenerator{
    @Override
    public int[] generate() {
        int[] answer = new int[4];
        HashSet<Integer> integerSet = new HashSet<Integer>();
        while(true){
            int randomNum = (int) (Math.random() * 10);
            integerSet.add(randomNum);
            if(integerSet.size()==4){
                break;
            }
        }
        Object[] objects = integerSet.toArray();
        for(int i = 0; i < objects.length; i++){
            answer[i]=(int)objects[i];
        }
        return answer;
    }
}
