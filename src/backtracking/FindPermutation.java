package backtracking;
import java.util.Scanner;
public class FindPermutation {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your String: ");
            String str = sc.nextLine();
            findPermutation(str, "");

            System.out.println("All possible permutation of your String: " );

    }

    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);

            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(NewStr, ans+curr);
        }
    }
}
