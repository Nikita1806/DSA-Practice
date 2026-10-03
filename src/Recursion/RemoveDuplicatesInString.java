package Recursion;
import java.util.Scanner;
public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String str = sc.nextLine();

        //removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);            //For Method 1
        removeDuplicatesMeth2(str, 0, new StringBuilder());
    }

    //this solution is for lowerCase only....for Strings including UpperCase or symbols we will need to use HashMap

    public static void removeDuplicates(String str, int i, StringBuilder newStr, boolean[] map){
        if(i == str.length()){
            System.out.println("Modified String: " + newStr);
            return;
        }

        char currChar = str.charAt(i);
        if(map[currChar-'a'] == true){
            removeDuplicates(str, i+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, i+1, newStr.append(currChar), map);
        }
    }

    public static void removeDuplicatesMeth2(String str, int i, StringBuilder newStr){
        if(i == str.length()){
            System.out.println("Modified String: " + newStr);
            return;
        }

        char currChar = str.charAt(i);

        if(newStr.indexOf(String.valueOf(currChar)) == -1){
            newStr.append(currChar);
        }

        removeDuplicatesMeth2(str, i+1, newStr);
    }
}
