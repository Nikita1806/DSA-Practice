package Strings;
import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String str = sc.nextLine();

        System.out.print("Enter your Starting Index for SubString: ");
        int si = sc.nextInt();
        if(si>str.length()){
            System.out.println("Please Enter a valid Input. ");
            return;
        }

        System.out.print("Enter your Ending Index for SubString: ");
        int ei = sc.nextInt();
        if(ei>str.length()){
            System.out.println("Please enter a valid Input. ");
            return;
        }

          String result = subStrings(str, si, ei);

        System.out.println("Your SubString is " + result);
    }

    public static String subStrings(String s1, int si, int ei){
        String subStr = "";
        for(int i = si; i<ei; i++){
            subStr += s1.charAt(i);
        }
        return subStr;
    }
}
