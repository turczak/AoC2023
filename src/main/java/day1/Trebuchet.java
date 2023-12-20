package day1;
import java.util.List;

public class Trebuchet {

    public int sumAllNumbersInFile(List<String> input){
        int sum = 0;
        for (String s:
             input) {
            sum+= twoDigitNumberFromString(s);
        }
        return sum;
    }

    private int twoDigitNumberFromString(String word){
        int a = 0, b = 0, temp;
        boolean isAexists = false;
        boolean isBexists = false;
        for (char c:
             word.toCharArray()) {
            if(Character.isDigit(c)){
                temp = Integer.parseInt(String.valueOf(c));
                if(!isAexists){
                    a = temp;
                    isAexists = true;
                }else {
                    b = temp;
                    isBexists = true;
                }
            }
        }
        if(!isBexists) b = a;

        StringBuilder sb = new StringBuilder().append(a).append(b);
        return Integer.parseInt(sb.toString());
    }
}
