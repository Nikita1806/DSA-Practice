package Strings;
import java.util.Scanner;
public class StringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        System.out.print("Enter Your String: ");           //Here R != r , it will treat Lower Case and Upper Case Differently.
        input = sc.nextLine();

        boolean isPalindrome = stringPalindrome(input);

        if(isPalindrome){
            System.out.println("Your Given String Is Palindrome. ");
        }else{
            System.out.println("Your Given String Is NOT Palindrome. ");
        }

    }

    public static boolean stringPalindrome(String input){
        int n = input.length();
        for(int i = 0; i<n/2; i++){
            if(input.charAt(i) != input.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
