package Task_7;
import java.lang.Character;
import java.util.Scanner;
interface Function {
    int analyse (String str);
}

class LowerLettersCount implements Function {
    @Override
    public int analyse(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)) && str.charAt(i) == Character.toLowerCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
class UpperLettersCount implements Function {
    @Override
    public int analyse(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)) && str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
public class Analysis {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        LowerLettersCount lower = new LowerLettersCount();
        UpperLettersCount upper = new UpperLettersCount();

        System.out.println("Input some text:");
        String userInput = in.nextLine();

        System.out.println("Count of lower letters: " + lower.analyse(userInput));
        System.out.println("Count of upper letters: " + upper.analyse(userInput));
    }
}
