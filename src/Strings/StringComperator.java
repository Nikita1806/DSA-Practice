package Strings;
import java.util.Scanner;
public class StringComperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      //  System.out.print("Enter First String: ");  as the entered string will also be treated as new Object.
        String s1 = "Tony Stark";

       // System.out.print("Enter Second String: ");
        String s2 = "Tony Stark";

      //  System.out.print("Enter Third String: ");
        String s3 = new String("Tony Stark");

        stringComparison(s1,s2,s3);

    }

    public static void stringComparison(String s1,String s2,String s3){
        if(s1 == s2){
            System.out.println("Strings are Equal.");
        }else{
            System.out.println("Strings are not Equal.");
        }

        if(s2 == s3){
            System.out.println("Strings are Equal.");
        }else{
            System.out.println("Strings are not Equal.");
        }

        if(s1 == s3){
            System.out.print("Strings are Equal.");
        }else{
            System.out.print("Strings are not Equal.");
        }
    }
}
