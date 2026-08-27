package Strings;
import java.util.Scanner;
public class CharAtFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String start = "Start";
        System.out.println(start.charAt(4));

        String ready = "Ready";
        //System.out.println(ready.charAt(5));        -----> will show error of StringIndexOutOfBoundException

        String fullSentence;
        System.out.print("Enter your string: ");
        fullSentence = sc.nextLine();

        printingEachLetters(fullSentence);

    }

    public static void printingEachLetters(String sentence){
        for(int i = 0; i<sentence.length(); i++){
            System.out.print(sentence.charAt(i) + " ");
        }
    }
}
